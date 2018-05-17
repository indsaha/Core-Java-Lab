import java.util.HashSet;

import com.cg.Person;

public class Entry6 {
	public static void main(String[] args) {
		
		HashSet<Person> persons = new HashSet<>();
		
		Person p1 = new Person("mahesh", 18);
		persons.add(p1);
		
		Person p2 = new Person("mahesh", 18);
		persons.add(p2);
		
		Person p3 = new Person("maheshh", 18);
		persons.add(p3);
		
		System.out.println(persons.size());
		
		
		
		
		
	}
}
