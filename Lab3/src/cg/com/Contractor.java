package cg.com;

public class Contractor {
	private String name;
	private double rate;
	public static int count=0;
	
	ContractEmployee employees[]=new ContractEmployee[5];
	
	public ContractEmployee addEmployee(ContractEmployee employee)
	{
		employees[++count]= employee;
		return employees[count];
	}
	
	
	public ContractEmployee[] getEmployees() {
		return employees;
	}
	public void setEmployees(ContractEmployee[] employees) {
		this.employees = employees;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = 450;
	}
	
	
	
	
	
	

}
