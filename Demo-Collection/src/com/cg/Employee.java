package com.cg;

public class Employee {
	int id;
	String name;
	String entity;
	String department;

	public Employee(int id, String name, String entity, String department) {
		this.id = id;
		this.name = name;
		this.entity = entity;
		this.department = department;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + "/" + entity;
	}
	
	public int getId() {
		return id;
	}
	
	public String getEntity() {
		return entity;
	}
}
