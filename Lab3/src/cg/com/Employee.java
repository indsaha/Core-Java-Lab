package cg.com;

public class Employee {
	private String name;
	private Date joiningDate;
	private double salary;
	private static int count;
	
	public Employee (String name, Date joiningDate, double salary)
	{
		this.name=name;
		this.joiningDate=joiningDate;
		this.salary=salary;
		
	}

	public double getSalary(double salary) {
		
		this.salary = salary;
		return salary;
	}
	
	
	

}
