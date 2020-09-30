package com.hsbc.tr.q1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WebInputDemo
 * Input given in web.xml and result displayed using servlet
 */
public class WebInputDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.write("<h2>Usename: "+getServletConfig().getInitParameter("Username")+"</h2>");
		out.write("<h2>Password: "+getServletConfig().getInitParameter("Password")+"</h2>");
		out.write("<h2>JDBCurl: "+getServletConfig().getInitParameter("JdbCurl")+"</h2>");
		
	}

}
