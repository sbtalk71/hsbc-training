/**
 * @Devyansh_Ojha
 * This class is used to implement DAO feature where each and every 
 * feature of each connecting classes are describing there functions
 * required.
 */
package everyday.product.app.dao;

import java.util.List;

import everyday.product.app.entity.EverydayApparel;
import everyday.product.app.entity.EverydayElectronics;
import everyday.product.app.entity.EverydayFoodItems;

public interface EverydayDao {

	public EverydayFoodItems findByIdFoodItems(int id) throws ProductNotFoundException;

	public EverydayApparel findByIdApparel(int id) throws ProductNotFoundException;

	public EverydayElectronics findByIdElectronics(int id) throws ProductNotFoundException;

	public void addFoodItems(int itemcode, String itemname, double unitprice, String dateofmanufacture,
			String dateofexpiry, boolean vegetarian, int quantity);

	public void addApparel(int itemcode, String itemname, double unitprice, String size, String material, int quantity);

	public void addElectronics(int itemcode, String itemname, double unitprice, int waranty, int quantity);

	public List<EverydayFoodItems> listAllFoodItems();

	public List<EverydayApparel> listAllApparel();

	public List<EverydayElectronics> listAllElectronics();

	public String saveFood(EverydayFoodItems e);

	public String saveFood(EverydayApparel e);

	public String saveFood(EverydayElectronics e);
}
