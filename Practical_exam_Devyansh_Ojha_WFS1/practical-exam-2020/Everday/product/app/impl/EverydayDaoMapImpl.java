
/**
 * @Devyansh_Ojha
 * The below class is used to manipulate the data filled up for each category
 */
package Everday.product.app.impl;

import everyday.product.app.dao.EverydayDao;
import everyday.product.app.dao.ProductNotFoundException;
import everyday.product.app.entity.EverydayApparel;
import everyday.product.app.entity.EverydayElectronics;
import everyday.product.app.entity.EverydayFoodItems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EverydayDaoMapImpl implements EverydayDao {

	static Map<Integer, EverydayFoodItems> fooditemsDB = new HashMap<>();
	static Map<Integer, EverydayApparel> apparelDB = new HashMap<>();
	static Map<Integer, EverydayElectronics> electronicsDB = new HashMap<>();

	public EverydayDaoMapImpl() {

		fooditemsDB.put(100, new EverydayFoodItems(100, "Bread", 20.0, "12/01/2020", "15/01/2020", true, 100));
		fooditemsDB.put(200, new EverydayFoodItems(200, "Juice", 10.0, "12/01/2020", "15/01/2020", true, 200));
		fooditemsDB.put(300, new EverydayFoodItems(300, "Lime", 80.0, "12/01/2020", "15/01/2020", true, 300));
		fooditemsDB.put(400, new EverydayFoodItems(400, "Cake", 90.0, "12/01/2020", "15/01/2020", true, 400));
		fooditemsDB.put(500, new EverydayFoodItems(500, "IceCream", 50.0, "12/01/2020", "15/01/2020", true, 500));

		apparelDB.put(600, new EverydayApparel(600, "A", 445.25, "Large", "Cotton", 100));
		apparelDB.put(700, new EverydayApparel(700, "x", 465.25, "Large", "Cotton", 200));
		apparelDB.put(800, new EverydayApparel(800, "y", 435.25, "Large", "Cotton", 300));
		apparelDB.put(900, new EverydayApparel(900, "z", 225.25, "Large", "Cotton", 400));
		apparelDB.put(1000, new EverydayApparel(1000, "g", 555.25, "Large", "Cotton", 500));

		electronicsDB.put(111, new EverydayElectronics(111, "Lcd", 323.5, 12, 100));
		electronicsDB.put(222, new EverydayElectronics(222, "Led", 343.5, 12, 200));
		electronicsDB.put(333, new EverydayElectronics(333, "tv", 322.5, 12, 300));
		electronicsDB.put(444, new EverydayElectronics(444, "mic", 443.5, 12, 400));
		electronicsDB.put(555, new EverydayElectronics(555, "radio", 3253.5, 12, 500));
	}

	public EverydayApparel findByIdApparel(int id) throws ProductNotFoundException {
		try {
			if (apparelDB.containsKey(id)) {
				return apparelDB.get(id);
			} else {
				throw new ProductNotFoundException();
			}

		} catch (ProductNotFoundException e) {
			throw e;
		}
	}

	public EverydayFoodItems findByIdFoodItems(int id) throws ProductNotFoundException {
		try {
			if (fooditemsDB.containsKey(id)) {
				return fooditemsDB.get(id);
			} else {
				throw new ProductNotFoundException();
			}

		} catch (ProductNotFoundException e) {
			throw e;
		}
	}

	public EverydayElectronics findByIdeElectronics(int id) throws ProductNotFoundException {
		try {
			if (electronicsDB.containsKey(id)) {
				return electronicsDB.get(id);
			} else {
				throw new ProductNotFoundException();
			}

		} catch (ProductNotFoundException e) {
			throw e;
		}

	}

	@Override
	public EverydayElectronics findByIdElectronics(int id) throws ProductNotFoundException {

		try {
			if (electronicsDB.containsKey(id)) {
				return electronicsDB.get(id);
			} else {
				throw new ProductNotFoundException();
			}
		} catch (ProductNotFoundException e) {
			throw e;
		}
	}

	@Override
	public void addFoodItems(int itemcode, String itemname, double unitprice, String dateofmanufacture,
			String dateofexpiry, boolean vegetarian, int quantity) {
		fooditemsDB.put(130, new EverydayFoodItems(100, "Bread", 20.0, "12/01/2020", "15/01/2020", true, 100));

	}

	@Override
	public void addApparel(int itemcode, String itemname, double unitprice, String size, String material,
			int quantity) {
		apparelDB.put(450, new EverydayApparel(600, "A", 445.25, "Large", "Cotton", 100));

	}

	@Override
	public void addElectronics(int itemcode, String itemname, double unitprice, int waranty, int quantity) {
		electronicsDB.put(131, new EverydayElectronics(111, "Lcd", 323.5, 12, 100));

	}

	@Override
	public List<EverydayFoodItems> listAllFoodItems() {

		ArrayList<EverydayFoodItems> fList = new ArrayList(fooditemsDB.values());

		return fList;
	}

	@Override
	public List<EverydayApparel> listAllApparel() {

		ArrayList<EverydayApparel> aList = new ArrayList(apparelDB.values());

		return aList;
	}

	@Override
	public List<EverydayElectronics> listAllElectronics() {

		ArrayList<EverydayElectronics> eList = new ArrayList(electronicsDB.values());

		return eList;
	}

	@Override
	public String saveFood(EverydayFoodItems e) {

		if (fooditemsDB.containsKey(e.getItemcode())) {
			return "Product already exists";
		} else {
			fooditemsDB.put(e.getItemcode(), e);
			return "Registered successfully";
		}
	}

	@Override
	public String saveFood(EverydayApparel e) {
		if (apparelDB.containsKey(e.getItemcode())) {
			return "Product already exists";
		} else {
			apparelDB.put(e.getItemcode(), e);
			return "Registered successfully";
		}
	}

	@Override
	public String saveFood(EverydayElectronics e) {

		if (electronicsDB.containsKey(e.getItemcode())) {
			return "Product already exists";
		} else {
			electronicsDB.put(e.getItemcode(), e);
			return "Registered successfully";
		}
	}

}
