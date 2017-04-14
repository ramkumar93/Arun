package com.arunp;

import java.io.IOException;

import javax.jdo.PersistenceManager;
import javax.mail.Session;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.arun.Personaltable;
import com.arun.Previewtable;

@SuppressWarnings("serial")
public class PersonalServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		resp.setContentType("text/html");
		resp.getWriter().println("Hello, world");
		
		
		
		PersistenceManager p1 	= 	Pmf.get().getPersistenceManager();
		Personaltable person1			=	new Personaltable();
		
	
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
	
		String dob = day+"/"+month+"/"+year;
		System.out.println(dob);
		System.out.println("FirstName "+name);
		System.out.println("MiddleName "+middleName);
		resp.setContentType(name);
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

		System.out.println("Name : "+ name);
		p1.makePersistent(person1);
	
		resp.setContentType("text/plain");
		resp.getWriter().println("Data Stored");
		
		
		
	}
}
