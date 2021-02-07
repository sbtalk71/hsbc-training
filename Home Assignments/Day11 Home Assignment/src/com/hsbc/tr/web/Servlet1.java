package com.hsbc.tr.web;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * Servlet implementation class Servlet1
 */
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		String name=getServletConfig().getInitParameter("name");
		String password=getServletConfig().getInitParameter("password");
		String jdbcurl=getServletConfig().getInitParameter("jdbcurl");
		
		out.print("<h2>Name :"+name+"</h2>");
		out.print("<h2>Password :"+password+"</h2>");
		out.print("<h2>JDBC URL :"+jdbcurl+"</h2>");
		
		
		
		
		
	}

	
}


