package com.jain.banking.jdbc;

import java.util.ResourceBundle;

//singleton class for get the database information from the ConfigFiles/Appconfig.properties
public class DataBaseSingleton {

	private static DataBaseSingleton instance = null;
	private ResourceBundle rb = null;

	private DataBaseSingleton() {
		rb = ResourceBundle.getBundle("Appconfig");
	}

	public static synchronized DataBaseSingleton getInstance() {
		if (instance == null) {
			instance = new DataBaseSingleton();
		}
		return instance;
	}
	
	public String getProperties(String key)
	{
		return rb.getString(key);
	}
}
