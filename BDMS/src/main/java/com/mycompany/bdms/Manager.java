package com.mycompany.bdms;

public class Manager {

	protected int m_id;
	protected Personal_Info pi;
	protected Login_Details lg;
	
	// constructor
	public Manager(int m_id, Personal_Info pi, Login_Details lg) {
		this.m_id = m_id;
		this.pi = pi;
		this.lg = lg;
	}

	// setters and getters
	public int getM_id() {
		return m_id;
	}

	public void setM_id(int m_id) {
		this.m_id = m_id;
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
	
}