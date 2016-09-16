package ssa;
import java.util.Random;
public class Account {
	
	

	private int id;
	private String description;
	private double balance;
	private String t;
	
	
	void getDetails() { //method for all account info
		 System.out.printf(description + "  id is "+ id + " and my balance is  %.2f ", + balance); 
		 System.out.println(" ");
	}
	String print() { 
		return this.getT() + " " + this.getId() + " " + this.getDescription() + "                    " +String.format("%.2f",this.getBalance())   ;
		
	}
	void deposit (double addMoney) { 
		if (addMoney <= 0) 
			System.out.println(" Unable to process"); 
		
		else
		
		balance = balance + addMoney;
		//System.out.printf(" I made a deposit in the amount of %.2f ", addMoney);
		
	}
	 String withdraw (double takemoney) {
		if (takemoney <= balance) {
			balance = balance - takemoney;
		if (takemoney <= 0)
			System.out.println("Processing error");
		return "Processing error";
		//System.out.printf(" I made a withdrawal in the amount of %.2f ", takemoney);
			
		}
		else System.out.println("Insufficient funds. Do Not withdraw!");
		return "Insufficient funds. Do Not withdraw!";
		}
		
	
		

	public Account(int id, String description) { //allowing way to change id & description inside of class
		this.id = id;
		this.description = description;
	
	}
	
	public Account(String description) {
		this.description = description;
	}
	
	public int getId() {
		Random rn = new Random();
		this.id = rn.nextInt(900) + 100;
		return id;
	}
	private void setId(int id) {
		Random rn = new Random();
		this.id = rn.nextInt(50);
		
	}
	public String getDescription() {
		return description;
		
	}
	public void setDescription(String description) {
		this.description = description;
	}
		public String getT() {
			return t;
		}
		public void setT(String type) {
			this.t = type;
		}
		
	
	public Account() { //Initializing balance to 0
		this.balance = 0;
		this.id = 100; //Initializing id to 100
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
		
		public void transferFrom(Account account, double amount) {
		    account.withdraw(amount);
		    this.deposit(amount);
		  }
		
		

		public void printHead() {
			System.out.println("T Act Description                  Bal    Chk  Rate");
			System.out.println("= === ============================ ====== ===  ====");
			
		}
	}

