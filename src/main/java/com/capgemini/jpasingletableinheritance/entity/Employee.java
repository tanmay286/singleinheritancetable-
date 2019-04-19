package com.capgemini.jpasingletableinheritance.entity;

import javax.persistence.Entity;

@Entity
public class Employee extends Person {

	private String company;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int i, String name, String company) {
		// TODO Auto-generated constructor stub
		super(i, name);
		this.company = company;

	}

	

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Employee [company=" + company + "]";
	}

}
