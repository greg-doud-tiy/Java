package ssa;

import java.util.*;

public class Mainline {

	public static void main(String[] args) {

		Savings a = new Savings(110, "Savings A");
		a.setBalance(500.00);
		a.setInterestRate(2.50);
		Checking b = new Checking(120, "Checking B");
		b.setLastCheckNbr(100);
		b.setBalance(400.00);
		Savings c = new Savings(130, "Savings C");
		c.setBalance(800.00);
		c.setInterestRate(1.50);
		Checking d = new Checking(140, "Checking D");
		d.setBalance(200.00);
		d.setLastCheckNbr(230);
		
		ArrayList<Account> accounts = new ArrayList<Account>();
		accounts.add(a);
		accounts.add(b);
		accounts.add(c);
		accounts.add(d);
		
		
		System.out.println("T Act Description         Bal    Chk  Rate");
		System.out.println("= === =================== ====== ===  ====");
		for (Account account : accounts) {
			System.out.println(account.print());
			
		}
	}

}
