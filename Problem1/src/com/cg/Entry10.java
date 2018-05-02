package com.cg;

import java.util.Comparator;
import java.util.TreeSet;

public class Entry10 {
	
	public static void main(String [] args)
	{
		TreeSet tree1 = new TreeSet();
		TreeSet tree2 = new TreeSet(new ProductCompare());
		TreeSet tree3 = new TreeSet(new ProductCompareEqual());
		
		Product e1 = new Product(10,"Pantene", 125);
		tree1.add(e1);
		System.out.println(e1 + " added");
		
		Product e2 = new Product(11,"Head& Shoulder", 200);
		tree1.add(e2);
		System.out.println(e2 + " added");
		
		Product e3 = new Product(15,"Dabur", 225);
		tree1.add(e3);
		System.out.println(e3 + " added");
		
		Product e4 = new Product(17,"Himalay", 205);
		tree1.add(e4);
		System.out.println(e4 + " added");
		
		Product e5 = new Product(19,"Clinic Plus", 175);
		tree1.add(e5);
		System.out.println(e5 + " added");
		
		System.out.println(tree1.size());
		
		tree2.addAll(tree1);
		tree3.addAll(tree1);
		System.out.println(" Type 1\n");
		
		for(Object ob : tree1){
			System.out.println(ob);
		}
		 
		System.out.println(" Type 2\n");
		
		for(Object ob : tree2){
			System.out.println(ob);
		}
		
		System.out.println(" Type 3\n");
		
		for(Object ob : tree3){
			System.out.println(ob);
		}
		
	}

	
}
