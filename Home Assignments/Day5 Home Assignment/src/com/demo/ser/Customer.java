/**
 * @author Muskan Karnani
 * This is to store all the three customer details
 */
package com.demo.ser;
import java.io.Serializable;
public class Customer implements Serializable {
		private String customertId;
		private String name;
		private String address;
		public Customer(String customerId,String name,String address)
		{
			this.customertId=customerId;
			this.name=name;
			this.address=address;
		}
		public String getCustomertId() {
			return customertId;
		}
		public void setCustomertId(String customertId) {
			this.customertId = customertId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
	

}
