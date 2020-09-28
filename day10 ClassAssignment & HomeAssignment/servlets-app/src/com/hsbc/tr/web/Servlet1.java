package com.hsbc.tr.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.GenericSignatureFormatError;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Servlet1 extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {

		PrintWriter out = resp.getWriter();
		out.write("<h1>This is my first Servlet</h1>");
	}

	@Override
	public void destroy() {
		System.out.println("Destroy method called");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Init is called");
	}

}
