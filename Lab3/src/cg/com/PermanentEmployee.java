package cg.com;

public class PermanentEmployee extends Employee {
	private static int count;
	private double salary;
	private Contractor contrac;
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		PermanentEmployee.count = count;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Contractor getContrac() {
		return contrac;
	}
	public void setContrac(Contractor contrac) {
		this.contrac = contrac;
	}
	
	

}
