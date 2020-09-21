package com.demo.io.data;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReadFromKB {

	public static void main(String[] args) throws Exception{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		String line="";
		System.out.println("Type 'exit' to end...");
		while(!(line=br.readLine()).equals("exit")) {
			System.out.println(line);
		}

	}

}
