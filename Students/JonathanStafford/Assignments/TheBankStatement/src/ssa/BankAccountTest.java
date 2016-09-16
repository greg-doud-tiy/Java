package ssa;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {

	@Before
	public void setUp() {
	}

	@Test
	
	public void TestCheckwithdraw() {
		Checking checking = new Checking();
				checking.setBalance(100);
				checking.withdraw(50);
		assertEquals(101,checking.getLastChecknbr(),0);
			}
	public static void TestCheckPrint() {
		Checking checking = new Checking();
				
		assertEquals("Account: id is " + checking.getId() + ", desc is " + "New Account" +
				", balance is $" + checking.getBalance() +  " Check Number is " + checking.lastChecknbr, checking.print());
			}
	public void TestPrint() {
		Savings savings = new Savings();
		
		savings.setEarnedInterest(1.5);
		
		assertEquals("Account: id is " + savings.getId() + ", desc is " + "New Account" +
		", balance is $" + savings.getBalance() +
		" and earned interest amount is $" + savings.getEarnedInterest(), savings.print());
	}
	public void testSetMonths() {
		Savings savings = new Savings();
			savings.setMonths(3);
		assertEquals(3, savings.getMonths(),0);	
	}
	public void TestSetEarnedInterest() {
		Savings savings = new Savings();
		savings.setEarnedInterest(1.5);
		
		assertEquals(1.5, savings.getEarnedInterest(),0);
	}
	public void TestSetInterestRate() {
		Savings savings = new Savings();
		savings.setInterestRate(.035);
		assertEquals(.035,savings.getInterestRate() , 0);
	}
	public void TestEarnedInterest() {
		Savings savings = new Savings();
		savings.setBalance(100);		
		assertEquals(1.5, savings.earnedInterest(),0);
	}
	public void TestCalcDepositInterest() {
		Savings savings = new Savings();
		savings.setBalance(100);		
		assertEquals(101.5, savings.calcDepositInterest(12),0);
	}
	
	public void testTransferFrom() {
		Account account1 = new Account();
		Account account2 = new Account();
		account1.setBalance(100);
		account2.setBalance(100);
		assertEquals(200, account2.transferFrom(account1, 100),0);
		assertEquals(100, account1.transferFrom(account2, 100),0);
	}
	
	public void testWithdraw() {
		Account account = new Account();
		account.setBalance(100);		
		assertEquals(0, account.withdraw(100),0);
	}
	public void testSetBalance() {
		Account account = new Account();
		account.setBalance(100);
		assertEquals(100, account.getBalance(),0);
	}
	public void testSetId() {
		Account account = new Account();
			account.setId(3);
		assertEquals(3, account.getId());	
	}
	public void testDeposit() {
		Account account = new Account();
		
		assertEquals(100, account.deposit(100),0);
	}
	public void TestDescription() {
		Account account = new Account();
		account.setDescription("stuff");
		assertEquals("stuff", account.getDescription());
	}
}
