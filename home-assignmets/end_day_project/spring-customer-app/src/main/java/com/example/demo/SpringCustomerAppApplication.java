package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.dao.CustomerDao;
import com.example.demo.dao.CustomerDaoJdbcImpl;

@SpringBootApplication
public class SpringCustomerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCustomerAppApplication.class, args);
	}

	@Bean
	public CustomerDao getDao() {
		return new CustomerDaoJdbcImpl();
	}
}
