package com.arunp;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.arun.Academictable;
import com.arun.Applicanttable;
import com.arun.Contacttable;
import com.arun.Coursetable;
import com.arun.Oldapplicanttable;
import com.arun.Personaltable;
import com.arun.Previewtable;

@SuppressWarnings("serial")
public class ApplicantServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		
		PersistenceManager pm 	= 	Pmf.get().getPersistenceManager();
		
		HttpSession session = req.getSession();
		
		Applicanttable person5			=	new Applicanttable();
		
	
		String userid 					= 	(String)req.getParameter("userid");
		String userpass 				= 	(String) req.getParameter("userpass");
		String usercfmpass				=	(String) req.getParameter("usercfmpass");
		
		System.out.println("User id is : "+userid);
		System.out.println("User pass is : "+userpass);
		System.out.println("User pass is : "+usercfmpass);
		
		
		Query q1 = pm.newQuery(Applicanttable.class);
		q1.setFilter("userid == '"+userid+"'");
		List<Applicanttable> matched = (List<Applicanttable>) q1.execute();
		
		System.out.println("Size : "+matched.size());
		if(matched.isEmpty())
		{
			session.setAttribute("username", userid);
			System.out.println(session.getAttribute("username"));
			person5.setUserid((String)session.getAttribute("username"));
			person5.setUserpass(userpass);
			
			pm.makePersistent(person5);
			
			resp.sendRedirect("/home");
//			 RequestDispatcher rd=req.getRequestDispatcher("/home");  
//		        rd.forward(req, resp);
			//User Already Esist
		}
		else
		{
			System.out.println("Not Empty");
			req.setAttribute("message", "Username Already exist. Please Login");
			 RequestDispatcher rd=req.getRequestDispatcher("/applicant.jsp");  
	        rd.forward(req, resp);
			
		}
		
		
		
		
		/*if(usercfmpass.equals(userpass))
		{
		person5.setUserid(userid);
		person5.setUserpass(userpass);
		
		pm.makePersistent(person5);
		
		//resp.setContentType("text/plain");
		//resp.getWriter().println("Data Stored");
		
		session.setAttribute("username", userid);
		 RequestDispatcher rd=req.getRequestDispatcher("/oldapplicant.html");  
	        rd.forward(req, resp);
		}
		else
		{
			pw.println("password and conform must be same");	
			RequestDispatcher rd=req.getRequestDispatcher("/applicant.html");  
			rd.include(req, resp);  
		}*/
		
		
	}
	
}