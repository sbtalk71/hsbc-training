package com.hsbc.tr.web4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TryHttpServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.write("<html<<head><title>Form</title></head><body><form action=\"#\" method=\"post\"><table><tr><td>Enter the name</td>");
		out.write("<td><input type=\"text\" name=\"name\"></td></tr><tr><td>Enter the email</td><td><input type=\"text\" name=\"email\"></td>");
		out.write("</tr><tr><td><input type=\"button\" name=\"submit\" value=\"submit\"></td></tr></table></form></body></html>");
		
		
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		out.write("<h1>The submitted details are : </h1><br/>");
		out.write("<h2> Name : "+name+"</h2><br/>");
		out.write("<h2> EMAIL :"+email+"</h2><br/>");
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
