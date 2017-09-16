package com.vinicius.pos.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class BibliotecaConfigSwegger {
	
	@Bean
	public Docket bibliotecaApi() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com.vinicius.pos.resources")).build().apiInfo(metaData());
	}
	
	
	private ApiInfo metaData() {
		ApiInfo apiInfo = new 
				ApiInfo("Biblioteca-API", 
						"Serviços para bibliotecas", 
						"1.0", 
						"www.termodeservico.com", 
						new Contact("Vinicius Gomes", "www.viniciusgomes.com", "sued2006@gmail.com"), 
						"Condição de uso da licença", 
						"www.urldalicensa.com");
				
		return apiInfo;		
	}

}
