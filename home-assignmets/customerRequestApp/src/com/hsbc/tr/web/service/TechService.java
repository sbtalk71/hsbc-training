package com.hsbc.tr.web.service;

import com.hsbc.tr.web.dao.CustomerDao;
import com.hsbc.tr.web.dao.CustomerDaoJdbcImpl;
import com.hsbc.tr.web.entity.Customer;
import com.hsbc.tr.web.entity.Request;

/**
 * 
 * @author Megha agarwal Service class in service layer of application Methods
 *         to collect data from controller, connect to database and return the
 *         output back to controller
 *
 */
public class TechService {
	// getting access to dao layer implementation
	static CustomerDao dao = new CustomerDaoJdbcImpl();

	/**
	 * Receives Request object as parameter from controller and forward its elements
	 * to dao for saving customer request
	 * 
	 * @param req1
	 */
	public void saveReq(Request req1) {
		dao.saveRequest(req1.getEmail(), req1.getSoftware(), req1.getOs(), req1.getProblem());
	}
	
	/**
	 * Receives Customer object as parameter from controller and forward its elements
	 * to dao for registering new customer
	 * @param c
	 */
	public void saveUser(Customer c) {
		dao.registerUser(c.getEmail(), c.getFname(), c.getLname(), c.getPno());
	}
	
	/**
	 * TAking user email from controller , sending to dao and sending result back to controller
	 * @param email
	 * @return
	 */
	public String userExist(String email) {
		return dao.checkUser(email);
	}
}
