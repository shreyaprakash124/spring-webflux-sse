package com.flolabs.webfluxsse.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * Customization of swagger configuration
 * 
 *
 */
@Component
public class SwaggerDocumentationConfig {
	 @Bean
	 ApiInfo apiInfo() {
	        return new ApiInfoBuilder()
	            .title("Spring web flux and SSE")
	            .description("Spring web flux and SSE")
	            .termsOfServiceUrl("")
	            .version("1.0.0")
	            .contact(new Contact("","", ""))
	            .build();
	    }

	    @Bean
	    public Docket customImplementation(){
	        return new Docket(DocumentationType.SWAGGER_2)
	                .select()
	                    .apis(RequestHandlerSelectors.any())
	                    .build().apiInfo(apiInfo())
				.tags(new Tag("Notification", "APIS for handling notification details"));
                              }

}
