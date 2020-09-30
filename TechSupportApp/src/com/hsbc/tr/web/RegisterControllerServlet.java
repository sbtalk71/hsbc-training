package com.hsbc.tr.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		TechSupportDao dao = new TechSupportDaoJdbcImpl();
		String action = request.getParameter("action");

		if (action.equals("register")) {
			String fname = request.getParameter("firstName");
			String lname = request.getParameter("lastName");
			String phone = request.getParameter("phoneNumber");
			String email = request.getParameter("email");

			TechSupportService service = new TechSupportService(dao);

			if (service.registerUser(email, fname, lname, phone)) {
				// save the request
				String mail = (String) request.getSession().getAttribute("email");
				String os_name = (String) request.getSession().getAttribute("os");
				String prob = (String) request.getSession().getAttribute("problem");
				String s_ware = (String) request.getSession().getAttribute("software");
				service.registerComplaint(mail, os_name, s_ware, prob);
				request.getRequestDispatcher("/confirm.jsp").forward(request, response);
			}

		} else if (action.equals("addRequest")) {
			String email = request.getParameter("email");
			String os = request.getParameter("os");
			String software = request.getParameter("software");
			String problem = request.getParameter("problem");
			TechSupportService service = new TechSupportService(dao);
			boolean emailValid = service.validateUser(email);
			if (emailValid) {
				if (service.registerComplaint(email, os, software, problem)) {
					request.getRequestDispatcher("/confirm.jsp").forward(request, response);
				}
			} else {
				request.getSession().setAttribute("email", email);
				request.getSession().setAttribute("os", os);
				request.getSession().setAttribute("software", software);
				request.getSession().setAttribute("problem", problem);
				request.getRequestDispatcher("/regform.jsp").forward(request, response);
			}
		} else {
			TechSupportService service = new TechSupportService(dao);
			List<String> reqList = service.listAll();
			request.getSession().setAttribute("list", reqList);
			request.getRequestDispatcher("/list.jsp").forward(request, response);
		}

	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		TechSupportDao dao = new TechSupportDaoJdbcImpl();
		TechSupportService service = new TechSupportService(dao);
		List<String> reqList = service.listAll();
		request.getSession().setAttribute("list", reqList);
		request.getRequestDispatcher("/list.jsp").forward(request, response);
	}

}
