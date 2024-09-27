package com.demo.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring.data.CustomerDB;

import com.demo.spring.entity.Customer;

import com.demo.spring.service.CustomerService;

@RestController
@CrossOrigin
public class CustomerRestController {
	
	@Autowired
	CustomerService service;
	
	@GetMapping(path="/customer/find/{customerId}",produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity getCustomerDetailsfromService(@PathVariable("customerId") int customerId)
	{
		//System.out.println(ResponseEntity.ok(service.getCustomerDetails(customerId)));
		Customer c=service.getCustomerDetails(customerId);
		if(c==null)
		return ResponseEntity.ok("{\"status\":\"Customer Not Found..\"}");
		else
			return ResponseEntity.ok(c);
	}
	
	@GetMapping(path="/customer",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Customer>> lisAllCustomersfromService()
	{
		
		List<Customer> custList=service.listAllCustomers();
		
		return ResponseEntity.ok(custList);
	}
	
	
	@PostMapping(path="/customer/save", produces=MediaType.TEXT_PLAIN_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> saveEmp(@RequestBody Customer c){
		return ResponseEntity.ok(service.saveCustomer(c));
		
		
		
	}
	

}
