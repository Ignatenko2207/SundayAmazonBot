package org.itstep.model;

/**
 * @author Alex Ignatenko
 *
 */
public class Account {

	private String email;
	private String pasword;
	private String firstName;
	private String secondName;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPasword() {
		return pasword;
	}

	public void setPasword(String pasword) {
		this.pasword = pasword;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public Account() {
	}

	public Account(String email, String pasword, String firstName, String secondName) {
		this.email = email;
		this.pasword = pasword;
		this.firstName = firstName;
		this.secondName = secondName;
	}

}
