package com.hannStar.restful.config;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
    public Docket docket() {
//        List<Parameter> parameterList = new ArrayList<>();
//        parameterList.add(new ParameterBuilder().name(SecurityConfig.AUTH_HEADER).description("請輸入JWT")
//                .modelRef(new ModelRef("string")).parameterType("header").required(false).build());

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(this.apiInfo())
//                .globalOperationParameters(parameterList)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.hannStar.restful.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("HannStarWearApi-restful RestApi")
                .contact(new Contact("Tom", "", ""))
                .version("v1")
//                .description(getVersionInfo())
                .build();
    }

//    private String getVersionInfo() {
//        return "Active profile: " + profile + "\nGit branch: " + branch + "\nGit commit id: " + commitId;
//    }

}
