package com.arunp;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManagerFactory;

public class Pmf {
	
	private static final PersistenceManagerFactory pmfInstance =
			JDOHelper.getPersistenceManagerFactory("transactions-optional");
	private Pmf() {}

	public static PersistenceManagerFactory get() {
		return pmfInstance;
	}
}

