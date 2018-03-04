package org.itstep.model;


/**
 * 
 * @author Dmitriy
 *
 */
public class Account {

	private String email;
	private String password;
	private String firstname;
	private String secondname;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSecondname() {
		return secondname;
	}

	public void setSecondname(String secondname) {
		this.secondname = secondname;
	}

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(String email, String password, String firstname, String secondname) {
		this.email = email;
		this.password = password;
		this.firstname = firstname;
		this.secondname = secondname;
	}

}
