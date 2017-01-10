package com.jain.banking.dto;

import java.io.Serializable;

public class AccountInformationDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private int id = 0;
	private String name = null;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
