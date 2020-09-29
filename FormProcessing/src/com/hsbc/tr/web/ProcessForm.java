package com.hsbc.tr.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.Naming;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProcessForm extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		String empId = req.getParameter("empId");
		String name = req.getParameter("name");
		String city = req.getParameter("city");
		String salary = req.getParameter("salary");
		
		out.print("<h1>Emp Registered With the given details</h1>");
		out.print("<h2>Emp Id: "+empId+"</h2>");
		out.print("<h2>Name  : "+name+"</h2>");
		out.print("<h2>City  : "+city+"</h2>");
		out.print("<h2>Salary: "+salary+"</h2>");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
