package cn.com.taiji.rest.config;

import cn.com.taiji.common.config.Global;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger2的接口配置
 *
 * @author wudx
 */
@Configuration
@EnableSwagger2
//@ComponentScan(basePackages = {"comxxx.xxx.controller" })
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("cn.com.taiji.rest.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * 添加摘要信息
     */
    private ApiInfo apiInfo() {
        // 用ApiInfoBuilder进行定制
        return new ApiInfoBuilder()
                .title("标题：TAI系统_接口文档")
                .description("描述：用于管理及显示接口文档...")
                .contact(new Contact(Global.getName(), null, null))
                .version("版本号:" + Global.getVersion())
                .build();
    }

}
