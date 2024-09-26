package com.test.dao;

import java.util.List;

import com.test.entity.apparel.Apparel;
import com.test.entity.electronics.Electronics;
import com.test.entity.fooditems.FoodItems;

public interface CompanyDao {

	public String addItems(Electronics obj);
	public List<Electronics> retrieve();
	
	public String addFood(FoodItems obj);
	public List<FoodItems> retrieveFoodItems();
	
	public String addApparel(Apparel obj);
	public List<Apparel> retrieveApparel();
	
	
	

}
