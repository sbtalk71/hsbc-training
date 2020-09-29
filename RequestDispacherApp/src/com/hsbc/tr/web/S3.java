package com.hsbc.tr.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class S3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name=getServletConfig().getInitParameter("name");
		String driver=getServletContext().getInitParameter("driver");
		
		
		out.print("<h2>Name :"+name+"</h2>");
		out.print("<h2>Driver :"+driver+"</h2>");
		out.print("<h1>This is Servlet S3</h1>");
		out.print("<h1>I am Included with S1</h1>");
	}

}
