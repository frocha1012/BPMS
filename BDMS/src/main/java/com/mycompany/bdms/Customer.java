package com.mycompany.bdms;

public class Customer {
	
	protected int c_id;
	protected Personal_Info pi;
	protected Login_Details lg;
	private Order orders;
	// constructor
	public Customer(int c_id, Personal_Info pi, Login_Details lg) {
		this.c_id = c_id;
		this.pi = pi;
		this.lg = lg;
		this.orders=new Order();
	}
	// setters and getters
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
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
	public Order getOrders() {
		return orders;
	}
	public void setOrders(Order orders) {
		this.orders = orders;
	}
	
	// function to display customer information
	public String display() {
		return " Name: "+pi.getName()+" Gender: "+pi.getGender();
	}
	// function to display customers orders
	public void display_customers_orders() {
		orders.display_orders();
	}
}

