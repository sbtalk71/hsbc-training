package com.example.demo.controller;

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
import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;


/**
 * 
 * @author Megha Agarwal
 *
 */
@RestController
@CrossOrigin
public class CustomerRestController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping(path="/customer/find/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity findCustomer(@PathVariable("id")int id) {
		
		try {
			Customer c=customerService.findCustomer(id);
			return ResponseEntity.ok(c);
		
		}catch(RuntimeException re) {
			return ResponseEntity.ok("{\"status\":\"Customer not found\"}");
		}
		
	}
	
	@GetMapping(path="/customer",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Customer>> getCustomerList() {
		return ResponseEntity.ok(customerService.getAll());
	}
	
	@PostMapping(path="/customer/save", produces=MediaType.TEXT_PLAIN_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> saveEmp(@RequestBody Customer c1){
		try {
			Customer c=customerService.findCustomer(c1.getCustomerId());
			return ResponseEntity.ok("{\"status\":\"Customer exists\"}");		
		}
				catch(RuntimeException re) {
				customerService.addCustomer(c1);
				return  ResponseEntity.ok("{\"status\":\"Customer saved successfully!\"}");	
			}
		
	}
	

}
