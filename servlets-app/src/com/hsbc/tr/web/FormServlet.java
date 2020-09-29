package com.hsbc.tr.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FormServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.print("<form action = \"process\">");
		out.print("Name : <input  type= \"text\" name=\"username\"><br/>");
		out.print("<input type= \"submit\" value=\"Find\">");
		out.print("</form>");
	}

}
