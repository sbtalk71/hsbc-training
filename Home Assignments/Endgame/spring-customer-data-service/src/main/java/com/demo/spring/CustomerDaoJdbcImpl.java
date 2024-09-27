package com.demo.spring;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.demo.spring.dao.CustomerDao;
import com.demo.spring.entity.Customer;

@Repository
public class CustomerDaoJdbcImpl implements CustomerDao {
	
	@Autowired
	private JdbcTemplate jt;
	
	public CustomerDaoJdbcImpl()
	{
		System.out.println("JDBC DAO IMPL CREATED..");
	}

	@Override
	public Customer fetchCustomerDetails(int customerId) {
		String query="select * from mycustomers where custId= "+customerId;
		try {
		Customer c=jt.queryForObject(query, new RowMapper<Customer>() {
			@Override
			public Customer mapRow(ResultSet rs, int rowNum )throws SQLException {
				return new Customer(rs.getInt(1),rs.getString(2),""+rs.getInt(3));
			}
		});
		return c;
		}catch(Exception e)
		{
			System.out.println(e);
			throw new RuntimeException("NOT FOUND..");
		}
	}

	@Override
	public List<Customer> showAllCustomers() {
		try {
			System.out.println(jt);
		List<Customer> custList=jt.query("select * from mycustomers", new RowMapper<Customer>() {
			@Override
			public Customer mapRow(ResultSet rs, int rowNum )throws SQLException {
				//System.out.println(rs.getInt(1));
				//System.out.println(rs.getString(2));
				//System.out.println(rs.getInt(3)+"");
				return new Customer(rs.getInt(1),rs.getString(2),""+rs.getInt(3));
			}
		});
		return custList;
		}catch(Exception e)
		{
			System.out.println(e);
			throw new RuntimeException("Something went wrong!!");
		}
	}

	@Override
	public String save(Customer c) {
		
		String query="select * from mycustomers where custId= "+c.getCustomerId();
		Customer c1=null;
		try {
		c1=jt.queryForObject(query, new RowMapper<Customer>() {
			@Override
			public Customer mapRow(ResultSet rs, int rowNum )throws SQLException {
				return new Customer(rs.getInt(1),rs.getString(2),""+rs.getInt(3));
			}
		});
		}	catch(Exception e)
		{
		System.out.println(e);
		
		}
		if(c1==null) {
		query="insert into mycustomers (custId, custName, mobile) values("+c.getCustomerId()+",'"+c.getCustomerName()+"',"+c.getMobile()+")";
		System.out.println(query);
		int row=jt.update(query);
	return "Customer saved successfully!";
		}
		else {
			return "Customer already exists..";
		}

	}
}