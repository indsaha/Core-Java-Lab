import java.util.TreeSet;

import com.cg.Person;

public class Entry4 {
	public static void main(String[] args) {
		
		TreeSet tree = new TreeSet();
		
		Person e1 = new Person("Vikas", 12);
		tree.add(e1);
		System.out.println(e1 + " added");
		
		Person e2 = new Person("Ramesh", 14);
		tree.add(e2);
		System.out.println(e2 + " added");
		
		Person e3 = new Person("Suresh", 16);
		tree.add(e3);
		System.out.println(e3 + " added");
		
		Person e4 = new Person("Mahesh", 18);
		tree.add(e4);
		System.out.println(e4 + " added");
		
		Person e5 = new Person("Siddhesh", 20);
		tree.add(e5);
		
		System.out.println(e5 + " added");
		
		
		System.out.println(tree.size());
		
		for(Object ob : tree){
			System.out.println(ob);
		}
		
		
		
		
	}
}
