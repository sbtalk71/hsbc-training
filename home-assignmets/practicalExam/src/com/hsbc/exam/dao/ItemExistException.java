package com.hsbc.exam.dao;

/**
 * 
 * @author Megha agarwal
 * checked Exception to be raised for duplicate entry of product
 *
 */
public class ItemExistException extends Exception{

	/**
	 * Paramaterized constructor to give custom message with object creation
	 * @param mssg   String message
	 */
	public ItemExistException(String mssg) {
		super(mssg);
	}
}
