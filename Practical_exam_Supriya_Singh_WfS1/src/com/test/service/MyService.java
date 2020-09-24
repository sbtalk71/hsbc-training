package com.test.service;


import com.test.dao.CompanyDao;
import com.test.entity.apparel.Apparel;
import com.test.entity.electronics.Electronics;
import com.test.entity.fooditems.FoodItems;


public class MyService {
	CompanyDao dao ;
	public MyService(CompanyDao dao) {
		this.dao =dao;
	}
	
	
	public String registerElectronics(int itemCode, String itemName, double Price, int warranty, int quantity) {
		String resp = dao.addItems(new Electronics (itemCode,itemName,Price,warranty,quantity));
		return resp;
		
	}
	
	
	public void  printItem() {
		for(Electronics e:dao.retrieve()) {
			System.out.println(e.getItemCode()+" "+e.getItemName()+" "+e.getQuantity()+" "+e.getWarranty());
		}
	}
		
	public String registerFood(int itemCode, String itemName, double unitPrice, String DOM, String DOE, boolean Veg,
			int quantity) {
		String resp = dao.addFood(new FoodItems (itemCode,itemName,unitPrice,DOM,DOE,Veg,quantity));
		return resp;
		
	}
	
	
	public void  printFoodItem() {
		for(FoodItems f:dao.retrieveFoodItems()) {
			System.out.println(f.getItemCode()+" "+f.getItemName()+" "+f.getQuantity()+" "+f.getUnitPrice());
		}
	}
		
	public String registerApparel(int itemCode, String itemName, double unitPrice, String sizeandmaterial, int quantity
			) {
		String resp = dao.addApparel(new Apparel (itemCode,itemName,unitPrice,sizeandmaterial,quantity));
		return resp;
		
	}
	

	public void  printApparel() {
		for(Apparel a:dao.retrieveApparel()) {
			System.out.println(a.getItemCode()+" "+a.getItemName()+" "+a.getQuantity()+" "+a.getUnitPrice());
		}
	}
	 

}
