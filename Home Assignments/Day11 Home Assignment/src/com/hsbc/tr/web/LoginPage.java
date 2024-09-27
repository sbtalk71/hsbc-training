package com.hsbc.tr.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginPage
 */
public class LoginPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");      
	       PrintWriter out = response.getWriter();                
	       String name=request.getParameter("uname");      
	       String pass=request.getParameter("upassword");                
	       if(name.equals(pass))
	       {          
	          RequestDispatcher dis=request.getRequestDispatcher("welcome");          
	          dis.forward(request, response);      
	       }     
	       else
	       {      
	          out.print("User name or password is incorrect!");          
	          RequestDispatcher dis=request.getRequestDispatcher("login.html");          
	          dis.include(request, response);                                
	       }   
	       out.print("<a href=\"http://www.google.co.in\">Enter here for redirect to google</a>");
	}

	
	
}
