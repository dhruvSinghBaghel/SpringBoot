package com.intuit.app.model;

import java.util.Date;

public class Organization {

	private int org_id;
	private String org_name;
	private String org_reg_date;
	private Date org_remove_date;
	
	
	public Organization(int org_id, String org_name, String org_reg_date, Date org_remove_date) {
		super();
		this.org_id = org_id;
		this.org_name = org_name;
		this.org_reg_date = org_reg_date;
		this.org_remove_date = org_remove_date;
	}
	public Organization() {
		// TODO Auto-generated constructor stub
	}
	public int getOrg_id() {
		return org_id;
	}
	public void setOrg_id(int org_id) {
		this.org_id = org_id;
	}
	public String getOrg_name() {
		return org_name;
	}
	public void setOrg_name(String org_name) {
		this.org_name = org_name;
	}
	public String getOrg_reg_date() {
		return org_reg_date;
	}
	public void setOrg_reg_date(String org_reg_date) {
		this.org_reg_date = org_reg_date;
	}
	public Date getOrg_remove_date() {
		return org_remove_date;
	}
	public void setOrg_remove_date(Date org_remove_date) {
		this.org_remove_date = org_remove_date;
	}

}
