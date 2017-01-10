package com.jain.banking.dto;

import java.io.Serializable;

public class CustomerInfomationDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private int departmentId = 0;
	private String departmentName = null;
	private String managerId = null;
	private String locationId = null;

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getManagerId() {
		return managerId;
	}

	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}

	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

}
