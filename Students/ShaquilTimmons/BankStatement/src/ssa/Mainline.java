package ssa;

import java.util.ArrayList;

public class Mainline {

	public static void main(String[] args) {
		
		Savings savings1 = new Savings();
		savings1.setDescription("Savings A");
		savings1.deposit(500.00);
		savings1.setInterestRate(0.025);
		savings1.setT("S");
		

		Account account2 = new Account();
		account2.setDescription("Account B");
		account2.deposit(400.00);
		account2.setT("A");
		
		Savings savings3 = new Savings();
		savings3.setDescription("Savings C");
		savings3.deposit(800.00);
		savings3.setInterestRate(0.015);
		savings3.setT("S");
		
		Account account4 = new Account();
		account4.setDescription("Account D");
		account4.deposit(200.00);
		account4.setT("A");

		ArrayList<Account> accounts = new ArrayList<Account>();
		accounts.add(savings1);
		accounts.add(account2);
		accounts.add(savings3);
		accounts.add(account4);
		
		System.out.println("T Act Description                  Bal    Chk  Rate");
		System.out.println("= === ============================ ====== ===  ====");

		
		for(Account account : accounts) {
		    System.out.println(account.print());
		}

	

	}

}
