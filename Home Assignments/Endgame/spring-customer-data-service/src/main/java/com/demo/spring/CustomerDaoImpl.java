package com.demo.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import com.demo.spring.dao.CustomerDao;
import com.demo.spring.data.CustomerDB;

import com.demo.spring.entity.Customer;


public class CustomerDaoImpl implements CustomerDao{
	
	@Autowired
	private CustomerDB dataStore;
	
	@Override
	public Customer fetchCustomerDetails(int customerId) {
		if(dataStore.getDb().containsKey(customerId)) {
			return dataStore.getDb().get(customerId);
		}
		else
		{
			return null;
		}
	}
	
	@Override
	public List<Customer> showAllCustomers() {
		//System.out.println(dataStore.getDb().values());
		List<Customer> custList=new ArrayList<>(dataStore.getDb().values());
		return custList;
	}
	
	@Override
	public String save(Customer c) {
		if(CustomerDB.getDb().containsKey(c.getCustomerId()))
		{
			return "Customer already registered..";
		}
		else {
			CustomerDB.getDb().put(c.getCustomerId(), c);
			return "Customer saved successfully..";
		}
	}

}
