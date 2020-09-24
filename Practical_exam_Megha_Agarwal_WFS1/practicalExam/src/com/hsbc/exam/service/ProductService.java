package com.hsbc.exam.service;

import java.util.ArrayList;

import com.hsbc.exam.dao.ItemExistException;
import com.hsbc.exam.dao.ProductDao;
import com.hsbc.exam.entity.Apparel;
import com.hsbc.exam.entity.Electronics;
import com.hsbc.exam.entity.FoodItems;
import com.hsbc.exam.entity.Product;

public class ProductService {
	
	private ProductDao dao;
	
	public ProductService(ProductDao dao) {
		this.dao=dao;
	}
	
	public String addFood(int id, String name,double price,String dateOfMan,String dateOfExpiry, boolean vegetarian, double quantity) {
		Product food=new FoodItems(id,name,price,dateOfMan,dateOfExpiry,vegetarian,quantity);
		try {
		return dao.saveFood(food);
		}
		catch(ItemExistException ie) {
			throw new RuntimeException(ie);
		}
	}
	
	public String addApparel(int code, String name,double price, String size,String material,double quantity) {
			Product apparel=new Apparel(code,name,price,size,material,quantity);
			try {
				return dao.saveApparel(apparel);
				}
				catch(ItemExistException ie) {
					throw new RuntimeException(ie);
				}
			
	}
	
	public String addElectronics(int code,String name,double price,int warranty,double quantity) {
		Product electronics=new Electronics(code,name,price,warranty,quantity);
		try {
			return dao.saveElectronics(electronics);
			}
			catch(ItemExistException ie) {
				throw new RuntimeException(ie);
			}
		
}
	
	public void showReport(String category) {
		switch(category)
		{
		case "Food":ArrayList<FoodItems> food=dao.viewFood();
					for(FoodItems food1: food)
							System.out.println(food1.getItemCode()+"\t"+food1.getItemName()+"\t"+food1.getQuantity()+"\t"+((food1.isVegetarian())?"Yes":"No"));
					break;
					
		case "Apparel":  ArrayList<Apparel> app1=dao.viewApparel();
									for(Apparel a1:app1)
										System.out.println(a1.getItemCode()+"\t"+a1.getItemName()+"\t"+a1.getQuantity()+"\t"+a1.getSize()+"\t"+a1.getMaterial());
									break;
		case "Electronics": ArrayList<Electronics> elec=dao.viewElect();
										for(Electronics e1:elec)
											System.out.println(e1.getItemCode()+"\t"+e1.getItemName()+"\t"+e1.getQuantity()+"\t"+e1.getWarranty());
		}
		
		
	}

	
}
