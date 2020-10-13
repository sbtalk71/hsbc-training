package com.demo.spring;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.hsbc.tr.spring.entity.Emp;

public class POSTClient {

	public static void main(String[] args) {
		RestTemplate rt = new RestTemplate();

		
		//http Header
		HttpHeaders headers=new HttpHeaders();
		headers.set("Accept", MediaType.TEXT_PLAIN_VALUE);
		headers.set("Content-Type", MediaType.APPLICATION_JSON_VALUE);
		
		Emp e= new Emp(112, "Manu", "Ranchi", 56000);
		
		//http Body
		HttpEntity httpRequest=new HttpEntity<>(e,headers);
		
		ResponseEntity<String> response2=rt.exchange("http://localhost:8080/emp/save", 
				HttpMethod.POST, httpRequest, String.class);
		
		System.out.println(response2.getBody());

	}

}
