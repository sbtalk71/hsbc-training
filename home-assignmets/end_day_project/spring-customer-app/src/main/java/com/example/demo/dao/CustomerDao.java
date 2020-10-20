package com.example.demo.dao;

import java.util.List;

import com.example.demo.CustomerNotFoundException;
import com.example.demo.entity.Customer;

/**
 * 
 * @author Megha Agarwal
 *
 */
public interface CustomerDao {
	
	public List<Customer> getList();
	public Customer findCust(int id) throws CustomerNotFoundException;
	public void save(Customer c1);
	
	

}
