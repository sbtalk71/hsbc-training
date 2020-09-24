package com.demo.app;

import java.util.Collection;
import java.util.LinkedList;

import com.demo.app.entity.Apparel;
import com.demo.app.entity.Electronics;
import com.demo.app.entity.FoodItems;

public class ApparelImpl implements DataStorage {

	//stores data of Apparel in LIST as test data
	static Collection<Apparel> items =new LinkedList<Apparel>();
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
		for(Object f: items)
		{
			Apparel c=(Apparel)f;
			System.out.println(c.getItemCode()+" "+c.getName()+" "+c.getQty()+" "+c.getSize()+" "+c.getMaterial());
		}
	}

}
