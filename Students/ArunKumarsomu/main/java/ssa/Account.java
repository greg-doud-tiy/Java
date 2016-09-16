package ssa;

import java.util.HashMap;
import java.text.NumberFormat;

public class Account {

	private int Id ;
	private static int trackId = 0;
	private String description;
	private String type;
	private double balance;
	private String firstName;
	private String lastName;
	private int transactId;
	HashMap<Integer, String> TransLog = new HashMap<Integer, String>(); 
	NumberFormat fmt = NumberFormat.getCurrencyInstance();
	
	public Account(){
		
		this.Id = trackId + 100;
		this.balance = 0.0;
		this.transactId = 0;
		trackId += 100;
				
	}
		
	public Account(int actid, String desc){
		this.Id = actid;
		this.balance = 0.0;
		this.transactId = 0;
		this.setDescription(desc);
				
	}
	
	public Account(String desc){
		
		this.balance = 0.0;
		this.Id = trackId + 100;
		this.transactId = 0;
		this.setDescription(desc);
		trackId += 100;
				
	}
	
	public void setDescription(String desc){
		this.description = desc;
		
	}
	
	public String getDescription(){
		return this.description;
	}
	
//	private void setId(int acct){
//		this.Id = acct;
//	}
	
	private void setAccountDetails(int actId, String type1, double bal, String firstNam, String lastNam ){
//		this.Id = actId;
		this.type = type1;
		this.balance = bal;
		this.firstName = firstNam;
		this.lastName = lastNam;
		if ( type1 == "Savings" ){
			this.description = "My personal savings account";
		}
		if ( type1 == "Checkings" ){
			this.description = "My personal checkings account";
		}
		
	}
	
	public int getId(){
		return this.Id;
	}
	public String getType(){
		return this.type;
	}
	public double getBalance(){
		return this.balance;
	}
	
	private void setBalance(double amt){
		 this.balance = amt;
	}
	
	public String getName(){
		return (this.firstName+this.lastName);
	}
	
	public boolean withdraw(double amt){
		this.transactId++;
		String val = "Account :" + this.Id + " Transaction :"+this.transactId;
		
	//	System.out.println(" Transaction Id for "+ this.type+" account "+ this.Id+" is : "+this.transactId);
		
		if (balance >= amt){
			balance -= amt;
		//	System.out.println("withdraw successfull for amount : "+fmt.format(amt));
		    val +=  " withdraw successfull for amount : "+fmt.format(amt);
		    TransLog.put(this.transactId, val);
			return true;
		}
		else {
		//	System.out.println("withdraw failed for amount : "+fmt.format(amt));
			System.out.println("Insufficient funds!!!, balance is: "+fmt.format(balance));
			val +=  " withdraw failed for amount : "+fmt.format(amt);
			TransLog.put(this.transactId, val);
			return false;
		}
				
	}
	
	public void deposit(double amt){
		this.transactId++;
		String val = "Account :" + this.Id + " Transaction :"+this.transactId;
		val +=  " Deposit successfull for amount : "+fmt.format(amt);
		TransLog.put(this.transactId, val);
		
	//	System.out.println(" Transaction Id for "+ this.type+" account "+ this.Id+" is : "+this.transactId);
	//	System.out.println(" Balance before deposit is : "+fmt.format(this.balance));
	//	System.out.println(" Deposit amount is : "+fmt.format(amt));
		this.balance += amt;
	//	System.out.println(" Balance after deposit is : "+fmt.format(this.balance));
		
			
	}
	
	public void transferFrom(Account b, double amt){
		System.out.println("*** Transfer ***");
		if (b.withdraw(amt) ){
	//		if (b.balance >= amt){
//			b.balance -= amt;
			this.deposit(amt);
//			this.balance += amt;
		//	System.out.println("Transfer successfull for amount : "+fmt.format(amt));
		}
		else if(balance < amt){
//			System.out.println("withdraw failed for amount : "+fmt.format(amt));
	//		System.out.println("Insufficient funds!!!, Transfer failed,balance is: "+fmt.format(this.balance));
		}
	}
	
	public String print(){
		return (" \t" + this.Id + "\t\t" + this.description +"\t\t        " + fmt.format(this.balance) );
	}
	public void displayAccount(){
		System.out.println(" *************************************************************");
		System.out.printf("  Account number  ");
		System.out.printf(" \t Name      ");
		System.out.printf(" \t Acct Type    ");
		System.out.printf(" \t Account Balance is   ");
		System.out.println(" ");
		System.out.printf("    "+this.Id+"                 "+this.firstName+" "+this.lastName);
		System.out.printf("\t "+ this.type);
		System.out.printf("\t\t"+ fmt.format(this.balance));
		System.out.println(" ");
		
	}
	
//	public void displayTranslog(){
//		int size = TransLog.size();
//		for (int i=1;i<size+1;i++){
//			System.out.println(TransLog.get(i));
//		}
//				
//	}
	
}
