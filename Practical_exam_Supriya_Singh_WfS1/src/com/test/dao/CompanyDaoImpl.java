package com.test.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.test.entity.apparel.Apparel;
import com.test.entity.electronics.Electronics;
import com.test.entity.fooditems.FoodItems;

public class CompanyDaoImpl implements CompanyDao {

	static Map<Integer, Electronics> comdb = new HashMap<>();
	static Map<Integer, FoodItems> fooddb = new HashMap<>();
	static Map<Integer, Apparel> appdb = new HashMap<>();

	public CompanyDaoImpl() {
		comdb.put(101, new Electronics(101, "Tv", 3000, 12, 100));
		comdb.put(102, new Electronics(102, "Mobile", 8000, 24, 97));
		comdb.put(103, new Electronics(103, "watch", 80000, 10, 54));
		comdb.put(104, new Electronics(104, "Tablet", 18000, 34, 87));

		fooddb.put(101, new FoodItems(101, "Bread", 30, "12/10/19", "21/11/19", true, 100));
		fooddb.put(102, new FoodItems(102, "Burger", 30, "12/10/19", "21/11/19", false, 70));
		fooddb.put(103, new FoodItems(103, "sandwich", 30, "12/10/19", "21/11/19", true, 10));

		appdb.put(101, new Apparel(101, "saree", 3000, "chiffon", 100));
		appdb.put(102, new Apparel(102, "tshirt", 300, "cotton", 10));
		appdb.put(103, new Apparel(103, "blazer", 6000, "cotton", 50));

	}

//add items to Electronics class
	@Override
	public String addItems(Electronics obj) {
		if (comdb.containsKey(obj.getItemCode())) {
			return "Item Already present";

		} else {
			comdb.put(obj.getItemCode(), obj);
			return "Item Added";
		}

	}

//display Electronics class items
	@Override
	public List<Electronics> retrieve() {
		ArrayList<Electronics> cusList = new ArrayList<>(comdb.values());
		return cusList;
	}

	// add items to FoodItems class
	@Override
	public String addFood(FoodItems obj1) {
		if (fooddb.containsKey(obj1.getItemCode())) {
			return "Food Item Already present";

		} else {
			fooddb.put(obj1.getItemCode(), obj1);
			return " FOod Item Added";
		}

	}
	// display FoodItems class data

	@Override
	public List<FoodItems> retrieveFoodItems() {

		ArrayList<FoodItems> foodList = new ArrayList<>(fooddb.values());
		return foodList;
	}

	// add items to Apparel class
	@Override
	public String addApparel(Apparel obj2) {
		if (appdb.containsKey(obj2.getItemCode())) {
			return "Apparel Already present";

		} else {
			appdb.put(obj2.getItemCode(), obj2);
			return " Apparel Added";
		}

	}
	// display Apparel class data

	@Override
	public List<Apparel> retrieveApparel() {

		ArrayList<Apparel> appList = new ArrayList<>(appdb.values());
		return appList;
	}

}
