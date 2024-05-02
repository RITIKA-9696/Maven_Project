package com.ts;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	private int id;
	private int name;
	private String address;
	private int salary;
	private String dept;
	
	public Employee() {}
	public Employee(int id, int name, String address, int salary, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.dept = dept;
	}
	
	
	public int getRollno() {
		return id;
	}
	public void setRollno(int rollno) {
		this.id = rollno;
	}
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	

}
