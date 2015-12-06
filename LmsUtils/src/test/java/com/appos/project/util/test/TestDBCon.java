package com.appos.project.util.test;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.appos.project.utils.DBConnection;

import junit.framework.Assert;

public class TestDBCon {
	

	@Test
	public final void testGetConnection() throws SQLException {
		
		final Connection con = DBConnection.getConnection("jdbc:mysql://localhost:3306/test", "admin", "password");
		Assert.assertNotNull(con);
	}

}
