package com.hsbc.tr.app.dao;

import java.util.List;

import com.hsbc.tr.app.entity.Emp;

/**
 * 
 * @author Shantanu Banerjee
 *
 */
public interface EmpDao {

	/**
	 * this method finds the employee based on its id
	 * @param id - id of an employee
	 * @return it returns the employee Object
	 * @throws EmpNotFoundException
	 */
	public Emp findById(int id) throws EmpNotFoundException;
	
	/**
	 * Lists all the employees from the data store
	 * @return list of employees
	 */
	public List<Emp> listAll();
	
	/**
	 * 
	 * @param e -- the employee to be saved
	 * @return it returns a status message
	 * @throws DuplicateEmpException
	 */
	public String save(Emp e) throws DuplicateEmpException;
	
	public Emp updateName(int id, String name) throws EmpNotFoundException;
}
