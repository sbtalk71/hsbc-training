package com.hsbc.tr.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;

import org.json.JSONObject;

import com.hsbc.tr.web.entity.Emp;

@WebServlet("/api")
public class RestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id = request.getParameter("id");

		response.setContentType("text/xml");
		try {
			Emp e = new Emp(Integer.parseInt(id), "supriya", "singrauli", 54000);

			if (request.getHeader("Accept").equals("application/json")) {
				response.setContentType("application/json");
				JSONObject obj = new JSONObject(e);
				response.getWriter().write(obj.toString());

			} else if (request.getHeader("Accept").equals("application/xml")) {
				response.setContentType("application/xml");
				JAXBContext context = JAXBContext.newInstance(Emp.class);
				javax.xml.bind.Marshaller marshaller = context.createMarshaller();
				marshaller.marshal(e, response.getWriter());
			} else {
				response.sendError(406);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
