package com.cg;

public class EntryName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Vikas", 18);
		Person p2 = new Person("Vikas" , 15);
		
		if(p1.equals(p2))
		{
			System.out.print("Equal");
		}
		else
		System.out.print("Not Equal");

	}

}
