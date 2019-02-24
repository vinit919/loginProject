package com.bics.dto;

import java.sql.Date;

public class SignUpDTO {
	private String firstName;
	private String lastName;
	private Date dob;
	private String userName;
	private String password;
	private long contact;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "SignUpDTO [firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + ", userName="
				+ userName + ", password=" + password + ", contact=" + contact + "]";
	}

}
