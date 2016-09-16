package ssa;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

//import com.ssa.tiy.main.Checking;
//import com.ssa.tiy.main.Savings;

public class TestBankStatement {

	@Before
	public void setUp() {
	System.out.println("Let's test those bank accounts!");
	}

	Account myAccount = new Account();
	Savings mySavings = new Savings();
	Checking myChecking = new Checking();

		@Test
		public void testAccount() {
			Account newAcct = new Account();
			newAcct.setBalance(500);
			assertEquals(500, newAcct.getBalance(), 0);
			assertEquals(600, newAcct.deposit(100), 0);
			assertEquals(900, newAcct.deposit(300), 0);
			assertEquals(900, newAcct.deposit(-100),0);
			assertEquals(300, newAcct.withdraw(600),0 );
			assertEquals(150, newAcct.withdraw(150), 0);
			assertEquals(150, newAcct.withdraw(300),0);
			newAcct.setId(101);
			assertEquals(101, newAcct.getId());
			Account newAct = new Account("My Account");
			assertEquals("My Account", newAct.getDescription());
			assertEquals(0, newAct.getBalance(),0);
			newAct.setBalance(5000);
			assertEquals(5000, newAct.getBalance(),0);
			Account myAcct = new Account(621, "Play Money");
			assertEquals(621, myAcct.getId());
			assertEquals("Play Money", myAcct.getDescription());
			assertEquals(300, myAcct.deposit(300), 0);
			myAcct.transferFrom(newAcct, 150);
			assertEquals(450, myAcct.getBalance(),0);
			assertEquals(0, newAcct.getBalance(),0);
			myAcct.setNewId(4562);
			assertEquals(4562, myAcct.getNewId(),0);
			myAccount.setBalance(1000);
			assertEquals(1000, myAccount.getBalance(),0);
			myAcct.setType("Cool");
			assertEquals("Cool", myAcct.getType());
			newAct.setType("579");
			assertEquals("579", newAct.getType());
			assertEquals("621 Play Money\t  ", myAcct.print());
			
			
			}
		@Test
		public void testSavings() {
			Savings mySavings = new Savings();
			mySavings.setBalance(100);
			assertEquals(100, mySavings.getBalance(),0);
			assertEquals(750, mySavings.deposit(650),0);
			assertEquals(500, mySavings.withdraw(250),0);
			mySavings.setInterestRate(.015);
			assertEquals(0.015, mySavings.getInterestRate(),0);
			mySavings.calcDepositInterest(4);  //interest should be 2.50 making the balance 502.50
			assertEquals(502.50, mySavings.getBalance(),0);
			mySavings.setBalance(1000);
			mySavings.calcDepositInterest(8);
			assertEquals(1010, mySavings.getBalance(),0);
			Savings newSavings = new Savings("Savings test account");
			newSavings.setId(501);
			assertEquals(501, newSavings.getId(),0);
			newSavings.setBalance(500);
			assertEquals(500, newSavings.getBalance(),0);
			newSavings.calcDepositInterest(16);
			assertEquals(510, newSavings.getBalance(),0);
			newSavings.transferFrom(mySavings, 200);
			assertEquals(810, mySavings.getBalance(),0);
			assertEquals(710, newSavings.getBalance(),0);
			newSavings.setId(201);
			newSavings.setInterestRate(.015);
			Savings personalSavings = new Savings(999, "My personal savings account");
			assertEquals(999, personalSavings.getId(),0);
			assertEquals(0, personalSavings.getBalance(),0);
			personalSavings.setInterestRate(.05);
			assertEquals(.05, personalSavings.getInterestRate(),0);
			personalSavings.setBalance(6666);
			assertEquals(6666, personalSavings.getBalance(),0);
			personalSavings.calcDepositInterest(30);
			assertEquals(7499.25, personalSavings.getBalance(),0);
			mySavings.setBalance(3000);
			assertEquals(3000, mySavings.getBalance(),0);
			assertEquals("S", personalSavings.getType());
			mySavings.setType("S");
			assertEquals("S", mySavings.getType());
			newSavings.setType("Awesome");
			assertEquals("Awesome", newSavings.getType());
			
			
		}
		
		@Test
		public void testChecking() {
			Checking newChecking = new Checking();
			assertEquals(0, newChecking.getBalance(),0);
			newChecking.setBalance(120);
			assertEquals(120, newChecking.getBalance(),0);
			newChecking.setLastCheckNbr(100);
			assertEquals(100, newChecking.getLastCheckNbr(),0);
			Checking myChecking = new Checking("My checking account");
			assertEquals(0, myChecking.getBalance(),0);
			myChecking.setBalance(900);
			assertEquals(900, myChecking.getBalance(),0);
			assertEquals(1.0, myChecking.getLastCheckNbr(),0);
			newChecking.transferFrom(myChecking, 80);
			assertEquals(200, newChecking.getBalance(),0);
			assertEquals(820, myChecking.getBalance(),0);
			Checking personalChecking = new Checking(1096, "Personal checking");
			assertEquals(0, personalChecking.getBalance(),0);
			personalChecking.setBalance(70);
			assertEquals(70, personalChecking.getBalance(),0);
			assertEquals(1.0, personalChecking.getLastCheckNbr(),0);
			personalChecking.setLastCheckNbr(128);
			assertEquals(128, personalChecking.getLastCheckNbr(),0);
			myChecking.setBalance(1500);
			assertEquals(1500, myChecking.getBalance(),0);
			assertEquals("C",newChecking.getType());
			myChecking.setType("C");
			assertEquals("C", myChecking.getType());
			newChecking.setType("Wooo!");
			assertEquals("Wooo!", newChecking.getType());
			assertEquals("C 1096 Personal checking\t  70.00  128", personalChecking.print());
		
		}
}