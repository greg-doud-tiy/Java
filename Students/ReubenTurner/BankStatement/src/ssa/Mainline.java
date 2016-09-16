//-------------------------------------------------------
// Reuben Turner
// Aug 31, 2016
// Assignment 11
// Mainline.java
//-------------------------------------------------------

package ssa;
import java.util.ArrayList;

public class Mainline 
{
	public static void main(String[] args) 
	{
		Checking one = new Checking();
		one.setDescription("Reuben's Checking Account");
		one.deposit(1000); // balance 1,000
		one.withdraw(500); // check 100, balance 500
		one.withdraw(100); // check 200, balance 400
		one.withdraw(100); // check 300, balance 300
		one.withdraw(100); // check 400, balance 200
		
		Savings two = new Savings();
		two.setDescription("Reuben's Savings Account");
		two.deposit(500);
		two.setInterestRate(3.25);
		
		ArrayList<Account> accounts = new ArrayList<Account>();
		accounts.add(one);
		accounts.add(two);
		
		System.out.printf("%-2s%-4s%-29s%-7s%-4s%-4s\n", "T", "Act", "Description", "Bal", "Chk", "Rate");
		System.out.printf("%-2s%-4s%-29s%-7s%-4s%-4s\n", "=", "===", "============================", "======", "===", "====");
		for(Account account : accounts) {
		    System.out.println(account.print());
		}
	}
}
