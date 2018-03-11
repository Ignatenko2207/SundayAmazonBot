package org.itstep.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class ConnectionToDB {
	
	private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=AmazonBotDB;user=AmazonBot;password=AmazonBot-276712c184";
//	private static final String USER_NAME = "AmazonBot";
//	private static final String USER_PASSWORD = "AmazonBot-276712c184";
	
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
	
	static void closeConnection(ResultSet rSet, PreparedStatement statement, Connection conn) {
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
