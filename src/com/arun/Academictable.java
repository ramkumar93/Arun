

package com.arun;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class Academictable {

	
		@PrimaryKey
		long id;
		
		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		@Persistent
		String sslcname ;

		public String getSslcname() {
			return sslcname;
		}

		public void setSslcname(String sslcName1) {
			this.sslcname = sslcName1;
		}

	
			
}