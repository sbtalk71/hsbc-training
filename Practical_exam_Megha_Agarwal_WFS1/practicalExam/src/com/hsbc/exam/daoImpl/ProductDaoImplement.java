package com.hsbc.exam.daoImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.hsbc.exam.dao.ItemExistException;
import com.hsbc.exam.dao.ProductDao;
import com.hsbc.exam.entity.Apparel;
import com.hsbc.exam.entity.Electronics;
import com.hsbc.exam.entity.FoodItems;
import com.hsbc.exam.entity.Product;

public class ProductDaoImplement implements ProductDao{
	
	static Map<Integer,Product> foodDb,apparelDb,electronicsDb;
	public ProductDaoImplement() {
		foodDb=new HashMap<>();
		apparelDb=new HashMap<>();
		electronicsDb=new HashMap<>();	
		
		foodDb.put(101,new FoodItems(101,"Milk",50,"23/9/2020","25/9/2020",true,50));
		foodDb.put(102,new FoodItems(102,"Sugar",30,"23/2/2020","25/9/2021",true,30));
		
		apparelDb.put(201, new Apparel(201,"Shirt",400,"Medium","cotton",10));
		apparelDb.put(202, new Apparel(202,"Sweater",1000,"Large","woolen",8));
		
		electronicsDb.put(1016, new Electronics(1016,"TV",25000,12,100));
		electronicsDb.put(1114, new Electronics(1114,"Watch",3500,18,54));
		
		
	}
	@Override
	public String saveFood(Product p) throws ItemExistException {
		
		try {
			if(foodDb.containsKey(p.getItemCode()))
				throw new ItemExistException("Item with same id already exists!!");
			else {
				foodDb.put(p.getItemCode(), p);
				return "Item added successfully!!";
			}
		}
		catch(ItemExistException ie)
		{
			throw ie;
		}
		
	}
	
	public String saveElectronics(Product p) throws ItemExistException {
		
		try {
			if(electronicsDb.containsKey(p.getItemCode()))
				throw new ItemExistException("Item with same id already exists!!");
			else {
				electronicsDb.put(p.getItemCode(), p);
				return "Item added successfully!!";
			}
		}
		catch(ItemExistException ie)
		{
			throw ie;
		}
		
	}
	
	public String saveApparel(Product p) throws ItemExistException {
		
		try {
			if(apparelDb.containsKey(p.getItemCode()))
				throw new ItemExistException("Item with same id already exists!!");
			else {
				apparelDb.put(p.getItemCode(), p);
				return "Item added successfully!!";
			}
		}
		catch(ItemExistException ie)
		{
			throw ie;
		}
		
	}
	@Override
	public ArrayList<FoodItems> viewFood() {
		return new ArrayList(foodDb.values());
	}
	
	public ArrayList<Apparel> viewApparel() {
		return new ArrayList(apparelDb.values());
	}
	
	public ArrayList<Electronics> viewElect() {
		return new ArrayList(electronicsDb.values());
	}
  
}


