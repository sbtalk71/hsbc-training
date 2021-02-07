/**
 * @author Muskan Karnani
 * Implementation of interdface methods for Electronics
 */
package com.demo.app;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import com.demo.app.entity.Apparel;
import com.demo.app.entity.Electronics;
import com.demo.app.entity.FoodItems;

public class ElectronicsImpl implements DataStorage {

	//stores data of Electronics in LIST as test data
		static List<Electronics> items =new LinkedList<Electronics>();
		public ElectronicsImpl()
		{
			items.add((new Electronics(100,"Tshirt",20,20,25)));
			items.add((new Electronics(101,"Shirt",25,30,58)));
			items.add((new Electronics(102,"Sweater",35,20,21)));
			items.add((new Electronics(103,"Pant",98,30,80)));
			items.add((new Electronics(104,"Jeans",57,10,45)));
			
		}
	@Override
	public String addNewItem(Electronics obj) throws DuplicateItemException {
		Electronics a=(Electronics)obj;
		try {
			if(items.contains(a))
				throw new DuplicateItemException();
			else {
				items.add(a);
				return "Item Added Successfully..";
			}
			}catch(DuplicateItemException ex)
			{
				throw ex;
			}
	}
	public String addNewItem(FoodItems obj) throws DuplicateItemException {
		return null;
	}
	public String addNewItem(Apparel obj) throws DuplicateItemException {
		return null;
	}
	@Override
	public void listAll() {
		Comparator<Electronics> compareByQty = new Comparator<Electronics>() {
		    @Override
		    public int compare(Electronics o1, Electronics o2) {
		        return (int)(o2.getQty()-o1.getQty());
		        	
		    }
		};
		int i=0;
		Collections.sort(items, compareByQty);
		for(Object f: items)
		{
			i++;
			Electronics c=(Electronics)f;
			System.out.println(c.getItemCode()+" "+c.getName()+" "+c.getQty()+" "+c.getWarranty());
			if(i==3)
				return;
		}
	}

}
