package com.arun;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class Coursetable {

		
	

		@PrimaryKey
		long id;
	
		
	
		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		@Persistent
		String graduate ;

		public String getGraduate() {
			return graduate;
		}

		public void setGraduate(String graduate1) {
			this.graduate = graduate1;
		}

		
}