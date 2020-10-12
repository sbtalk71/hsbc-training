package com.demo.spring;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class JdbcFetchRUnner implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jt;
	
	@Value("${sql}")
	private String sql;
	
	@Override
	public void run(String... args) throws Exception {

		
		
		List<String> empList = jt.query(sql, new RowMapper<String>() {

			@Override
			public String mapRow(ResultSet rs, int rowNum) throws SQLException {

				return rs.getInt(1) + " " + rs.getString(2) + " " 
				+ rs.getString(3) + " " + rs.getDouble(4);
			}

		});

		empList.forEach(System.out::println);

	}

}
