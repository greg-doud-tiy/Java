package com.ssa.tiy.thebankaccount;
import java.util.*;


public class Account {
		
		private int id;//account number
		private String description;
		private double balance;
		protected static String type;
	
		
		//constructor
			public Account(int id, String description, String type){
				this.id = id;
				this.description = description;
				this.balance = 0;
				this.type = type;
			}
			//constructor for description
			public Account(String description){
				this.description = description;
				this.balance = 0;
			}
			Account() {
				this.description = "default account description";
				this.balance = 0;
					
			}
			
		public double deposit(double aDeposit){
			balance = balance + aDeposit;
			return balance;
		}
		
			public double withdraw(double aWithdraw){
			if(aWithdraw > balance) {
				System.out.println("Insufficient Funds!");
			} else 
				
				balance = balance - aWithdraw;
				return balance;
				
			}
		//transfer method
		public double  transferFrom(Account account, double amount) {
			if (account.balance > amount){
				account.withdraw(amount);
					this.deposit(amount);
					return amount;
					
				} else 
					System.out.println("Transfer Fail!");
			return -1;
			}
		
//public void AccountData(){		
//			if(accountList == null){
//				accountList = new ArrayList<Account>();
//			//	init(); //here i am calling the Init method which contains the account data
//}
//}
		
		//getter and setter for id
		public int getId(){return id;}
		void setId(int anId){this.id = anId;}
				
		//getter and setter for description
		String getDescription() {return description;}
		void setDescription(String aDescription) {this.description = aDescription;}
		
		//getter and setter for balance
		public double getBalance() {return balance;}
		public void setBalance(double balance) {this.balance = balance;}
		
		//getter and setter for type
		public String getType() {return type;}
		public void setType(String type) {this.type = type;}

		
		public String print(){
			return String.format("    %3d %-15s  %8.2f",this.getId(), this.getDescription(), this.getBalance());
		}
		
		

}
