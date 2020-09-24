package com.hsbc.exam.mainApp;

import java.io.InputStreamReader;
import java.util.Scanner;

import com.hsbc.exam.dao.ProductDao;
import com.hsbc.exam.daoImpl.ProductDaoImplement;
import com.hsbc.exam.service.ProductService;

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
							
							case 1: //saveFood();
											break;
											
							case 2: service.showReport("Food");
											break;
							
							}
							break;
			case 2: System.out.println("1.Save new item\t2.View Report\nEnter your choice:");
							ch1=scan.nextInt();
			
							switch(ch1) {
							
							case 1: //saveFood();
											break;
											
							case 2: service.showReport("Apparel");
											break;
							
							}
							break;
							
			case 3: System.out.println("1.Save new item\t2.View Report\nEnter your choice:");
							ch1=scan.nextInt();
							
							switch(ch1) {
							
							case 1: //saveFood();
											break;
											
							case 2: service.showReport("Electronics");
											break;
							
							}
							break;
			default: System.out.println("Sorry Wrong Choice!!");
			}
	}

}
