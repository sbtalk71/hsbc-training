/**
 * @author Muskan Karnani
 * this is the servlet class that controls everything
 */


package com.hsbc.tr.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RegisterControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String action=request.getParameter("action");
		CustomerDao service=new CustomerDao();

		
		if(action.equalsIgnoreCase("register"))
		{
			//System.out.println("REGISTER");
			String email=request.getParameter("mail");
			String fname=request.getParameter("fname");
			String lname=request.getParameter("lname");
			String phone=request.getParameter("phone");
			if(service.register(email, fname, lname, phone))
			{
				//save the request
				
				String mail=(String)request.getSession().getAttribute("email");
				String software=(String)request.getSession().getAttribute("software");
				String os=(String)request.getSession().getAttribute("os");
				String problem=(String)request.getSession().getAttribute("problem");
				System.out.println(mail+" "+os);
				service.save(mail, software, os, problem);
				request.getRequestDispatcher("/Response.jsp").forward(request, response);
			}
			
		} if(action.equalsIgnoreCase("Add Request")) {
//			System.out.println("I AM IN ADD REQUEST");
			String email=request.getParameter("email");
			String software=request.getParameter("software");
			String os=request.getParameter("os");
			String problem=request.getParameter("problem");
			if(service.validate(email))
			{
				service.save(email, software, os, problem);
				request.getRequestDispatcher("/Response.jsp").forward(request, response);
			}else {
				request.getSession().setAttribute("email", email);
				request.getSession().setAttribute("os", os);
				request.getSession().setAttribute("software", software);
				request.getSession().setAttribute("problem", problem);
				request.getRequestDispatcher("/CustomerRegistration.jsp").forward(request, response);
			}
		}
		
	}

}
