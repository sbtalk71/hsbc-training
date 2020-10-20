package com.demo.spring.dao;


import java.util.List;

import com.demo.spring.entity.Customer;

public interface CustomerDao {
	
	public Customer fetchCustomerDetails(int customerId);
	public List<Customer> showAllCustomers();
	public String save(Customer c);

}
