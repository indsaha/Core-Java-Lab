package cg.banking;

public class Bank {
	private Account accounts[];
	int flag=0;
	int i=0;
	
	public void transferAmount(Account toAccount, Account fromAccount, double amount)
	{
		findAccount(toAccount.getId()).Deposit(amount);
		findAccount(fromAccount.getId()).Withdraw(amount);
		
	}
	
	public Account findAccount(int accountNo)
	{
		for(int i=0; i< accounts.length; i++)
		{
			if(accounts[i].getId() == accountNo)
			{
				flag = 1;
				break;
			}
			else
				break;
			
		}
		if(flag== 1)
		return accounts[i];
		else
		return null;
		
		
		
	}
	

}
