package com.arunp;

import java.io.IOException;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.jdo.annotations.Persistent;

import com.arun.Oldapplicanttable;

@SuppressWarnings("serial")
public class Login1Servlet extends HttpServlet {
	public void doPost1(HttpServletRequest req, HttpServletResponse resp)  throws IOException
		{
			this.doPost1(req, resp);
		}
	

	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		
			HttpSession session = req.getSession();
			PersistenceManager p = Pmf.get().getPersistenceManager();
			Oldapplicanttable person9			=	new Oldapplicanttable();

			System.out.println("step1");
			
			 Long uname 					    = 	Long.valueOf(req.getParameter("userid"));
			 String passwd = req.getParameter("userpass");
			
			System.out.println("step2");
			
			Query q = p.newQuery(Oldapplicanttable.class);
			try{
					//	q.setFilter("email == '"+uname+"' && password == '"+passwd+"'");
				System.out.println("step3");
				
				q.setFilter("userid == '"+uname+"' && userpass =='"+passwd+"'");
				System.out.println("step8");
			List<Oldapplicanttable> person = (List<Oldapplicanttable>) q.execute();
			System.out.println("step9");
			//boolean a = !result.isEmpty();
			System.out.println("step10");
			// if(a==false) {
				  System.out.println("step4");
			    for (Oldapplicanttable user : person) {
			      // Process result user 
			    	System.out.println("step5");
			    	String username = user.getUserid();
			    	System.out.println("Retrived : "+username);
			    	System.out.println("Uesr Entry : "+uname);
			    	String name = user.getUserid();
			    	String password = user.getUserpass();
			    	System.out.println("Retrived : "+password);
			    	System.out.println("User Entry : "+passwd);
				    	//if(username.equals(uname) && password.equals(passwd))
			    	if(password.equals(passwd))
				    	{System.out.println("step6");
				    	session.setAttribute("username", name);
				    	session.setAttribute("userpass", password);
				    	System.out.println("above redirect");
				    	resp.sendRedirect("/home.html");
				    	//req.getRequestDispatcher("/listnameretrive").forward(req, resp);
				    	//System.out.println("below redirect");
				    	}
				    	/*else
				    	{
				    		req.setAttribute("error", "Not a Valid User.");
				    		req.getRequestDispatcher("login.jsp").forward(req, resp);
				    	}*/
			    }
			  //} else {
			    // Handle "no results" case
				  System.out.println("step7");
				  req.setAttribute("error", "Not a Valid User.");
		    		req.getRequestDispatcher("/applicant.html").include(req, resp);
				  System.out.println("Please Enter Valid Username and Password..");
			  //}
		}catch(Exception e)
		{
			System.out.println("step8");
			System.out.println(e);
		}finally {
			q.closeAll();
			p.close();	 
			}
			p.makePersistent(person9);			
	}
}
