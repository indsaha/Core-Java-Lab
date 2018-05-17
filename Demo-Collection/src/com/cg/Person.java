package com.cg;

public class Person implements Comparable {
	private String userName;
	private int age;
	
	@Override
	public int hashCode() {
//		int hc = super.hashCode();
		int hc = 1;
		System.out.println("inside hashCode "+ this + ": "+ hc);
//		return 1;
		return hc;
	}
	

	public Person(String userName, int age) {
		this.userName = userName;
		this.age = age;
	}

	public boolean equals(Object obj) {
		System.out.println("inside equals of Person..."+ this + " & "+ obj);
		if(!(obj instanceof Person))
			return false;
		
		return this.userName.equals(((Person)obj).userName);
	
	}
	
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
//		return 0;
		
		System.out.println("Comparing "+ this + " with "+ o);
		
		int diff = this.age - ((Person)o).age;
		return diff;
	}
	
	public String toString() {
		return userName + "/" + age;
	}
	
	
	
}
