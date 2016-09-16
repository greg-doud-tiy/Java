package ssa;

import java.util.ArrayList;

public class Mainline {

	public static void main(String[] args) {
		Savings firstone = new Savings();
		firstone.balance = 500;
		firstone.setInterestRate(.015);
		firstone.calcDepositInterest(4);
		firstone.setDescription("Savings1");
	//	firstone.print();
		
		
		Account two = new Savings("Savings2");
		two.deposit(200);
	//	two.print();
		two.printHeader();
		
		Account three = new Savings("Savings3");
		three.deposit(900);
		three.deposit(800);
		three.withdraw(200);
		three.transferFrom(two, 200);
		
		Account four = new Savings(10, "Savings4");
		four.deposit(500);
		
		Account five = new Checking();
		five.deposit(600);
		five.withdraw(200);
		
		Account six = new Checking("Checking2");
		six.setBalance(500);
		
		ArrayList<Account> accounts = new ArrayList<Account>();
		accounts.add(firstone);
		accounts.add(two);
		accounts.add(three);
		accounts.add(four);
		accounts.add(five);
		accounts.add(six);
				
		   for(Account account : accounts) {
			   System.out.println(account.print());
		    }
		
					
	}
}
