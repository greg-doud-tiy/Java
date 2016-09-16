//--------------------------------------------------------------
// Reuben Turner
// Aug 31, 2016
// Assignment 11
// Account.java
//
// This class defines a generic bank account.
//--------------------------------------------------------------

package ssa;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;

abstract class Account 
{
	//========================//
	// INSTANCE DATA SECTION  //
	//========================//
	
	//-----------------------------------------------------------
	// All instance data can only be changed either:
	// 1) within this class, or
	// 2) publicly by using the methods defined in this class.
	//-----------------------------------------------------------
	private int accountID;
	private String description; 
	private char accountType; // S or C
	private String actionType;
	private String errorMsg; 
	private double balance;  
	private int transactionID; 
	private int checkNum;
	private DecimalFormat fmt = new DecimalFormat("###,###,###.00"); 
	
	//======================//
	// CONSTRUCTOR SECTION  //
	//======================//
	
	//-------------------------------------------------
	// Constructor #1 - No parameters.
	// Set initial balance to zero.
	// Set account type and description to a default.
	//-------------------------------------------------
	public Account()
	{
		this.balance = 0;
		setAccountID(this.accountID);
		this.description = "Account #" + this.accountID;
	}

	//--------------------------------------------
	// Constructor #2 - set up with description.
	// Set initial balance to zero.
	// Set account type to blank.
	//--------------------------------------------
	public Account(String desc, char type)
	{
		this.balance = 0;
		setAccountID(this.accountID);
		this.description = desc;
		this.accountType = Character.toUpperCase(type);
	}
	
	//--------------------------------------------------------------
	// Constructor #3 - set up with account number and description.
	// Set initial balance to zero.
	// Set account type to blank.
	//--------------------------------------------------------------
	public Account(int id, String desc)
	{
		this.accountID = id;
		this.description = desc;
		this.balance = 0;
		this.accountType = ' ';
	}
	
	//--------------------------------------------------------------
	// Constructor #4 - set up with account number and description.
	// Set initial balance to zero.
	//--------------------------------------------------------------
	public Account(int id, String desc, char type)
	{
		this.accountID = id;
		this.accountType = type;
		this.description = desc;
		this.balance = 0;
	}
	
	//===============================//
	// METHODS - GETTERS AND SETTERS //
	//===============================//

	//--------------------
	// Get the account id
	//--------------------
	public int getId() 
	{
		return accountID;
	}
	
	//-------------------------------
	// Privately set the account id 
	//-------------------------------
	private void setAccountID(int accountID) 
	{
		Random rand = new Random();
		accountID = rand.nextInt(1000) + 1;
		this.accountID = accountID;
	}
	
	// Print the account description
	public String getDescription()
	{
		return description;
	}
	
	//------------------------------
	// Set the account description
	//------------------------------
	public void setDescription(String desc)
	{
		description = desc;
		actionType = "Description Changed";
		transactionID++;
	}
	
	//------------------------------
	// Get current account balance
	//------------------------------
	public Double getBalance()
	{
		return balance;
	}
	
	//----------------------------------------------------
	// Get current account balance as a formatted String
	//----------------------------------------------------
	public String getBalanceStr()
	{
		return fmt.format(balance);
	}
	
	public int getCheckNum() {
		return checkNum;
	}

	private void setCheckNum(int checkNum) {
		this.checkNum = (checkNum + 100);
	}

	//--------------------------------------
	// Privately update the account balance  
	//--------------------------------------
	private void setBalance(double amount, String actionType) 
	{
		if(actionType.equalsIgnoreCase("deposit") || actionType.equalsIgnoreCase("transfer deposit"))
			this.balance += amount;
		else if(actionType.equalsIgnoreCase("withdrawal") || actionType.equalsIgnoreCase("transfer withdrawal"))
			this.balance -= amount;		
	}
	
	//----------------------------
	// Get current error message
	//----------------------------
	public String getErrorMsg() 
	{
		return errorMsg;
	}

	//--------------------
	// Set error message
	//--------------------
	public void setErrorMsg(String errorMsg) 
	{
		this.errorMsg = errorMsg;
	}
	
	//=================//
	// METHODS - OTHER //
	//=================//

	//----------------------------
	// User-increase the balance
	//----------------------------
	public double deposit(double depAmt)
	{
		if(depAmt > 0)
		{
			actionType = "Deposit";
			this.setBalance(depAmt, actionType); 
			transactionID++;
		}
		else
		{
			setErrorMsg("Invalid deposit amount.");
		}
		return balance;
	}
	
	//------------------------------------
	// Method override for deposit()
	// Special usage for: transferFrom()
	//------------------------------------
	private double deposit(double depAmt, String action, int fromID)
	{
		if(depAmt > 0)
		{
			actionType = action;
			this.setBalance(depAmt, actionType);
			transactionID++;
		}
		else
		{
			setErrorMsg("Invalid deposit amount.");
		}
		return balance;
		
	}
	
	//----------------------------
	// User-decrease the balance
	//----------------------------
	public double withdraw(double wDrawAmt)
	{
		// If user tried to withdraw more money than
		// is in the account, show an error.
		if(wDrawAmt > 0)
		{
			if(wDrawAmt > balance)
			{
				actionType = "Failed Withdrawal";
				transactionID++;
				setErrorMsg("Cannot withdraw - Insufficient funds available!");
			}
			else
			{
				actionType = "Withdrawal";
				this.setBalance(wDrawAmt, actionType);
				transactionID++;
				setCheckNum(checkNum);
			}
		}
		else
		{
			setErrorMsg("Invalid withdrawal amount.");
		}
		return balance;
	}

	//------------------------------------
	// Method override for withdraw()
	// Special usage for: transferFrom()
	//------------------------------------
	private double withdraw(double wDrawAmt, String action)
	{
		actionType = action;
		if(wDrawAmt > 0)
		{
			if(wDrawAmt > balance)
			{
				actionType = "Failed Withdrawal";
				transactionID++;
				setErrorMsg("Cannot withdraw - Insufficient funds available!");
			}
			else
			{
				this.setBalance(wDrawAmt, actionType);
				setCheckNum(checkNum);
			}
		}
		else
		{
			setErrorMsg("Invalid withdrawal amount.");
		}
		return balance;
	}
	
	//----------------------------------------------
	// Transfer funds from one account to another.
	//----------------------------------------------
	public void transferFrom(Account to, double amount)
	{
		actionType = "Transfer Withdrawal";
		this.withdraw(amount, actionType);				
		actionType = "Transfer Deposit";
		to.deposit(amount, actionType, this.accountID);
		transactionID++;	
	}
	
	//--------------------------------------------------------
	// Display the balance for the current Account instance
	//--------------------------------------------------------
	public String print() 
	{
		String line = String.format("%-2s%-4s%-29s%-7s%-4s%-4s", "", this.getId(), 
				this.getDescription(), this.getBalance(), "n/a", "n/a");
		return line;
	}
}