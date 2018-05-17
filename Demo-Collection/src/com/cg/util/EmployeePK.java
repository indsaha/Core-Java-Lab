package com.cg.util;

public class EmployeePK {
	private int id;
	private String entity;

	public EmployeePK(int id, String entity) {
		this.id = id;
		this.entity = entity;
	}

	
	public String getEntity() {
		return entity;
	}
	
	public int getId() {
		return id;
	}
	
	@Override
	public int hashCode() {
//		return entity.hashCode();
		return 1;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		boolean flag;
		
		System.out.println("inside equals");
		
		flag = ((this.id == ((EmployeePK)obj).id) && (this.entity.equals(((EmployeePK)obj).entity)));
		
		return flag;
	}
	
	@Override
	public String toString() {
		return id + "/" + entity;
	}
	
	
	
	
	
}
