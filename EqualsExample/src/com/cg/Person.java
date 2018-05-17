package com.cg;

public class Person {
	String Username;
	int age;
	public Person(String username, int age)
	{
		this.Username= username;
		this.age=age;
	}
	public boolean equals (Object obj)
	{
		if(!(obj instanceof Person))
		return false;
		else if(this.Username.equals(((Person)obj).Username))
		return true;
			
	}
		
}


