package com.reckey.security;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket apiV1() {
		
		String version = "v.1.0";
		String title = "Reckey API_"+version;
		
		return new Docket(DocumentationType.SWAGGER_2)
				.useDefaultResponseMessages(false)
				.consumes(getConsumeContentTypes())
				.produces(getProduceContentTypes())
				.apiInfo(apiInfo(title, version))
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.reckey.controller"))
				.paths(PathSelectors.ant("/reckey/**"))
				.build();
						
	}
	
	private ApiInfo apiInfo(String title, String version) {
		return new ApiInfoBuilder()
				.title("Reckey API")
				.description("Reckey API 페이지입니다.")
				.version("1.0")
				.build();
	}
	
	private Set<String> getConsumeContentTypes(){
		Set<String> consumes = new HashSet<>();
		consumes.add("application/json;charset=UTF-8");
		consumes.add("application/x-www-form-urlencoded");
		return consumes;
	}
	
	private Set<String> getProduceContentTypes(){
		Set<String> produces = new HashSet<>();
		produces.add("application/json;charset=UTF-8");
		return produces;
	}
}
