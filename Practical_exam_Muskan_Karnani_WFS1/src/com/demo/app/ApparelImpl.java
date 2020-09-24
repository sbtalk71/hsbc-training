/**
 * @author Muskan Karnani
 * Implementation of interdface methods for Apparel
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

public class ApparelImpl implements DataStorage {

	//stores data of Apparel in LIST as test data
	static List<Apparel> items =new LinkedList<Apparel>();
	public ApparelImpl()
	{
		items.add((new Apparel(100,"Tshirt",20,"Large","Cotton",25)));
		items.add((new Apparel(101,"Shirt",25,"Small","Woolen",58)));
		items.add((new Apparel(102,"Sweater",35,"Large","Woolen",21)));
		items.add((new Apparel(103,"Pant",98,"Small","Cotton",80)));
		items.add((new Apparel(104,"Jeans",57,"Small","Woolen",45)));
		
	}

	@Override
	public String addNewItem(Apparel obj) throws DuplicateItemException {
		Apparel a=(Apparel)obj;
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
	public String addNewItem(Electronics obj) throws DuplicateItemException {
		return null;
	}
	public String addNewItem(FoodItems obj) throws DuplicateItemException {
		return null;
	}

	@Override
	public void listAll() {
		Comparator<Apparel> compareByQty = new Comparator<Apparel>() {
		    @Override
		    public int compare(Apparel o1, Apparel o2) {
		        return (int)(o2.getQty()-o1.getQty());
		        	
		    }
		};
		int i=0;
		Collections.sort(items, compareByQty);
		for(Object f: items)
		{
			i++;
			Apparel c=(Apparel)f;
			System.out.println(c.getItemCode()+" "+c.getName()+" "+c.getQty()+" "+c.getSize()+" "+c.getMaterial());
			if(i==3)
				return;
		}
	}

}
