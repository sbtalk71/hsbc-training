/**
 * @author Muskan Karnani
 * Service layer which is called from main layer
 */

package com.demo.app;



public class Service {
	DataStorage dao;
	public Service(DataStorage dao)
	{
		this.dao=dao;
	}
	public void addItem(Object c)
	{
		try {
			System.out.println("service!");
		System.out.println(dao.addNewItem(c));
		}
		catch(DuplicateItemException ex)
		{
			throw new RuntimeException("Duplicate Item Exists!!");
		}
	}
	public void printItemList()
	{
		dao.listAll();
		
	}

}
