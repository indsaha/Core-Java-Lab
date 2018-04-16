package cg.com;

public class ContractEmployee extends Employee {
	private int noOfHours;
	private static int count;
	private Contractor contractor;
	public double salary;
	
	
	public double getSalary(int noOfHours, double wage)
	{
		this.noOfHours=noOfHours;
		salary=wage * noOfHours;
		return wage;
	}

}
