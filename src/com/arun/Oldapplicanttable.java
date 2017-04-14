package com.arun;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class Oldapplicanttable {

		@PrimaryKey
		String userid;
		
		@Persistent
		String userpass;

		public String getUserid() {
			return userid;
		}

		public void setUserid(String userid) {
			this.userid = userid;
		}

		public String getUserpass() {
			return userpass;
		}

		public void setUserpass(String userpass) {
			this.userpass = userpass;
		}

	
				
		

			
}