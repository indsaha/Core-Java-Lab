package cg.com;

public class ContractEmployee extends Employee {
	private int noOfHours;
	private static int count;
	private Contractor contractor;
	public double salary;
	
	
	public ContractEmployee(){
		contractor.addEmployee(this);
	}
	
	public String getName()
	{
		return super.getName();
	}
	
	public Date getJoiningDate() {
		return super.getJoiningDate();
	}
	
	public String getDesignation() {
		return super.getDesignation();
	}

	public Contractor getContractor() {
		return contractor;
	}

	public void setContractor(Contractor contractor) {
		this.contractor = contractor;
	}

	public int getNoOfHours() {
		return noOfHours;
	}

	public void setNoOfHours(int noOfHours) {
		this.noOfHours = noOfHours;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = contractor.getRate() * noOfHours;
	}
	
	
	
	
	

}
