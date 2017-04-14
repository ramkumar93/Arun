package com.arunp;

	
import java.io.*;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;  

	
	import javax.servlet.RequestDispatcher;
	import javax.servlet.ServletException;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;
	import java.io.PrintWriter;
	import java.util.List;

import com.arun.Applicanttable;
//import com.arun.Applicanttable;
import com.arun.Oldapplicanttable;
//import com.arun.Previewtable;
	  
	public class OldapplicantServlet extends HttpServlet {  
	  
	public void doPost(HttpServletRequest request, HttpServletResponse response)  
	        throws ServletException, IOException {  
	  
		
		PersistenceManager pm 	= 	Pmf.get().getPersistenceManager();
		HttpSession session = request.getSession();

	    //Long n 					    = 	Long.valueOf(request.getParameter("userid"));
	    String userid	=	request.getParameter("userid");
	    String userpass	=	request.getParameter("userpass");
	    
	   try
		{
		Query q1 = pm.newQuery(Applicanttable.class);
		q1.setFilter("userid== '"+userid+"' && userpass == '"+userpass+"'");
		List<Applicanttable> user = (List<Applicanttable>) q1.execute();
		
			 if(!user.isEmpty()){  
				 System.out.println("inside user is empty");
				 session.setAttribute("username", userid);
	    		        RequestDispatcher rd=request.getRequestDispatcher("/home");  
	    		        rd.forward(request, response);
			 			}  
			 	else{  
			 		request.setAttribute("message", "Username or Password are wrong.. Please Check");
	    		    	RequestDispatcher rd=request.getRequestDispatcher("/applicant.jsp");  
	    		        rd.include(request, response);  
	    		      	}
			
		}
		catch(Exception e){
		}  
	  
	}
}