package com.demo.spring.config;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;

public class JdbcMain {

	public static void main(String[] args) {
		final String INSERT = "insert into EMP(empno,name,city,salary) values(?,?,?,?)";

		ApplicationContext ctx = new AnnotationConfigApplicationContext(JdbcConfig.class);

		JdbcTemplate jt = ctx.getBean(JdbcTemplate.class);

		int row = jt.update(new PreparedStatementCreator() {

			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement pst = con.prepareStatement(INSERT);
				pst.setInt(1, 201);
				pst.setString(2, "Munna");
				pst.setString(3, "Mirzapur");
				pst.setDouble(4, 56000);
				return pst;
			}
		});
		System.out.println("Rows Updated : " + row);
	}

}
