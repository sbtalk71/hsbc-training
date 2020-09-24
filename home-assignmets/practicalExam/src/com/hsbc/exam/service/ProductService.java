package com.hsbc.exam.service;

import java.util.ArrayList;

import com.hsbc.exam.dao.ItemExistException;
import com.hsbc.exam.dao.ProductDao;
import com.hsbc.exam.entity.Apparel;
import com.hsbc.exam.entity.Electronics;
import com.hsbc.exam.entity.FoodItems;
import com.hsbc.exam.entity.Product;

/**
 * 
 * @author Megha agarwal
 * This is the class serving as service layer
 * Interavting between user and dao layer
 *
 */
public class ProductService {
	
	private ProductDao dao;
	
	public ProductService(ProductDao dao) {
		this.dao=dao;
	}

	/**
	 * Method to take properties of food item from UI layer and pass to dao layer as FoodItem object
	 * @param id
	 * @param name
	 * @param price
	 * @param dateOfMan
	 * @param dateOfExpiry
	 * @param vegetarian
	 * @param quantity
	 * @return
	 */
	public String addFood(int id, String name,double price,String dateOfMan,String dateOfExpiry, boolean vegetarian, int quantity) {
		Product food=new FoodItems(id,name,price,dateOfMan,dateOfExpiry,vegetarian,quantity);
		try {
		return dao.saveFood(food);
		}
		catch(ItemExistException ie) {
			throw new RuntimeException(ie);
		}
	}
	
	/**
	 * Method to take properties of Apparel from UI layer and pass to dao layer as Apparel class object
	 * @param code
	 * @param name
	 * @param price
	 * @param size
	 * @param material
	 * @param quantity
	 * @return
	 */
	public String addApparel(int code, String name,double price, String size,String material,int quantity) {
			Product apparel=new Apparel(code,name,price,size,material,quantity);
			try {
				return dao.saveApparel(apparel);
				}
				catch(ItemExistException ie) {
					throw new RuntimeException(ie);
				}
			
	}
	
	/**
	 * Method to take properties of Electronic item from UI layer and pass to dao layer as Electronics class object
	 * @param code
	 * @param name
	 * @param price
	 * @param warranty
	 * @param quantity
	 * @return
	 */
	public String addElectronics(int code,String name,double price,int warranty,int quantity) {
		Product electronics=new Electronics(code,name,price,warranty,quantity);
		try {
			return dao.saveElectronics(electronics);
			}
			catch(ItemExistException ie) {
				throw new RuntimeException(ie);
			}
		
}
	
	/**
	 * Showing top 3 items based on quantity sold of given category
	 * @param category
	 */
	public void showReport(String category) {
		switch(category)
		{
		case "Food":ArrayList<FoodItems> food=dao.viewFood();
								System.out.println("Item code  Item Name\t\tQuantitySold\tVegetarian\n");
								int i=1;
								for(FoodItems food1: food) {
										if(i<4)	{
											System.out.println(food1.getItemCode()+"\t\t\t"+food1.getItemName()+"\t\t\t"+food1.getQuantity()+"\t\t\t"+((food1.isVegetarian())?"Yes":"No"));
											i+=1;
										}
											
										else 
											break;
								}break;
					
		case "Apparel":  ArrayList<Apparel> app1=dao.viewApparel();
									System.out.println("Item code  Item Name\t\tQuantitySold\tSize\t\tMaterial\n");
									 i=1;
									for(Apparel a1:app1)
									{
										if(i<4)
										{
											System.out.println(a1.getItemCode()+"\t\t\t"+a1.getItemName()+"\t\t\t"+a1.getQuantity()+"\t\t\t"+a1.getSize()+"\t"+a1.getMaterial());
											i+=1;
										}
										else
											break;
										
									}
										
									break;
		case "Electronics": ArrayList<Electronics> elec=dao.viewElect();
										System.out.println("Item code  Item Name\t\tQuantitySold\tWarranty\n");
										i=1;
										for(Electronics e1:elec)
										{
											if(i<4) {
												System.out.println(e1.getItemCode()+"\t\t\t"+e1.getItemName()+"\t\t\t"+e1.getQuantity()+"\t\t"+e1.getWarranty());
												i+=1;
											}
											else
												break;
										}
										break;
											
		}
		
		
	}

	
}
