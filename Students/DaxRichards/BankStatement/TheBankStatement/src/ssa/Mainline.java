package ssa;

import java.util.*;


public class Mainline {

	public static void main(String[] args) {

		Savings savingsA = new Savings();
		savingsA.setDescription("Savings A");
		savingsA.deposit(0.50);
		savingsA.setIntRate(0.025);
		

		Checking checkingB = new Checking();
		checkingB.setDescription("Checking B");
		checkingB.setLastCheckNbr(100);
		checkingB.deposit(400.00);

		Savings savingsC = new Savings();
		savingsC.setDescription("Savings C");
		savingsC.deposit(11800.00);
		savingsC.setIntRate(0.015);
		

		Checking checkingD = new Checking();
		checkingD.setDescription("Checking D");
		checkingD.setLastCheckNbr(230);
		checkingD.deposit(200.00);  
		
		
		ArrayList<Account> accounts = new ArrayList<Account>();
		accounts.add(savingsA);
		accounts.add(checkingB);
		accounts.add(savingsC);
		accounts.add(checkingD);


        System.out.println("T  Act\tDescription\t\tBal\t\tChk\tRate");
        System.out.println("=  ===  ======================= =============== ====    ====");
		
		
		for(Account account : accounts) {
		    System.out.println(account.print());
		}


	}

}
