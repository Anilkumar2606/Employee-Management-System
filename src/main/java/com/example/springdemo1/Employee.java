package com.example.springdemo1;

public class Employee {
	private int empId;
	private String name;
	private String email;
	private int salary;
	Address address;
	
	
public Employee(int empId, String name,  String email,int salary, Address address) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.email=email;
		this.address = address;
	}

public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String namei) {
		this.name = namei;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", email=" + email + ", salary=" + salary + ", address="
				+ address + "]";
	}


}
