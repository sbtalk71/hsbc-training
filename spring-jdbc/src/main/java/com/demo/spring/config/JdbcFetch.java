package com.demo.spring.config;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;

public class JdbcFetch {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(JdbcConfig.class);

		JdbcTemplate jt = ctx.getBean(JdbcTemplate.class);
		
		List<String> empList = jt.query("select * from EMP", new RowMapper<String>() {

			@Override
			public String mapRow(ResultSet rs, int rowNum) throws SQLException {

				return rs.getInt(1) + " " + rs.getString(2) + " " 
				+ rs.getString(3) + " " + rs.getDouble(4);
			}

		});

		empList.forEach(System.out::println);
	}

}
