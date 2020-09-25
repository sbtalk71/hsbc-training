package homeDay9.hsbc.jsondemo;

import java.io.FileWriter;
import java.io.IOException;
import org.json.JSONObject;


/**
 * 
 * @author Megha agarwal
 * Class creating json object, populating a customer array,add it to json object and finally write json object to json file
 *
 */
public class CreateJsonFileDemo {

	public static void main(String args[]) {
		
		Customer[] custObj=new Customer[5];			//creating customer object
		JSONObject custJson=new JSONObject();			//creating json object
	
		//populating customer array with dummy data
		for(int i=0;i<5;i++) 
			custObj[i]=new Customer(201,"Name"+i,"Pune",23000);
	
		//putting customer array object to json object
		custJson.put("customer", custObj);
		
		try {
			//writing json object to json file
		FileWriter fw=new FileWriter("customer.json",true);		
		fw.write(custJson.toString());
		fw.close();
		}
		catch(IOException ie) {
			System.out.println(ie);
		}
		
	}
}
