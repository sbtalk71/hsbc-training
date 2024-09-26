package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.CustomerNotFoundException;
import com.example.demo.dao.CustomerDao;
import com.example.demo.entity.Customer;

/**
 * 
 * @author Megha agarwal
 *
 */

@Service
public class CustomerService {
	
	@Autowired
	@Qualifier("customerDaoJdbcImpl")
	CustomerDao customerDao;
	
	public Customer findCustomer(int id) {
		try {
		return customerDao.findCust(id);
		}
		catch(CustomerNotFoundException ce) {
		throw new RuntimeException("Customer not found");	
		}
	}
	
	public List<Customer> getAll(){
		return customerDao.getList();
	}
	
	public void addCustomer(Customer c1) {
		customerDao.save(c1);
	}

}
