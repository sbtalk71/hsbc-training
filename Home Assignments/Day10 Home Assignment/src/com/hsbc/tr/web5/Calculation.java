package com.hsbc.tr.web5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Calculation extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		int a=Integer.parseInt(req.getParameter("num1"));
		int b=Integer.parseInt(req.getParameter("num2"));
		String op=req.getParameter("operation");
		if(op.equalsIgnoreCase("add"))
			out.write("<h1> The addition of the two numbers are :"+(a+b)+"</h1>");
		else if(op.equalsIgnoreCase("subtract"))
			out.write("<h1> The subtraction of the two numbers are :"+(a-b)+"</h1>");
		else if(op.equalsIgnoreCase("multiply"))
			out.write("<h1> The multiplication of the two numbers are :"+(a*b)+"</h1>");
		else if(op.equalsIgnoreCase("divide"))
		out.write("<h1> The division of the two numbers are :"+(a/b)+"</h1>");
		else
			out.write("<h1 style=\"color:red\">Wrong choice!!<h1>");
	}

}
