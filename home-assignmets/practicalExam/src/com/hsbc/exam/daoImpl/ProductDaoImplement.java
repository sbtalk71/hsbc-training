package com.hsbc.exam.daoImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import com.hsbc.exam.dao.ItemExistException;
import com.hsbc.exam.dao.ProductDao;
import com.hsbc.exam.entity.Apparel;
import com.hsbc.exam.entity.Electronics;
import com.hsbc.exam.entity.FoodItems;
import com.hsbc.exam.entity.Product;

/**
 * 
 * @author Megha agarwal
 * Class implementing Dao interface
 * Saving records with Map collection
 *
 */
public class ProductDaoImplement implements ProductDao{
	
	static Map<Integer,Product> foodDb,apparelDb,electronicsDb;
	public ProductDaoImplement() {
		foodDb=new HashMap<>();
		apparelDb=new HashMap<>();
		electronicsDb=new HashMap<>();	
		
		foodDb.put(101,new FoodItems(101,"Milk",50,"23/9/2020","25/9/2020",true,5));
		foodDb.put(102,new FoodItems(102,"Sugar",30,"23/2/2020","25/9/2021",true,30));
		foodDb.put(103,new FoodItems(103,"Cheese",250,"23/2/2020","25/9/2021",true,10));
		
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
		ArrayList<FoodItems> foodList=new ArrayList(foodDb.values());
		Collections.sort(foodList,new MyListSorter());
		return foodList;
	}
	
	public ArrayList<Apparel> viewApparel() {
		ArrayList<Apparel> appList=new ArrayList(apparelDb.values());
		Collections.sort(appList, new MyListSorter());
		return appList;
	}
	
	public ArrayList<Electronics> viewElect() {
		ArrayList<Electronics> elecList=new ArrayList(apparelDb.values());
		Collections.sort(elecList, new MyListSorter());
		return elecList;
		
	}
  
}


/**
 * 
 * @author Megha agarwal
 * Custom sorter for Product based on quantity sold
 *
 */
class MyListSorter implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return o2.getQuantity()-o1.getQuantity();
	}
	
	
}


