/**
 * @Devyansh_Ojha
 * The below class is used to organize the Everyday Food items
 */
package everyday.product.app.entity;

public class EverydayFoodItems {
	private int itemcode;
	private String itemname;
	private double unitprice;
	private String dateofmanufacture;
	private String dateofexpiry;
	private boolean vegetarian;
	private int quantity;

	public EverydayFoodItems() {

	}

	public EverydayFoodItems(int itemcode, String itemname, double unitprice, String dateofmanufacture,
			String dateofexpiry, boolean vegetarian, int quantity) {
		this.itemcode = itemcode;
		this.itemname = itemname;
		this.unitprice = unitprice;
		this.dateofmanufacture = dateofmanufacture;
		this.dateofexpiry = dateofexpiry;
		this.vegetarian = vegetarian;
		this.quantity = quantity;
	}

	public int getItemcode() {
		return itemcode;
	}

	public void setItemcode(int itemcode) {
		this.itemcode = itemcode;
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public double getUnitprice() {
		return unitprice;
	}

	public void setUnitprice(double unitprice) {
		this.unitprice = unitprice;
	}

	public String getDateofmanufacture() {
		return dateofmanufacture;
	}

	public void setDateofmanufacture(String dateofmanufacture) {
		this.dateofmanufacture = dateofmanufacture;
	}

	public String getDateofexpiry() {
		return dateofexpiry;
	}

	public void setDateofexpiry(String dateofexpiry) {
		this.dateofexpiry = dateofexpiry;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public boolean equals(Object obj) {
		EverydayFoodItems ed = (EverydayFoodItems) obj;
		if (ed.getItemcode() == this.getItemcode()) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.getItemcode();
	}

}
