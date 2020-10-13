package com.demo.spring;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.hsbc.tr.spring.entity.Emp;

public class GETClient {

	public static void main(String[] args) {
		RestTemplate rt = new RestTemplate();

		ResponseEntity<String> response = rt.getForEntity("http://localhost:8080/emp/find/" + 104, String.class);

		System.out.println(response.getBody());

		ResponseEntity<Emp> response1 = rt.getForEntity("http://localhost:8080/emp/find/" + 104, Emp.class);

		System.out.println(response1.getBody().getName());
		
		//------------------------------//
		
		//http Header
		HttpHeaders headers=new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_XML_VALUE);
		
		//http Body
		HttpEntity httpRequest=new HttpEntity<>(headers);
		
		ResponseEntity<Emp> response2=rt.exchange("http://localhost:8080/emp/find/" + 104, 
				HttpMethod.GET, httpRequest, Emp.class);
		
		System.out.println(response2.getBody().getName());

	}

}
