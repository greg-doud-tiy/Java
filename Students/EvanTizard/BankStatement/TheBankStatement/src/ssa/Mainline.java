package ssa;

import java.util.ArrayList;

public class Mainline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		Savings savingsA = new Savings();
		savingsA.setAccountType("S");
		savingsA.setInterestRate(0.025);
		savingsA.calcDepositInterest(1);
		savingsA.deposit(500);
		savingsA.setAccountId(110);
		savingsA.setAccountDescription("Savings A");
		savingsA.getBalance();
	
		Checking checkingB = new Checking();
		checkingB.setAccountType("C");
		checkingB.setAccountDescription("Checking B");
		checkingB.setAccountId(120);
		checkingB.deposit(400);
		checkingB.setLastCheckNumber(100);
		checkingB.getBalance();
		
		Savings savingsC = new Savings();
		savingsA.setAccountType("S");
		savingsC.setInterestRate(0.015);
		savingsC.calcDepositInterest(1);
		savingsC.deposit(800);
		savingsC.setAccountId(130);
		savingsC.setAccountDescription("Savings C");
		savingsC.getBalance();
		
		Checking checkingD = new Checking();
		checkingB.setAccountType("C");
		checkingD.setAccountDescription("Checking D");
		checkingD.setAccountId(140);
		checkingD.deposit(200);
		checkingD.setLastCheckNumber(230);
		checkingD.getBalance();

		
		
		
		ArrayList<Account> accountsList = new ArrayList<Account>();
		accountsList.add(savingsA);
		accountsList.add(savingsC);
		accountsList.add(checkingB);
		accountsList.add(checkingD);
		
		
		 System.out.println("T	Act  Description			Bal		Chk	 Rate");
		 System.out.println("=       ===  ======================             ======          ===      ====");
			
		
		for(Account account : accountsList) {
		
		    System.out.println(account.print());

		}
		//else if(account.getAccountType().equalsIgnoreCase("C")){
			// System.out.println(account.getAccountType() + account.getAccountId() + account.getDescription() + account.getLastCheckNumber());
		//}
		    
	}
	
		
	}


