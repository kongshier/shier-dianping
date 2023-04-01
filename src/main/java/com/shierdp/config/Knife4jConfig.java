package com.shierdp.config;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebFlux;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

/**
 * @author Shier
 * @date 2023/02/02
 * 自定义 Swagger 接口文档的配置
 */

@Configuration
@EnableSwagger2WebMvc
@Profile({"dev", "test"})   //版本控制访问
public class Knife4jConfig {
    @Bean(value = "defaultApi2")
    public Docket defaultApi2() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                // 这里一定要标注你控制器的位置
                .apis(RequestHandlerSelectors.basePackage("com.shierdp.controller"))
                .paths(PathSelectors.any())
                .build();
    }
    /**
     * api 信息
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("畅享旅途接口文档") // 接口文档的标题
                .description("畅享旅途店铺、优惠卷、用户的接口信息") // 接口文档的描述信息
                .termsOfServiceUrl("https://github.com/kongshier") // 提供服务的是谁？可以填写你自己的地址因为是你自己提供的服务
                .contact(new Contact("shier", "https://blog.csdn.net/qq_56098191", "2927527234@qq.com"))
                .version("1.0") // 版本
                .build(); // 构建
    }
}

