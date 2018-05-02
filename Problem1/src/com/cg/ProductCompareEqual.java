package com.cg;

import java.util.Comparator;



public class ProductCompareEqual implements Comparator<Product> {
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
//		return 0;
		
		int diff = o1.getName().compareTo(o2.getName());
		
		if(diff != 0)
			return diff;
		else{
			diff = (int) (o1.getPrice() - o2.getPrice());
			return diff;
		}
	}

}
