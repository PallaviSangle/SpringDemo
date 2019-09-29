package com.bv.model;

import java.util.List;

public class Student {

	private int stdid;
	private String stdName;
	private Address1 address1;
	private List address;


	public Student(int stdid, String stdName, List address) {
		super();
		this.stdid = stdid;
		this.stdName = stdName;
		this.address = address;
	}
	
	

	public List getAddress() {
		return address;
	}



	public void setAddress(List address) {
		this.address = address;
	}



	public Student(int stdid, String stdName, Address1 address1) {
		super();
		this.stdid = stdid;
		this.stdName = stdName;
		this.address1 = address1;
	}


	public Address1 getAddress1() {
		return address1;
	}
/*
	public Student(int stdid, String stdName) {
		super();
		this.stdid = stdid;
		this.stdName = stdName;
	}*/
	
	public int getStdid() {
		return stdid;
	}
	public String getStdName() {
		return stdName;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [stdid=" + stdid + ", stdName=" + stdName + ", address1=" + address1 + "]";
	}

	public void printAddress()
	{
		for(Object add:address)
		{
			System.out.println(add);
		}
	}
	

}
