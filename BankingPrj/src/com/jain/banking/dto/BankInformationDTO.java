package com.jain.banking.dto;

import java.io.Serializable;

public class BankInformationDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private int bankId = 0;
	private String bankName = null;
	private String bankAddress = null;
	private String bankPhone = null;
	
	public int getBankId() {
		return bankId;
	}
	public void setBankId(int bankId) {
		this.bankId = bankId;
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

}
