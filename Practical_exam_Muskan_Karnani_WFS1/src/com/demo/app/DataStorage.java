/**
 * @author Muskan Karnani
 * this is the interface
 */

package com.demo.app;

import java.util.Collection;

import com.demo.app.entity.Apparel;
import com.demo.app.entity.Electronics;
import com.demo.app.entity.FoodItems;

public interface DataStorage {
	public String addNewItem(FoodItems obj) throws DuplicateItemException;
	public String addNewItem(Apparel obj) throws DuplicateItemException;
	public String addNewItem(Electronics obj) throws DuplicateItemException;
	public void listAll();

}
