package cg.com;

public class ContractEmployee extends Employee {
	private int noOfHours;
	private static int count;
	private Contractor contractor;
	public double salary;
	
	
	
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
	
	

}
