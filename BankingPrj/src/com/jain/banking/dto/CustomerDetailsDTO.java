package com.jain.banking.dto;

import java.io.Serializable;

public class CustomerDetailsDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private int customerId = 0;
	private String firstName = null;
	private String lastName = null;
	private String userName = null;
	private String password = null;
	private String email = null;
	private String bankName = null;
	private String bankAddress = null;
	private String bankPhone = null;
	private String accountType = null;
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankAddress() {
		return bankAddress;
	}
	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}
	public String getBankPhone() {
		return bankPhone;
	}
	public void setBankPhone(String bankPhone) {
		this.bankPhone = bankPhone;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
}
