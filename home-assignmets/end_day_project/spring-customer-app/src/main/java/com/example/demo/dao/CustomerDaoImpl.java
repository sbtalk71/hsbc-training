package com.example.demo.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.CustomerNotFoundException;
import com.example.demo.entity.Customer;

/**
 * 
 * @author Megha Agarwal
 *
 */

@Repository
public class CustomerDaoImpl implements  CustomerDao{
	
	private static HashMap<Integer,Customer> customerDb=new HashMap<>();
	
	public CustomerDaoImpl() {
		customerDb.put(101, new Customer(101,"Shikha Khandelwal","9897765450"));
		customerDb.put(102, new Customer(102,"Ravin Singh","9897744450"));
		customerDb.put(103, new Customer(103,"Sundar Singh","9666765450"));
		customerDb.put(104, new Customer(104,"kirti Jain","9897754350"));
		customerDb.put(105, new Customer(105,"Ronak Goyal","9898885450"));
		customerDb.put(106, new Customer(106,"Aayush Bansal","9897999450"));
		
	}

	@Override
	public Customer findCust(int id) throws CustomerNotFoundException {
		if(customerDb.containsKey(id)) {
			return customerDb.get(id);
		}
		else
			throw new CustomerNotFoundException();
	}
	
	@Override
	public List<Customer> getList() {
		return new ArrayList<>(customerDb.values());	
	}
	
	public void save(Customer c1) {
		customerDb.put(c1.getCustomerId(), c1);
		
	}
	
}
