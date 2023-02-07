package com.mycompany.bdms;
import java.util.ArrayList;

public class Order {
	
	protected ArrayList<Services> orders;
	protected double total_cost;
	
	// constructor
	public Order() {
		orders=new ArrayList<Services>();
	}

	// setters and getters
	public ArrayList<Services> getOrders() {
		return orders;
	}

	public void setOrders(ArrayList<Services> orders) {
		this.orders = orders;
	}

	public double getTotal_cost() {
		return total_cost;
	}

	public void setTotal_cost(double total_cost) {
		this.total_cost = total_cost;
	}
	
	// function to display order
	public void display_orders() {
		for(int i=0;i<orders.size();i++) {
			orders.get(i).display();
		}
	}
	
}