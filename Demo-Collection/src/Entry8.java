import java.util.HashMap;

import com.cg.Employee;
import com.cg.util.EmployeePK;

public class Entry8 {
	public static void main(String[] args) {
		
		HashMap<EmployeePK, Employee> entries = new HashMap<>();
		
		Employee e1 = new Employee(1, "Ali", "FS", "NGT");
		EmployeePK key1 = new EmployeePK(e1.getId(), e1.getEntity());

		entries.put(key1, e1);
		
		
		Employee e2 = new Employee(1, "Ali", "FS", "NGT");
		EmployeePK key2 = new EmployeePK(e1.getId(), e1.getEntity());
		
		entries.put(key2, e2);
		
		EmployeePK newKey = new EmployeePK(3,"FS");
		
		Employee retrievedEmployee = search(entries, newKey);
		
		System.out.println(retrievedEmployee);
		
	}
	
	public static Employee search(HashMap<EmployeePK, Employee> map, EmployeePK newKey){
		return map.get(newKey);
	}
	
	
	
	
}
