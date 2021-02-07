package com.hsbc.tr.web.q1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * 
 * @author Megha Agarwal
 * Class extending GenericServlet class and printing greet message!
 *
 */
public class GenericServletExp extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		out.write("<h1>Welcome to Servlet Programming</h1>");

	}

}
