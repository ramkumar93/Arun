package com.arun;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;
import javax.jdo.annotations.ForeignKeyAction;
import javax.jdo.annotations.ForeignKey;

@SuppressWarnings("unused")
@PersistenceCapable
@ForeignKey
public class Contacttable {

		@PrimaryKey
		long id;
	
		
		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		@Persistent
		String permanentaddress ;

		public String getPermanentAddress() {
			return permanentaddress;
		}

		public void setPermanentAddress(String permanentAddress) {
			this.permanentaddress = permanentAddress;
		}
		
}