/**
 * @author Muskan Karnani
 * Implementation of interdface methpds for Food Items 
 */

package com.demo.app.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import com.demo.app.DataStorage;
import com.demo.app.DuplicateItemException;
import com.demo.app.entity.Apparel;
import com.demo.app.entity.Electronics;
import com.demo.app.entity.FoodItems;

public class FoodItemsImpl implements DataStorage {
	//stores data of food items in LIST as test data
		static List<FoodItems> items =new LinkedList<FoodItems>();
		public FoodItemsImpl()
		{
			items.add((new FoodItems(100,"Milk",20,"22-9-2022","22-9-2022","Yes",25)));
			items.add((new FoodItems(101,"Curd",25,"22-9-2025","22-9-2022","Yes",58)));
			items.add((new FoodItems(102,"Cake",35,"20-8-2027","22-9-2022","No",21)));
			items.add((new FoodItems(103,"Wheat",98,"22-9-2025","22-9-2022","Yes",80)));
			items.add((new FoodItems(104,"Rice",57,"19-9-2023","22-9-2022","No",45)));
			
		}
	
	@Override
	public String addNewItem(FoodItems obj) throws DuplicateItemException{
		FoodItems f=(FoodItems)obj;
		try {
			if(items.contains(f))
				throw new DuplicateItemException();
			else {
				items.add(f);
				return "Item Added Successfully..";
			}
			}catch(DuplicateItemException ex)
			{
				throw ex;
			}
	}
@Override
	public String addNewItem(Apparel obj) throws DuplicateItemException{
		return "";
	}
@Override
	public String addNewItem(Electronics obj) throws DuplicateItemException{
		return "";
	}
	@Override
	public void listAll() {
		Comparator<FoodItems> compareByQty = new Comparator<FoodItems>() {
		    @Override
		    public int compare(FoodItems o1, FoodItems o2) {
		        return (int)(o2.getQty()-o1.getQty());
		        	
		    }
		};
		int i=0;
		Collections.sort(items, compareByQty);
		
		for(Object f: items)
		{
			i++;
			FoodItems c=(FoodItems)f;
			System.out.println(c.getItemCode()+" "+c.getName()+" "+c.getQty()+" "+c.getVeg());
			if(i==3)
				return;
		}
	}

}
