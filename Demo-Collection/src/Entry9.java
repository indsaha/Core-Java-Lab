import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

import com.cg.Employee;
import com.cg.util.EmployeePK;

public class Entry9 {
	public static void main(String[] args) {
		
		TreeMap<EmployeePK, Employee> entries = new TreeMap<>(
								new EmployeePKComparator()
					);
		
		Employee value1 = new Employee(100,"Sanchez","TS","ADM");
		EmployeePK key1 = new EmployeePK(value1.getId(), value1.getEntity());
		
		entries.put(key1, value1);
		
		Employee value2 = new Employee(98,"Ronaldo","FS","ADM");
		EmployeePK key2 = new EmployeePK(value2.getId(), value2.getEntity());
		
		entries.put(key2, value2);

		Employee value3 = new Employee(102,"Mahidhar","TS","NGT");
		EmployeePK key3 = new EmployeePK(value3.getId(), value3.getEntity());
		
		entries.put(key3, value3);

		Employee value4 = new Employee(50,"Haneef","FS","NGT");
		EmployeePK key4 = new EmployeePK(value4.getId(), value4.getEntity());
		
		entries.put(key4, value4);

		
		System.out.println(entries.size());
		
		Set<EmployeePK> keys =  entries.keySet();
		
		
		for(EmployeePK key :  keys)
			System.out.println(key);
		
		
	}
}

class EmployeePKComparator implements Comparator<EmployeePK>{
	@Override
	public int compare(EmployeePK o1, EmployeePK o2) {
		// TODO Auto-generated method stub
//		return 0;
		
		int diff = o1.getEntity().compareTo(o2.getEntity());
		
		if(diff != 0)
			return diff;
		else{
			diff = o1.getId() - o2.getId();
			return diff;
		}
		
		
	}
	
	
}




