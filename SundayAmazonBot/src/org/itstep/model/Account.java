package org.itstep.model;

/**
 * 
 * @author Alex Gergalo
 *
 */

public class Account {

	private String email;
	private String passowrd;
	private String firstName;
	private String secondName;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassowrd() {
		return passowrd;
	}

	public void setPassowrd(String passowrd) {
		this.passowrd = passowrd;
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
		// TODO Auto-generated constructor stub
	}

	public Account(String email, String passowrd, String firstName, String secondName) {
		super();
		this.email = email;
		this.passowrd = passowrd;
		this.firstName = firstName;
		this.secondName = secondName;
	}

}
