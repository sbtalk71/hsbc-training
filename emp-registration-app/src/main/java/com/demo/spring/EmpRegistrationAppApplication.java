package com.demo.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
public class EmpRegistrationAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpRegistrationAppApplication.class, args);
	}
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/pages/");
		vr.setSuffix(".jsp"); // /WEB-INF/pages/+test+.jsp=/jsp/test.jsp
		return vr;
	}

}
