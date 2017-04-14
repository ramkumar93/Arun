package com.arunp;

import java.io.IOException;

import javax.jdo.PersistenceManager;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.arun.Academictable;

@SuppressWarnings("serial")
public class AcademicServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
		
		PersistenceManager p3 	= 	Pmf.get().getPersistenceManager();
		Academictable person3			=	new Academictable();
		
		String sslcName1 				= 	(String) req.getParameter("sslcname");
		
		System.out.println("sslc school name "+sslcName1);
		
		person3.setSslcname(sslcName1);
		
		System.out.println("sslc name is : "+ sslcName1);
		p3.makePersistent(person3);
		
		resp.setContentType("text/plain");
		resp.getWriter().println("Data Stored");
		
	}
	
}