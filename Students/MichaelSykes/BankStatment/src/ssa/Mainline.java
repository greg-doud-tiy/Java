package ssa;

import java.util.ArrayList;

public class Mainline {

	public static void main(String[] args) {
		
		Savings carSavings = new Savings(0);
		carSavings.deposit(500);
		carSavings.setInterestRate(.015);
		carSavings.calcDepositInterest(4);
		carSavings.setDescription("Savings Acct ");
		carSavings.setAccountType("Savings ");
		
		Savings houseSavings = new Savings(0);
		houseSavings.deposit(20000);
		houseSavings.setInterestRate(.020);
		houseSavings.calcDepositInterest(14);
		houseSavings.setDescription("Savings Acct ");
		houseSavings.setAccountType("Savings ");
		
		Savings vacationSavings = new Savings(0);
		vacationSavings.deposit(700);
		vacationSavings.setInterestRate(.015);
		vacationSavings.calcDepositInterest(4);
		vacationSavings.setDescription("Savings Acct ");
		vacationSavings.setAccountType("Savings ");
		
		Checking slushFundChecking = new Checking();
		slushFundChecking.setBalance(800);
		slushFundChecking.withdraw(400);
		slushFundChecking.setDescription("Checking Acct");
		slushFundChecking.setAccountType("Checking");
		slushFundChecking.getLastCheckNbr();
		
		Checking billsChecking = new Checking();
		billsChecking.setBalance(2200);
		billsChecking.withdraw(240);
		billsChecking.setDescription("Checking Acct");
		billsChecking.setAccountType("Checking");
		billsChecking.getLastCheckNbr();
		
		
		ArrayList<Account> listAllAccounts = new ArrayList<Account>();
		listAllAccounts.add(carSavings);
		listAllAccounts.add(houseSavings);
		listAllAccounts.add(vacationSavings);
		listAllAccounts.add(slushFundChecking);
		listAllAccounts.add(billsChecking);
		
		System.out.println("Account Type:" + "\t  " + "Account Number:" + "  " + "Description:"
		+ "\t  " + "Balance:" + "\t" + "Check Number:" + "\t" + "Rate:");
		System.out.println("=============" + "\t  " + "===============" + "  " + "=========== "
		+ "\t  " + "========" + "\t" + "=============" + "\t" + "=====");
				
		for(Account account : listAllAccounts) {
		    System.out.println(account.print());
		}
	}
}	


