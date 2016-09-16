package ssa;

import java.util.*;
import ssa.Savings;


public class Mainline {

	public static void main(String[] args) {
		
		Savings savings1 = new Savings();
		savings1.setDescription("Savings A");
		savings1.deposit(500.00);
		savings1.setInterestRate(0.025);
		
		

		Savings savings2 = new Savings();
		savings2.setDescription("Savings B");
		savings2.setInterestRate(0.05);
		savings2.deposit(400.00);

		Savings savings3 = new Savings();
		savings3.setDescription("Savings C");
		savings3.deposit(800.00);
		savings3.setInterestRate(0.015);

		Savings savings4 = new Savings();
		savings4.setDescription("Savings D");
		savings4.setInterestRate(230);
		savings4.deposit(200.00);

		ArrayList<Account> accounts = new ArrayList<Account>();
		accounts.add(savings1);
		accounts.add(savings2);
		accounts.add(savings3);
		accounts.add(savings4);

		//
		// print headers here 
		//
		System.out.println("act  Description            Balance    Interest");
		System.out.println("=============================================== ");
		for(Account account : accounts) {
		    System.out.println(account.print());
		}			
	}		
}