package com.arunp;

import java.io.IOException;

import javax.jdo.PersistenceManager;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.arun.Coursetable;

@SuppressWarnings("serial")
public class CourseServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
		
		PersistenceManager p4 	= 	Pmf.get().getPersistenceManager();
		Coursetable person4			=	new Coursetable();
		
		String graduate1 				= 	(String) req.getParameter("graduate");
		
		System.out.println("Graduation is "+graduate1);
		
		person4.setGraduate(graduate1);
		
		System.out.println("graduate is: "+ graduate1);
		p4.makePersistent(person4);
		
		resp.setContentType("text/plain");
		resp.getWriter().println("Data Stored");
		
	}
	
}