package com.hsbc.tr.web.q4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 
 * @author Megha Agarwal
 * Class displays data received from form1.html
 *
 */
public class SubmitDataDemo extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			resp.setContentType("text/html");
			PrintWriter out=resp.getWriter();
			
			String name=req.getParameter("name");
			String email=req.getParameter("email");
			
			out.print("<h2>Details submitted:</h2>");
			out.print("<br>Name: "+name+"<br>Email: "+email);
	}

}
