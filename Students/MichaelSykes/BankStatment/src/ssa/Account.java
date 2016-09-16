package ssa;

public class Account {
	private int id;
	public String description;
	protected double balance = 0;
	double amount;
	private static int idCreate = 2000;
	private String accountType;
	

		
	public int getId() {
		  return id;
		}
	private void setId(int anId) {
		  id = anId;
	}
	public double getBalance() {
		  return balance;
	}
	void setBalance(int aBalance) {
		  balance = aBalance;
	}
	public String getDescription() {
	    return this.description;
	  }
	public void setDescription(String description) {
	    this.description = description;
	  }
	
	 public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public Account() {
		 this.balance = 0;
		 this.id = idCreate++;
		 this.description = "";

	  }
	public Account(String description) {
		this.balance = 0;
		this.id = idCreate++;
		this.description = description;
	}
	public Account(int id, String description) {
		this.balance = 0;
		this.id = id;
		this.description = description;
	}

	double deposit(double amount) {
		balance += amount;
		return (balance); 
	}
	double withdraw(double amount) {
		if(amount > balance) {
		System.out.printf("You attempted to withdrawal $" + String.format("%.2f", amount));
		System.out.println(" Insufficient funds to complete transaction");
		return balance;
		} else {
		balance -= amount;
		return (balance);
		}
	}
	public void transferFrom(Account account, double amount) {
		 account.getBalance();
		 		if(amount > account.getBalance())	{
				System.out.printf("You attempted to transfer " + amount );
				System.out.println("Insufficient funds to complete transaction");
				} else {
				account.withdraw(amount);
				this.deposit(amount);
				}		
	  }
	public String print() {
		//return "Account " + id + " balance is $ " + String.format("%.2f", balance);
		return accountType + "\t\t" + id + "\t   " + description
		+ "   " + String.format("%.2f", balance);
	}
}

