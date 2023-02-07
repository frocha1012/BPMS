package com.mycompany.bdms;

public class Personal_Info {
	
	protected String name;
	protected String dob;
	protected String gender;
	// constructor
	public Personal_Info(String name, String dob, String gender) {
		this.name = name;
		this.dob = dob;
		this.gender = gender;
	}
	// setters and getters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome");
		
	}
	
}