package com.hsbc.tr.ques2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HttpServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public HttpServletDemo() {
        
    }

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out =res.getWriter();
		
		String name=req.getParameter("name");
		out.println("<h1> Hello,"+name+"</h1>");
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
