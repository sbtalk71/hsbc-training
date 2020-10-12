package com.demo.spring;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.demo.spring.config.JdbcConfig;

@SpringBootApplication
public class SpringBootJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcApplication.class, args);
		
			

	}

}
