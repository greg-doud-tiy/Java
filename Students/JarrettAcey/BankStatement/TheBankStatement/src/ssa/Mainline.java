package ssa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Mainline {

	public static void main(String[] args) {
		
		
		
		
		
		Savings savings1 = new Savings();
		savings1.setDescription("Savings A");
		savings1.deposit(500.00);
		savings1.setInterestRate(0.025);

		Checking checking2 = new Checking();
		checking2.setDescription("Checking B");
		checking2.setChkNbr(100);
		checking2.deposit(400.00);

		Savings savings3 = new Savings();
		savings3.setDescription("Savings C");
		savings3.deposit(800.00);
		savings3.setInterestRate(0.015);

		Checking checking4 = new Checking();
		checking4.setDescription("Checking D");
		checking4.setChkNbr(230);
		checking4.deposit(200.00);

		ArrayList<Account> accounts = new ArrayList<Account>();
		accounts.add(savings1);
		accounts.add(checking2);
		accounts.add(savings3);
		accounts.add(checking4);

		System.out.println("T  Act  Description             Bal    Chk    Rate");
		System.out.println("=  ===  ======================= ====== ===    ==== ");
		

		// print headers here 
		//
		for(Account account : accounts) {
		    System.out.println(account.print());
		}

		
		

	}

}
