package cg.com;

public class Employee {
	private String name;
	private Date joiningDate;
	private double salary;
	private static int count;
	private String designation;
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Employee.count = count;
	}
	
	
	
	

}
