import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class Entry2 {

	public static void main(String[] args) {
		
		Collection c;
		
		LinkedList list = new LinkedList();
	
		c = (Collection)list;		//up-casting
	
		
		char ch =  '\uFFFF';		;
		
	
		System.out.println((double)ch);
		
		
		
		
		
		c.add("Welcome to DS");
		c.add("We're using linked List");
		
		c.add("java is simple!");
		c.add("JAVA IS SIMPLE!");
		c.add("JAVA IS SIMPLE!");
		c.add("JAVA IS SIMPLE!");
		
		c.add("We are using collection");
		c.add("We're using type casting");
		
		
		Iterator itr = c.iterator();
		System.out.println(itr.getClass().getSimpleName());
		while(itr.hasNext()){
			String message = (String)itr.next();			// down-casting
			System.out.println(message);
		}
		
		TreeSet tree = new TreeSet();
		
		tree.addAll(c);
		
		itr = tree.iterator();
		
		System.out.println();System.out.println();System.out.println();
		System.out.println(itr.getClass().getSimpleName());
		while(itr.hasNext()){
			String message = (String)itr.next();			// down-casting
			System.out.println(message);
		}
		
		
		
		
		
		
	}
	
	
	
}
