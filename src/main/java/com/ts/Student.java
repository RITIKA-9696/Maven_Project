package com.ts;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity//(name = "std")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rollno;
	@Column(name= "std_name", unique  = true, nullable = false)
	private String name;
	
	@Column(name = "City")
	private String address;
	
	public Student() {}
	
	public Student(int rollno, String name, String address) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	

}
