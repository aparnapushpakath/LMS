package com.appos.project.utils;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class DBConnection {
	
	final static Logger logger = Logger.getLogger(DBConnection.class);
	final static String baseDir = new File("").getAbsolutePath();
	
	public static Connection getConnection(final String url,final String userName,final String password) throws SQLException{
		 
		System.out.println(new File("").getAbsolutePath());
		PropertyConfigurator.configure(baseDir +"/src/resources/log4j.properties");
		logger.debug("Trying to create a connection with Url " +url 
				+ "userName:"+userName+ "password" + password );
		final Connection con=DriverManager.getConnection(url, userName, password);
		if(con==null)
			logger.error("Connection object returned null");
		
		return con;
		
	}

}
