package cg.com;

public class PermanentEmployee extends Employee {
	private static int count;
	private double salary;
	private Contractor contrac;
	public static int getCount() {
		return count;
	}
	
	PermanentEmployee permemployees[]=new PermanentEmployee[5];
	
	public PermanentEmployee addEmployee(PermanentEmployee employee)
	{
		permemployees[++count]= employee;
		return permemployees[count];
	}
	
	public double getSalary() {
		return super.getSalary();
	}
	
	public void display()
	{
		for(PermanentEmployee emp : permemployees )
		{
			System.out.println("Name: " + emp.getName());
			System.out.println("Joinning Date: " + emp.getJoiningDate() );
			System.out.println("Salary: " + emp.getSalary());
		}
	}
	
	
	

}
