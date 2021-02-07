package com.hsbc.exam.dao;

import java.util.ArrayList;

import com.hsbc.exam.entity.Apparel;
import com.hsbc.exam.entity.Electronics;
import com.hsbc.exam.entity.FoodItems;
import com.hsbc.exam.entity.Product;

/**
 * 
 * @author Megha agarwal
 * Interface for data layer
 *
 */
public interface ProductDao {
	
	/**
	 * Method to save product to db
	 * @param p		Reference of Product class
	 * @return				Status of save procedure
	 */
	public String saveFood(Product p) throws ItemExistException;
	public String saveApparel(Product p) throws ItemExistException;
	public String saveElectronics(Product p) throws ItemExistException;
	
	
	/**
	 * @param -category of product for report
	 * @return list to view report of particular product category
	 */
	public ArrayList<FoodItems> viewFood();
	
	public ArrayList<Apparel> viewApparel();

	
	public ArrayList<Electronics> viewElect();
}
