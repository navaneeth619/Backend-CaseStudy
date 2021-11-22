package com.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
public class SpringBootCaseStudyApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(SpringBootCaseStudyApplication.class).properties("spring.config.name:application-dev").build().run(args);
		//SpringApplication.run(SpringBootCaseStudyApplication.class, args);
	}

}
