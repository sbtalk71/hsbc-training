import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

public class FileJSON {
	public static void main(String[] args) {
		Customer[] cust=new Customer[5];
		JSONObject custJson=new JSONObject();
		
		//for(int i=0;i<5;i++)
			//cust[i]=new Customer(201+i,"name"+i,"pune"+i,85000+100*i);
		
		for(int i=0;i<5;i++)
		System.out.println(cust[i].getAccountBalance()+" "+cust[i].getAddress() );
		System.out.println(custJson);
		custJson.put("customer", cust);
		try {
			
			FileWriter fw=new FileWriter("customer.json", true);
			fw.write(custJson.toString());
			fw.close();
		}catch(IOException e)
		{
			System.out.println(e);
		}
	}

}
