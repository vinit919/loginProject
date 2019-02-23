package com.bics.dao;

import java.sql.Connection;

import javax.annotation.Resource;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.apache.log4j.Logger;

public class SignUpDao {

	private static Logger logger = Logger.getLogger(SignUpDao.class);
	@Resource(name="java:/comp/env/loginProjectJndi")
	private DataSource ds;
	
	

	public void checkConnection() throws Exception {
		//InitialContext ic = new InitialContext();
		//ds = (DataSource) ic.lookup("java:/comp/env/loginProjectJndi");

		Connection con = ds.getConnection();
		if (con != null) {
			logger.info("connection created");
		} else
			logger.error("connection not created");

	}

}
