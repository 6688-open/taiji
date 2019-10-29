package cn.com.taiji.framework.config;

import cn.com.taiji.common.enums.DataSourceType;
import cn.com.taiji.framework.datasource.DynamicDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class HikariCPConfig {

    private Logger logger = LoggerFactory.getLogger(HikariCPConfig.class);

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.master")
    public DataSource masterDataSource() {
        logger.info("HikariCP master Database Connection Pool Creation.......");
        return DataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties("spring.datasource.slave")
    @ConditionalOnProperty(prefix = "spring.datasource.slave", name = "enabled", havingValue = "true")
    public DataSource slaveDataSource() {
        logger.info("HikariCP slave Database Connection Pool Creation.......");
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "dynamicDataSource")
    @Primary
    public DynamicDataSource dataSource(DataSource masterDataSource, DataSource slaveDataSource) {
        Map<Object, Object> targetDataSources = new HashMap<>();
        targetDataSources.put(DataSourceType.MASTER.name(), masterDataSource);
        targetDataSources.put(DataSourceType.SLAVE.name(), slaveDataSource);
        return new DynamicDataSource(masterDataSource, targetDataSources);
    }
}
