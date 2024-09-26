package com.hsbc.tr.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hsbc.tr.web.entity.Customer;
import com.hsbc.tr.web.entity.Request;
import com.hsbc.tr.web.service.TechService;

/**
 * 
 * @author Megha agarwal
 * Servlet acting as controller for both type of requests:submit customer request and registering new customer
 *
 */
public class CheckUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		
		//accessing the service layer here
		TechService service = new TechService();
		HttpSession session = request.getSession(true);

		String action = request.getParameter("action");

		/**
		 * this block handles saving request of existing customer
		 */
		if (action.equals("reqSub")) {
			
			// session.setAttribute("email",email);

			String email = request.getParameter("email");
			String software = request.getParameter("software");
			String os = request.getParameter("os");
			String problem = request.getParameter("description");

			
			//making customer request a session attribute
			Request req1 = new Request(email, os, software, problem);
			session.setAttribute("request", req1);

			String fullname = service.userExist(email);
			
			/**
			 * check if user exists using email;
			 * If exists, save the request, otherwise redirect to register form and then save the request made
			 */
			if (fullname != null) {

				service.saveReq(req1);
				request.setAttribute("name", fullname);
				
				
			} else {
				request.getRequestDispatcher("/registerUser.jsp").forward(request, response);
			}
			
		}
		/**
		 * this block handles registering new customer and then saving the request made
		 */
		else if (action.equals("register")) {

			String email1 = ((Request) session.getAttribute("request")).getEmail();
			String fname = request.getParameter("fname");
			String lname = request.getParameter("lname");
			String pno = request.getParameter("pno");

			service.saveUser(new Customer(email1,fname,lname,pno));
			
			service.saveReq((Request) session.getAttribute("request"));
			
			request.setAttribute("name", fname+" "+lname);
			
		}

		request.getRequestDispatcher("/confirm.jsp").forward(request, response);

	}

}
