package ssa;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Mainline {

	public static void main(String[] args) {

		Savings firstSavings = new Savings();
		firstSavings.deposit(500);
		firstSavings.calcDepositInterest(12);
		firstSavings.setDescription("My First Savings Account");
		Savings secondSavings = new Savings();
		secondSavings.deposit(500);
		secondSavings.calcDepositInterest(12);
		secondSavings.setDescription("My Second Savings Account");
		Checking firstChecking = new Checking();
		firstChecking.deposit(500);
		firstChecking.withdraw(100);
		firstChecking.setDescription("My First Checking Account");
		Checking secondChecking = new Checking();
		secondChecking.deposit(500);
		secondChecking.withdraw(100);
		secondChecking.setDescription("My Second Checking Account");
		ArrayList<Account> accounts = new ArrayList<Account>();

		accounts.add(firstSavings);
		accounts.add(secondSavings);
		accounts.add(firstChecking);
		accounts.add(secondChecking);

		System.out.println("T Act Description                  Bal    Chk  Rate\n" +
	    		"= === ============================ ====== ===  ====");
		for (Account account : accounts) {
			System.out.println(account.print());
		}
	}
}