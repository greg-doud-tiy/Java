package com.ssa.tiy.thebankaccount;

import java.util.ArrayList;

public class Mainline {
	
public static void main(String[] args) {
	Savings savings1 = new Savings(0.025);
	savings1.setDescription("Savings A");
	savings1.setId(110);
	savings1.setType("S");
	savings1.setBalance(500);
	Savings savings2 = new Savings(0.015);
	savings2.setDescription("Savings B");
	savings2.setId(130);
	savings2.setType("S");
	savings2.setBalance(600);
		
	Checking checking1 = new Checking(100);
	checking1.setDescription("Checking B");
	checking1.setId(120);
	checking1.setType("C");
	checking1.setBalance(500);
	Checking checking2 = new Checking(230);
	checking2.setDescription("Checking D");
	checking2.setId(140);
	checking2.setType("C");
	checking2.setBalance(500);
	
	
	ArrayList<Account> accountList = new ArrayList<Account>();

	accountList.add(savings1);
	accountList.add(savings2);
	accountList.add(checking1);
	accountList.add(checking2);
	
System.out.println("Bank Statement");
System.out.println("T   Act   Description       Bal    chk    Rate");
System.out.println("=   === ================   =====  =====  ======");

//for(initializer ; test-expressiong; updater)

		for(Account account:  accountList){
			
			System.out.println(account.print());
		}
	
      
		//

}


public void printStatement(){}
}
		