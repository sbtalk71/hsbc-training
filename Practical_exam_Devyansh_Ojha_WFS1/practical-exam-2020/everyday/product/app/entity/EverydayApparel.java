/**
 * @Devyansh_Ojha
 * The below class is used to organize the Everyday Apparel
 */
package everyday.product.app.entity;

public class EverydayApparel {
	private int itemcode;
	private String itemname;
	private double unitprice;
	private String size;
	private String material;
	private int quantity;

	public EverydayApparel() {

	}

	public EverydayApparel(int itemcode, String itemname, double unitprice, String size, String material,
			int quantity) {
		this.itemcode = itemcode;
		this.itemname = itemname;
		this.unitprice = unitprice;
		this.size = size;
		this.material = material;
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

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public boolean equals(Object obj) {
		EverydayApparel ea = (EverydayApparel) obj;
		if (ea.getItemcode() == this.getItemcode()) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.getItemcode();
	}

}
