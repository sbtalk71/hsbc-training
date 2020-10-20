package com.demo.spring.data;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.demo.spring.entity.Customer;



@Repository
public class CustomerDB {
	private static HashMap<Integer, Customer> db=new HashMap<>();
	public CustomerDB() {
		db.put(100, new Customer(100,"Muskan","9874563215"));
		db.put(101, new Customer(101,"Priya","9874563215"));
		db.put(102, new Customer(102,"Krishna","1452639787"));
		db.put(103, new Customer(103,"Megha","7896541236"));
		db.put(104, new Customer(104,"Shubhi","4563217896"));
		db.put(105, new Customer(105,"Ram","7896541236"));
		db.put(106, new Customer(106,"Joey","7596841230"));
		db.put(107, new Customer(107,"Monica","4569871230"));
	}
	public static HashMap<Integer, Customer> getDb() {
		return db;
	}
	public static void setDb(HashMap<Integer, Customer> db) {
		CustomerDB.db = db;
	}

}
