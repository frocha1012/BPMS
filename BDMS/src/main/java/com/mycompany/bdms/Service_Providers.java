package com.mycompany.bdms;

public class Service_Providers {
	
	protected int sp_id;
	protected Personal_Info pi;
	protected Login_Details lg;
	
	// constructor
	public Service_Providers(int sp_id, Personal_Info pi, Login_Details lg) {
		this.sp_id = sp_id;
		this.pi = pi;
		this.lg = lg;
	}
	
	// setters and getters
	public int getSp_id() {
		return sp_id;
	}

	public void setSp_id(int sp_id) {
		this.sp_id = sp_id;
	}

	public Personal_Info getPi() {
		return pi;
	}

	public void setPi(Personal_Info pi) {
		this.pi = pi;
	}

	public Login_Details getLg() {
		return lg;
	}

	public void setLg(Login_Details lg) {
		this.lg = lg;
	}
	
	// function to display service provider's data
	public String display() {
		return " Name: "+pi.getName()+" Gender: "+pi.getGender();
	}
}
