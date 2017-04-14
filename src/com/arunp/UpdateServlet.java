package com.arunp;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.arunp.Pmf;
import com.arun.Applicanttable;
import com.arun.Personaltable;

@SuppressWarnings("serial")
public class UpdateServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in Upadate");
		
		PersistenceManager pm 	= 	Pmf.get().getPersistenceManager();
		
		String userid 					= 	(String) req.getSession().getAttribute("username");
		String name 					= 	(String) req.getParameter("firstname");
		String middleName 				= 	(String) req.getParameter("middlename");
		String lastName 				= 	(String) req.getParameter("lastname");
		String day 	    		    	= 	(String) req.getParameter("day");
		String month			 		= 	(String) req.getParameter("month");
		String year				 		= 	(String) req.getParameter("year");
		String age				 		= 	(String) req.getParameter("age");
		String gender	 				= 	(String) req.getParameter("gender");
		String fatherName 				= 	(String) req.getParameter("fathername");
		String fatherOccupation 		= 	(String) req.getParameter("fatheroccupation");
		String motherName 				= 	(String) req.getParameter("mothername");
		String annualIncome 			= 	(String) req.getParameter("annualincome");
		String religion 				= 	(String) req.getParameter("religion");
		String caste			 		= 	(String) req.getParameter("caste");
		String stp 						= 	(String) req.getParameter("stp");
		String exserviceman 			= 	(String) req.getParameter("exserviceman");
		String bloodGroup 				= 	(String) req.getParameter("bloodgroup");
		
		Query q1 = pm.newQuery(Personaltable.class);
		q1.setFilter("F_Key == '"+userid+"'");
		List<Personaltable> user = (List<Personaltable>) q1.execute();
		
		System.out.println("Size : "+user.size());
		
		if(!user.isEmpty())
		{
			for(Personaltable person : user)
			{
				person.setFirstName(name);
				person.setMiddleName(middleName);
				person.setLastName(lastName);
				person.setDay(day);
				person.setMonth(month);
				person.setYear(year);
				person.setGender(gender);
				person.setFatherName(fatherName);
				person.setFatherOccupation(fatherOccupation);
				person.setMotherName(motherName);
				person.setAnnualIncome(annualIncome);
				person.setReligion(religion);
				person.setCaste(caste);
				person.setBloogGroup(bloodGroup);
				person.setExserviceman(exserviceman);
				person.setStp(stp);
				person.setAge(age);
				
				pm.makePersistent(person);
			}
		}
		else
		{
			Personaltable person1	=	new Personaltable();
			person1.setF_Key((String)req.getSession().getAttribute("username"));
			person1.setFirstName(name);
			person1.setMiddleName(middleName);
			person1.setLastName(lastName);
			person1.setDay(day);
			person1.setMonth(month);
			person1.setYear(year);
			person1.setGender(gender);
			person1.setFatherName(fatherName);
			person1.setFatherOccupation(fatherOccupation);
			person1.setMotherName(motherName);
			person1.setAnnualIncome(annualIncome);
			person1.setReligion(religion);
			person1.setCaste(caste);
			person1.setBloogGroup(bloodGroup);
			person1.setExserviceman(exserviceman);
			person1.setStp(stp);
			person1.setAge(age);

			pm.makePersistent(person1);
		}
	}
}
