package com.demo.app1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.demo.app.ApparelImpl;
import com.demo.app.DataStorage;
import com.demo.app.DuplicateItemException;
import com.demo.app.ElectronicsImpl;
import com.demo.app.Service;
import com.demo.app.entity.Apparel;
import com.demo.app.entity.Electronics;
import com.demo.app.entity.FoodItems;
import com.demo.app.impl.FoodItemsImpl;

public class MainApp {

	public static void main(String[] args) {
		DataStorage dao;
		Service service;
		
		String input;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the category!");
		try {
		input=br.readLine();
		
		if(input.equalsIgnoreCase("Food items"))
				{
			dao=new FoodItemsImpl();
			service=new Service(dao);
			FoodItems f=new FoodItems(105,"Milk",20,"22-9-2022","22-9-2022","Yes",25);
			try {
			dao.addNewItem(f);
			dao.listAll();}catch(DuplicateItemException e)
			{
				throw new RuntimeException("Duplicate item!!");
			}
			
				}
		else if(input.equalsIgnoreCase("APPAREL"))
		{
			
			dao=new ApparelImpl();
			service=new Service(dao);
			Apparel a=new Apparel(104,"Tshirt",20,"Large","Cotton",25);
			try {
				dao.addNewItem(a);
				dao.listAll();
				}catch(DuplicateItemException e)
				{
					throw new RuntimeException("Duplicate item!!");
				}
				
					}
		
		else if(input.equalsIgnoreCase("Electronics")) {
			dao=new ElectronicsImpl();
			service=new Service(dao);
			Electronics el= new Electronics(107,"Tshirt",20,20,25);
			try {
				dao.addNewItem(el);
				dao.listAll();
				}catch(DuplicateItemException e)
				{
					throw new RuntimeException("Duplicate item!!");
				}
			
					}
		else
		{
			System.out.println("Wrong category!!");
			System.exit(0);
		}
		
	}catch(IOException e)
	{
		e.printStackTrace();
	}
	
		
	
		
				
		
	}

}
