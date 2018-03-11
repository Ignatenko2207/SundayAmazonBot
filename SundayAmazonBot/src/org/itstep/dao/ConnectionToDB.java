package org.itstep.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class ConnectionToDB {
	
	private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=AmazonBotDB;integratedSecurity=true";
	private static final String USER_NAME = "";
	private static final String USER_PASSWORD = "";
	
	protected static Connection getConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	static void closeConnection(PreparedStatement statement, Connection conn) {
		try {
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	static void closeconnection(ResultSet rSet, PreparedStatement statement, Connection conn) {
		try {
			rSet.close();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		try {
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
