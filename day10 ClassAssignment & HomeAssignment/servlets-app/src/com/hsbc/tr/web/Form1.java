package com.hsbc.tr.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Form1 extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		out.write("<form action=\"test3\">");
		out.write("Name:<input type=\"text\" name=\"username\"</br>");
		out.write("<input type=\"submit\" value=\"Find\">");

		out.write("</form>");
	}

}
