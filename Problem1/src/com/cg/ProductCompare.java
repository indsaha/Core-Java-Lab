package com.cg;

import java.util.Comparator;



public class ProductCompare implements Comparator<Product> {
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
//		return 0;
		
		double diff = o1.getPrice() - o2.getPrice();
		return (int)diff;
		
		}

}
