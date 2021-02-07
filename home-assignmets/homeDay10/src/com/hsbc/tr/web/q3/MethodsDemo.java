package com.hsbc.tr.web.q3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * 
 * @author Megha agarwal
 * Class overriding init,service and destroy method to observe their behaviour
 *
 */
public class MethodsDemo extends GenericServlet {
	
	@Override
	public void init() throws ServletException {
		System.out.println("init method invoked!!");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy method invoked!");
	}

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
			resp.setContentType("text/html");
			PrintWriter out=resp.getWriter();
			
			out.write("service invoked!");
	}

}
