package com.hsbc.tr.q2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class S1
 */
public class S1 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			
			String  mode=request.getParameter("mode");
			
			out.write("<h2>this is servlet s1</h2>");
			switch (mode) {
			case "forward": RequestDispatcher rd=request.getRequestDispatcher("/s2");
										rd.forward(request,response);
										break;
										
			case "include": RequestDispatcher rd1=request.getRequestDispatcher("/s3");
										rd1.include(request,response);
										break;
			case "redirect": response.sendRedirect("http://www.google.com");
										break;
			default:	out.print("<h2>Not a valid choice</h2>");
							break;
			}
	}

}
