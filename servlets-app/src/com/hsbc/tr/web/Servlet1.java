package com.hsbc.tr.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Servlet1 extends GenericServlet {
	
	private int x=10;
	
	public Servlet1() {
		System.out.println("Servlet created...");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Init is called....");
	}

	@Override
	public void destroy() {
		System.out.println(" Destroy method called...");
	}

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {

		System.out.println(" service(...) method called...");
		PrintWriter out = resp.getWriter();
		out.write("<h1>This is my first Servlet</h1>");

	}

}
