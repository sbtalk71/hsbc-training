package com.demo.spring.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.spring.CustomerDaoImpl;
import com.demo.spring.CustomerDaoJdbcImpl;
import com.demo.spring.dao.CustomerDao;
import com.demo.spring.entity.Customer;

@Service
public class CustomerService {
	@Autowired
	private CustomerDao dao;
	
	public Customer getCustomerDetails(int customerId)
	{
		return dao.fetchCustomerDetails(customerId);
		
	}
	public List<Customer> listAllCustomers()
	{
		return dao.showAllCustomers();
	}
	public String saveCustomer(Customer c)
	{
		
		return dao.save(c);
	}

}
