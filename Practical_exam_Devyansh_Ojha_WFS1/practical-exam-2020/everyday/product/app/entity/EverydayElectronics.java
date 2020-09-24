/**
 * @Devyansh_Ojha
 * The below class is used to organize the Everyday Electronics
 */
package everyday.product.app.entity;

public class EverydayElectronics {
	private int itemcode;
	private String itemname;
	private double unitprice;
	private int waranty;
	private int quantity;

	public EverydayElectronics() {

	}

	public EverydayElectronics(int itemcode, String itemname, double unitprice, int waranty, int quantity) {
		this.itemcode = itemcode;
		this.itemname = itemname;
		this.unitprice = unitprice;
		this.waranty = waranty;
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

	public int getWaranty() {
		return waranty;
	}

	public void setWaranty(int waranty) {
		this.waranty = waranty;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public boolean equals(Object obj) {
		EverydayElectronics ee = (EverydayElectronics) obj;
		if (ee.getItemcode() == this.getItemcode()) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.getItemcode();
	}
}
