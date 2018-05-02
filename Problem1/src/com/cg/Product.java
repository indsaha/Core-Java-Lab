package com.cg;

public class Product implements Comparable {

	int id;
	String name;
	double price;
	
	public Product (int id, String name, double price)
	{
		this.id= id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
	
	public boolean equals(Object obj)
	{
		boolean flag;
		flag= ((this.id == ((Product)obj).id) );
		return flag;
	}
	
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
//		return 0;
		
		System.out.println("Comparing "+ this + " with "+ o);
		
		int diff = this.id - ((Product)o).id;
		return diff;
	}
	
	public String toString() {
		return id +  " " + name + " " + price + " ";
	}
}
