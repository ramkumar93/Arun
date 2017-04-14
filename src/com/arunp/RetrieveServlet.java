package com.arunp;



import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.arunp.Pmf;
import com.google.gson.Gson;
import com.arun.Personaltable;

@SuppressWarnings("serial")
public class RetrieveServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
System.out.println("in REtrive");
		
		PersistenceManager pm 	= 	Pmf.get().getPersistenceManager();
		
		String userid 				= 	(String) request.getSession().getAttribute("username");
		
		Query q1 = pm.newQuery(Personaltable.class);
		q1.setFilter("F_Key == '"+userid+"'");
		List<Personaltable> user = (List<Personaltable>) q1.execute();
		
		Map<String, String> data = new HashMap<String, String>();
		System.out.println("Size : "+user.size());
		
		if(!user.isEmpty())
		{
			for(Personaltable person : user)
			{
				data.put("firstname", person.getFirstName());
				data.put("lastname", person.getLastName());
				data.put("middlename", person.getMiddleName());
				data.put("day", person.getDay());
				data.put("month", person.getMonth());
				data.put("year", person.getYear());
				data.put("age", person.getAge());
				data.put("gender", person.getGender());
				data.put("fathername", person.getFatherName());
				data.put("fatheroccupation", person.getFatherOccupation());
				data.put("mothername", person.getMotherName());
				data.put("annualincome", person.getAnnualIncome());
				data.put("religion", person.getReligion());
				data.put("caste", person.getCaste());
				data.put("stp", person.getStp());
				data.put("exserviceman", person.getExserviceman());
				data.put("bloodgroup", person.getBloogGroup());
				
				
				System.out.println("First Name : "+person.getFirstName());
				System.out.println("Last Name : "+person.getLastName());
				
			}
		}
		Gson gson = new Gson(); 
		String json = gson.toJson(data); 
		response.getWriter().write(json);
	}
}
