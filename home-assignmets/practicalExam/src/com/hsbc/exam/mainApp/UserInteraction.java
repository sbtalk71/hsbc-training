package com.hsbc.exam.mainApp;

import java.io.InputStreamReader;
import java.util.Scanner;

import com.hsbc.exam.dao.ProductDao;
import com.hsbc.exam.daoImpl.ProductDaoImplement;
import com.hsbc.exam.service.ProductService;


/**
 * 
 * @author Megha agarwal
 * UI layer of the application
 * Taking user input for product category and then take input for action--> save item or see report
 *
 */
public class UserInteraction {
	
	public void viewFoodReport() {
		
	}
	
	public static void main(String[] args) {
		
			Scanner scan=new Scanner(new InputStreamReader(System.in));
			ProductDao dao=new ProductDaoImplement();
			ProductService service=new ProductService(dao);
			int ch,ch1;
			System.out.println("Choose the category of product:\n");
			System.out.println("1.Food Items\t2.Apparel\t3.Electronics\t4.Others\nEnter a number:");
			ch=scan.nextInt();
			
			switch(ch) {
			case 1: System.out.println("1.Save new item\t2.View Report\nEnter your choice:");
							ch1=scan.nextInt();
							
							switch(ch1) {
							
							case 1: System.out.println("Enter food details:id,name,price,dateOfMan,dateOfExpiry,vegetarian,quantity");
											int code=scan.nextInt();
											String name=scan.next();
											double price=scan.nextDouble();
											String manDate=scan.next();
											String expDate=scan.next();
											String vegetarian=scan.next();
											int quantity=scan.nextInt();
											String resp=service.addFood(code, name, price, manDate, expDate, (vegetarian.equals("Yes")?true:false), quantity);
											System.out.println(resp);
											service.showReport("Food");
											break;
											
							case 2: service.showReport("Food");
											break;
							
							}
							break;
			case 2: System.out.println("1.Save new item\t2.View Report\nEnter your choice:");
							ch1=scan.nextInt();
			
							switch(ch1) {
							
							case 1: 	System.out.println("Enter apparel details:code,name,price,size,material,quantity");
											int code=scan.nextInt();
											String name=scan.next();
											double price=scan.nextDouble();
											String size=scan.next();
											String material=scan.next();
											int quantity=scan.nextInt();
											String resp=service.addApparel(code, name, price, size, material, quantity);
											System.out.println(resp);
											service.showReport("Apparel");
											break;
											
							case 2: service.showReport("Apparel");
											break;
							
							}
							break;
							
			case 3: System.out.println("1.Save new item\t2.View Report\nEnter your choice:");
							ch1=scan.nextInt();
							
							switch(ch1) {
							
							case 1: System.out.println("Enter details for electronic item:code,name,price,warranty,quantity");
											int code=scan.nextInt();
											String name=scan.next();
											double price=scan.nextDouble();
											int warranty=scan.nextInt();
											int quantity=scan.nextInt();
											String resp=service.addElectronics(code, name, price, warranty, quantity);
											System.out.println(resp);
											service.showReport("Electronics");
											break;
											
							case 2: service.showReport("Electronics");
											break;
							
							}
							break;
			default: System.out.println("Sorry Wrong Choice!!");
			}
	}

}
