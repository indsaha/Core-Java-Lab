package cg.banking;

public class Account {
	private int id;
	private double balance;
	
	public Account (int accountNumber){
		this.id=accountNumber;
	}
	public int getId() {
		return id;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	protected boolean Withdraw(double amount)
	{
		balance = balance - amount;
		return true;
	}
	protected boolean Deposit(double amount)
	{
		balance= balance + amount;
		return true;
		
	}

}
