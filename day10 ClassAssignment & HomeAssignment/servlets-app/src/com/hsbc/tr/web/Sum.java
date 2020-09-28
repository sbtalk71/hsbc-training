package com.hsbc.tr.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Sum extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String s1 = req.getParameter("number1");
		String s2 = req.getParameter("number2");
		if (s1 == null || s2 == null) {
			out.print("Invalid Input");
		} else {
			int a = Integer.parseInt(s1);
			int b = Integer.parseInt(s1);

			int res = a + b;

			out.print(res);
		}

	}
}
