package com.hsbc.tr.web2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletMethods extends GenericServlet {
	
	public ServletMethods() {
		System.out.println("Servlet created...");
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("service() method called...");

	}
	@Override
	public void init() throws ServletException {
		System.out.println("Init is called...");
	}
	
	@Override
	public void destroy() {
		System.out.println("Servlet Destroyed...");
	}

}
