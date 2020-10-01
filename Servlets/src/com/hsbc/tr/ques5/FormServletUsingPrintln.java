package com.hsbc.tr.ques5;

import java.io.IOException;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormServletUsingPrintln extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<form action=\"HttpServletDemo\">");
		out.println("Name:<input type=\"text\"name=\"name\"</br>");
		out.println(" </br>");
		out.println("Email:<input type=\"text\"name=\"email\"</br>");

		out.println("<input type =\"submit\" value=\"Find\">");
		out.println("</form>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
