package ssa;
import java.text.DecimalFormat;

public class Account {
	DecimalFormat df = new DecimalFormat("####0.00");
	protected String type = "A";
	private int accountId;
	String description;
	double balance;
	private static int idCounter = 1000; 

	public String printHeader() {
		System.out.println("T Act# Description\t      Bal     Rate");
		System.out.println("= ==== ===================== ======   ====");
		return " ";
	}
	
	String print(){
		System.out.printf("%-1s %-4s %-21s %-8s", getType(),getAccountId(),getDescription(),df.format(balance));
		//System.out.println( "Account: " + getAccountId() + " " + "balance is $" + df.format(balance) + '\n');
		return  " ";//getType()+" "+getAccountId()+" "+getDescription()+"\t"+df.format(balance);

 
	}
	public String getType(){
		return type;
	}
	
	protected void setType(String type) {
		this.type = type;
	}
	
	private void setAccountId(){
		this.setAccountId(idCounter);
		idCounter++;
	}
	// deposit method adds to balance when called
	double deposit(double amount) {
		if(amount >= 0) {
		this.setBalance(this.getBalance() + amount);
		} else {
			System.out.println("Invalid Number ");
		}
		
		return this.getBalance();
	}
	// withdrawal method subtracts from balance when call unless condition is
	// not met
	double withdraw(double amount) {
		
		if (this.getBalance() < amount) {
			System.out.println("Insufficient funds!" + '\n');
		} else if(amount < 0) {
			System.out.println("Invalid Number");
		} else{
			this.setBalance(this.getBalance() - amount);
		}
		return this.getBalance();
	}

	double transferFrom(Account other, double amount) {
		if (this.getBalance() < amount) {
			System.out.println("Insufficient funds to make requested transer.");
		} else {
			other.deposit(amount);
			this.setBalance(this.getBalance() - amount);
		}
		return this.getBalance();

	}
// getter for accountId
	public int getAccountId() {
		return accountId;
	}
// setter for accountId
	private void setAccountId(int accountId) {
		this.accountId = accountId;
	}
//getter for balance
	public double getBalance() {
		df.format(balance);
		return balance;
	}
//setter for balance can only be used within class
	public void setBalance(double d) {
		this.balance = d;
	}
//getter method getDescription
	public String getDescription() {
		return description;
	}
//setter method description
	public void setDescription(String aDescription) {
		description = aDescription;
	}

	public Account() {
		this.setAccountId();
		this.balance = 0;

	}

	public Account(String aDescription) {
		this.setAccountId();
		description = aDescription;
		this.balance = 0;
		System.out.println();
	}
	public Account(int id, String aDescription) {
		aDescription = description;
		accountId = id;
		this.balance = 0;
	}  
}
