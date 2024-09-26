package com.hsbc.tr.day9.hwassignment;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();  
		          
		String n=request.getParameter("userName");  
		//String p=request.getParameter("userPass");  
		String e=request.getParameter("userEmail");  
		String g=request.getParameter("userGender");  
		String c=request.getParameter("userCountry"); 
		  
				
		
		out.println("<br>");
		out.println("Name: "+n);
		out.println("<br>");
		out.println("Email: "+e);
		out.println("<br>");
		out.println("Gender: "+g);
		out.println("<br>");		
		out.println("Country: "+c);
	}

	
	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
