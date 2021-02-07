package com.hsbc.exam.dao;

/**
 * 
 * @author Megha agarwal
 * checked Exception to be raised for duplicate entry of product
 *
 */
public class ItemExistException extends Exception{

	public ItemExistException(String mssg) {
		super(mssg);
	}
}
