package com.mycompany.bdms;

public class Services {
	
	protected String name;
	protected String contact;
	protected String duration;
	protected String district_locality;
	protected double retail_price;
	protected double vat;
	protected String description;
	protected String start;
	protected String end;
	protected int supplier_id;

	// constructor
	public Services(String name, String contact, String duration, String district_locality, double retail_price,
			double vat, String description, String start, String end, int supplier_id) {
		this.name = name;
		this.contact = contact;
		this.duration = duration;
		this.district_locality = district_locality;
		this.retail_price = retail_price;
		this.vat = vat;
		this.description = description;
		this.start = start;
		this.end = end;
		this.supplier_id = supplier_id;
	}


	// setters and getters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getDistrict_locality() {
		return district_locality;
	}

	public void setDistrict_locality(String district_locality) {
		this.district_locality = district_locality;
	}

	public double getRetail_price() {
		return retail_price;
	}

	public void setRetail_price(double retail_price) {
		this.retail_price = retail_price;
	}

	public double getVat() {
		return vat;
	}

	public void setVat(double vat) {
		this.vat = vat;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getSupplier_id() {
		return supplier_id;
	}

	public void setSupplier_id(int supplier_id) {
		this.supplier_id = supplier_id;
	}


	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}
	
	// function to display services
	public void display() {
		System.out.println("Service Name: "+name+" Description: "+description+" Retail Price: "+retail_price+" VAT: "+vat);
	}

}
