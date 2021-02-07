package com.hsbc.tr.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.json.JSONObject;

import com.hsbc.tr.web.entity.Emp;


/**
 * 
 * @author Megha agarwal
 * Class to demonstrate use of REST based on type of data requested from client
 *
 */
@WebServlet("/api")
public class RestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
		try {
				
			Emp e=new Emp(103,"Megha","Agra",67000);
			
			if(request.getHeader("Accept").equals("application/json")) {
				response.setContentType("text/json");
				JSONObject obj=new JSONObject(e);
				response.getWriter().write(obj.toString());
			}
			else if(request.getHeader("Accept").equals("application/xml")) {
				
				response.setContentType("text/xml");
				JAXBContext context=JAXBContext.newInstance(Emp.class);
				Marshaller marshaller=context.createMarshaller();
				marshaller.marshal(e,response.getWriter());
				
			}
			else {
				response.sendError(406);
			}
			
			
			
		} catch (Exception ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		
	}

}
