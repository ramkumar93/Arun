package com.arunp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HomeServlet extends HttpServlet  {

	public void doGet(HttpServletRequest req,HttpServletResponse resp) 
			throws IOException,ServletException{
			   this.doPost(req,resp);

	}
			
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		System.out.println("in other servlet");
		
	
     try {
    	 RequestDispatcher rd=req.getRequestDispatcher("/home.jsp");  
		rd.forward(req, resp);
	} catch (ServletException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
