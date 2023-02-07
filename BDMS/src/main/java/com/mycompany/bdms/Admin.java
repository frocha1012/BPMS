package com.mycompany.bdms;

public class Admin {
	
	protected Personal_Info pi;
	protected Login_Details lg;
	
	// constructor
	public Admin(Personal_Info pi, Login_Details lg) {
		this.pi = pi;
		this.lg = lg;
	}
	
	// setters and getters
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
	
}