package org.itstep.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.itstep.model.Account;

public class AccountDAO {

	public Account save(Account account) {
		
		Connection accConn = null;
		PreparedStatement accStatement = null;
		
		try {
			String sqlString = "INSERT INTO accounts (email, password, first_name, second_name) VALUES (?, ?, ?, ?)";
			accConn = ConnectionToDB.getConnection();
			accStatement = accConn.prepareStatement(sqlString);
			accStatement.setString(1, account.getEmail());
			accStatement.setString(2, account.getPassowrd());
			accStatement.setString(3, account.getFirstName());
			accStatement.setString(4, account.getSecondName());
			
			accStatement.executeUpdate();
			return account;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionToDB.closeConnection(accStatement, accConn);
		}
		
		return null;
	}

	public Account get(String eMail) {

		Connection accConn = null;
		PreparedStatement accStatement = null;
		ResultSet accSet = null;
		
		try {
			String sqlString = "SELECT * FROM accounts WHERE email = ?";
			accConn = ConnectionToDB.getConnection();
			accStatement = accConn.prepareStatement(sqlString);
			accStatement.setString(1, eMail);
			
			accSet = accStatement.executeQuery();
			
			while(accSet.next()) {
				Account tmpAccount = new Account();
				tmpAccount.setEmail(accSet.getString("email"));
				tmpAccount.setPassowrd(accSet.getString("password"));
				tmpAccount.setFirstName(accSet.getString(3));
				tmpAccount.setSecondName(accSet.getString(4));
				return tmpAccount;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionToDB.closeConnection(accSet, accStatement, accConn);
		}
		
		return null;
	}
	
	public List<Account> getAll() {

		Connection accConn = null;
		PreparedStatement accStatement = null;
		ResultSet accSet = null;
		
		try {
			String sqlString = "SELECT * FROM accounts";
			accConn = ConnectionToDB.getConnection();
			accStatement = accConn.prepareStatement(sqlString);
			
			accSet = accStatement.executeQuery();
			
			List<Account> accounts = new ArrayList<>();
			while(accSet.next()) {
				Account tmpAccount = new Account();
				tmpAccount.setEmail(accSet.getString("email"));
				tmpAccount.setPassowrd(accSet.getString("password"));
				tmpAccount.setFirstName(accSet.getString(3));
				tmpAccount.setSecondName(accSet.getString(4));
				accounts.add(tmpAccount);
			}
			
			if(!accounts.isEmpty()) {
				return accounts;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionToDB.closeConnection(accSet, accStatement, accConn);
		}
		
		return null;
	}

	public Account update(Account account) {

		String sqlString = "UPDATE accounts SET password = ?, first_name = ?, second_name = ? WHERE email = ?";
		return null;
	}

	public void delete(Account account) {
		
		String sqlString = "DELETE FROM accounts WHERE email = ?";
	}
}
