package ssa;


	import java.awt.Font;
	import java.lang.*;
	import java.awt.Graphics;
	import java.awt.Graphics2D;
	import java.awt.RenderingHints;
	import java.awt.image.BufferedImage;

	
				/***************************************************/
				/**********       TheBankStatement       ***********/
				/***************************************************/
	public class Account {

		private int id = (int)Math.ceil(java.lang.Math.random()*1000);
		public String description;
		private double balance;
		public char acctCode;
		public boolean okToWithdraw;
		

		
		/**
		 * @return the okToWithdraw
		 */
		public boolean isOkToWithdraw() {
			return okToWithdraw;
		}

		/**
		 * @param okToWithdraw the okToWithdraw to set
		 */
		public void setOkToWithdraw(boolean okToWithdraw) {
			this.okToWithdraw = okToWithdraw;
		}

		// Default Constructor
		public Account() {
			// This call will set the initial balance to zero
			setBalance();
			
		}

		/**
		 * @return the acctCode
		 */
		public char getAcctCode() {
			return acctCode;
		}

		/**
		 * @param acctCode the acctCode to set
		 */
		//This method will add set a 'c' for checking and an 's' for savings accts
		public void setAcctCode(char acctCode) {
			this.acctCode = acctCode;
		}

		// Constructor to accept 1 String parameter for description
		public Account(String description) {
			setDescription(description);

		}

		// Constructor to accept two parameters: for id and description
		public Account(int id, String description) {
			setId(id);
			setDescription(description);

		}
		
		public String getDescription() {
		    return this.description;
		  }
		
		  public void setDescription(String description) {
		    this.description = description;
		  }


		private void setId(int id) {
			this.id = id;

		}

		public int getId() {
			return this.id;
		}

		private void setBalance() {

			this.balance = 0.00;
		}

		public double getBalance() {
			return this.balance;
		}

		public double deposit(double deposit) {

			//System.out.println("\nYou have successfully made a deposit of $" + String.format("%.2f", deposit));
	        if (deposit > 0){
	        	return this.balance  += deposit;
	        }
			return this.balance;
		}

		public double withdraw(double withdraw) {
			
			if (withdraw > 0.00 && withdraw <= this.balance) {
				setOkToWithdraw(true);
				this.balance -= withdraw;
				
			} 
			setOkToWithdraw(false);
			return this.balance;
		}
		public void transferFrom(Account account, double amount) {

			if(amount > 0.00 && amount <= account.balance) {
				account.balance -= amount;
				this.balance += amount;
			}
		}
		

			
				
		public String print(){
			
			//return "Account " + getId() + " balance is $" + String.format("%.2f", this.balance);
			//String x = String.format("%.2f",getBalance());
			return (getAcctCode() + "  " + getId() + "\t" + getDescription() +"\t\t" + String.format("%10.2f",(getBalance())));
		}
				

	}



