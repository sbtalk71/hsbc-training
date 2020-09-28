package com.hsbc.tr.web.q2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * 
 * @author Megha agarwal
 * Class extending GenericServlet class and printing the name received from printName.html
 *
 */
public class PrintName extends GenericServlet{
	
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		out.write("<h1>Hello, "+req.getParameter("name")+"</h1>");
	}

}
