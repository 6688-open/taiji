package cn.com.taiji;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 启动程序
 *
 * @author wudx
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan("cn.com.taiji.*.mapper")
//开启定时
@EnableScheduling
public class TaiCSApplication {



    public static void main(String[] args) {
        SpringApplication.run(TaiCSApplication.class, args);
    }
}