package com.arunp;

import java.io.IOException;

import javax.jdo.PersistenceManager;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.arun.Contacttable;

@SuppressWarnings("serial")
public class ContactServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
		
		PersistenceManager p2 	= 	Pmf.get().getPersistenceManager();
		Contacttable person2			=	new Contacttable();
		
		Long id1 					    = 	Long.valueOf(req.getParameter("id1"));
		String address 				= 	(String) req.getParameter("permanentaddress");
		
		System.out.println("Permanent Address "+address);
		
		person2.setId(id1);
		person2.setPermanentAddress(address);
		
		System.out.println("address is : "+ address);
		p2.makePersistent(person2);
		
		resp.setContentType("text/plain");
		resp.getWriter().println("Data Stored");
		
	}
	
}