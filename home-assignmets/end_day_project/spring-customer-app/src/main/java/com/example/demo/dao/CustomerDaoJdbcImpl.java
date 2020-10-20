package com.example.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.stereotype.Repository;

import com.example.demo.CustomerNotFoundException;
import com.example.demo.entity.Customer;
/**
 * 
 * @author Megha Agarwal
 *
 */
@Repository
public class CustomerDaoJdbcImpl implements CustomerDao {

	@Autowired
	JdbcTemplate jt;
	
	@Override
	public List<Customer> getList() {
		List<Customer> custList = jt.query("Select * from mycustomers", (rs, count) -> {
			return new Customer(rs.getInt(1), rs.getString(2) , rs.getBigDecimal(3).toString());
		});
		
		return custList;
	}

	@Override
	public Customer findCust(int id) throws CustomerNotFoundException{
		
		Customer c1=null;
		try {
		c1=jt.queryForObject("select * from mycustomers where custId="+id,(rs,count)->{
			return new Customer(rs.getInt(1),rs.getString(2),rs.getBigDecimal(3).toString());
		});
		
		return c1;
		}
		catch(EmptyResultDataAccessException e) {
			throw new CustomerNotFoundException();
		}
	
	}

	@Override
	public void save(Customer c1) {
		final String INSERT="Insert into mycustomers (custId,custname,mobile) values (?,?,?)";
		
		int row=jt.update(new PreparedStatementCreator() {
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement pst=con.prepareStatement(INSERT);
				pst.setInt(1, c1.getCustomerId());
				pst.setString(2, c1.getCustomerName());
				pst.setString(3, c1.getMobile());
				return pst;
			}
			
		});

	}

}
