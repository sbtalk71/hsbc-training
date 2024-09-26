package com.test.app;

import com.test.dao.CompanyDao;
import com.test.dao.CompanyDaoImpl;

import com.test.service.MyService;

public class MainApp {

	public static void main(String[] args) {
		CompanyDao dao = new CompanyDaoImpl();
		MyService ser = new MyService(dao);
//Electronic data access
		ser.printItem();
		System.out.println(ser.registerElectronics(1114, "watch", 3000, 12, 20));
		ser.printItem();
		System.out.println(" ");
		
	//FoodItems data access	
		ser.printFoodItem();
		System.out.println(ser. registerFood(1114, "Coco Cola", 55, "12/12/20","30/11/21",true, 20));
		ser.printFoodItem();
		System.out.println(" ");
		
		//Apparel data access
		ser.printApparel();
		System.out.println(ser.registerApparel(1114, "Saree", 5000,"cotton", 20));
		ser.printApparel();
		

	}

}
