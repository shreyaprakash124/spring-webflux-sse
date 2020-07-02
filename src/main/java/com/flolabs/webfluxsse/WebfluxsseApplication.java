package com.flolabs.webfluxsse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@ComponentScan
@SpringBootApplication
@EnableSwagger2
public class WebfluxsseApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebfluxsseApplication.class, args);
	}

}
