package com.bv.model;

public class Address1 {

	private String city,state;
	private int zipcode;
	public Address1() {
		
	}
	
	public Address1(String city, String state, int zipcode) {
		super();
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "Address1 [city=" + city + ", state=" + state + ", zipcode=" + zipcode + "]";
	}
	
}
