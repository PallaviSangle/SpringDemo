package com.bv.model;

public class Employee {

	private int id;
	private String name;
	private Address address;
	private Mydate dd,mm,yy;
	
	

	
	
	public Employee(int id, String name, Address address, Mydate dd, Mydate mm, Mydate yy) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	public Mydate getDd() {
		return dd;
	}
	public void setDd(Mydate dd) {
		this.dd = dd;
	}
	public Mydate getMm() {
		return mm;
	}
	public void setMm(Mydate mm) {
		this.mm = mm;
	}
	public Mydate getYy() {
		return yy;
	}
	public void setYy(Mydate yy) {
		this.yy = yy;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
