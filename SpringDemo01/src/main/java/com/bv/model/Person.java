package com.bv.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Person {
	
	private int id;
	private String name;
	private int age;
	@Autowired
	@Qualifier("address1")
	private Address address;

	/*@Autowired
	public Person(int id, String name, int age, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}*/
	public Address getAddress() {
		return address;
	}
	
	/*@Required
	public void setAddress(Address address) {
		this.address = address;
	}*/
	
	public int getId() {
		return id;
	}
	/*@Required*/
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	/*@Required*/
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	

}
