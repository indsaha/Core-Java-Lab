package cg.banking;

public class Bank {
	private Account accounts[];
	int flag=0;
	int i=0;
	
	
	public void addAccount()
	{
		for(int i=0;i<5;i++)
		{
		    accounts[i] = new Account(i+1);
			accounts[i].setBalance(20000);
		}
		//for(i=0;i<5;i++)
		//{
		//	System.out.println("Account No: "+accounts[i].getAccountNo());
		//	System.out.println("Account Balance: "+accounts[i].getAccountBalance());
		//}
	}
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
				continue;
			
		}
		if(flag== 1)
		return accounts[i];
		else
		return null;
		
		
		
	}
	

}
