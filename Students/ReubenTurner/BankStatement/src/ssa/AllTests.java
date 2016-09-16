//-------------------------------------------------------
// Reuben Turner
// Aug 31, 2016
// Assignment 11
// AllTests.java - JUnit Test File
//
// This class contains all JUnit test cases for
// Assignment 11.
//-------------------------------------------------------

package ssa;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class AllTests 
{
	Checking start;
	Savings account2;
	
	//------------------------------------------
	// Set up new accounts on each run. This
	// happens before all other tests are run.
	//------------------------------------------
	@Before
	public void setUp() throws Exception
	{
		start = new Checking();
		account2 = new Savings();
	}
	
	//=====================================================
	// Test the deposit() method for an account.
	//
	// TEST BOUNDS:
	// ------------
	// LOW: 0 
	// MID: 10, 100, 1,000, 10,000, 100,000 (5 tests)
	// HIGH: 1,000,000
	// BEYOND SCOPE: Any negative number
	//=====================================================
	@Test
	public void testDeposit()
	{
		// Test low bound
		start.deposit(0);
		String error = start.getErrorMsg();
		assertEquals("Invalid deposit amount.", error);
		
		// Test mid bound 1
		start.deposit(10);
		double bal = start.getBalance();
		assertEquals(10, bal, 0.001);
		
		// Test mid bound 2
		start.deposit(100);
		bal = start.getBalance();
		assertEquals(110, bal, 0.001);
		
		// Test mid bound 3
		start.deposit(1000);
		bal = start.getBalance();
		assertEquals(1110, bal, 0.001);
		
		// Test mid bound 4
		start.deposit(10000);
		bal = start.getBalance();
		assertEquals(11110, bal, 0.001);
		
		// Test mid bound 5
		start.deposit(100000);
		bal = start.getBalance();
		assertEquals(111110, bal, 0.001);
		
		// Test beyond scope
		// Test mid bound 2
		start.deposit(-100);
		error = start.getErrorMsg();
		assertEquals("Invalid deposit amount.", error);
	}
	
	//=====================================================
	// Test the withdraw() method for an account.
	//
	// TEST BOUNDS:
	// ------------
	// LOW: 0 
	// MID: 100, 500, 1,000 (3 tests)
	// HIGH: 10,000
	// BEYOND SCOPE: Any negative number
	//=====================================================
	@Test
	public void testWithdraw()
	{
		// Set up account with money so we can withdraw
		start.deposit(1000000); // 1,000,000
		
		// Test low bound
		start.withdraw(0);
		String error = start.getErrorMsg();
		assertEquals("Invalid withdrawal amount.", error);
		
		// Test mid bound 1
		start.withdraw(100);
		double bal = start.getBalance();
		assertEquals(999900, bal, 0.001);
		
		// Test mid bound 2
		start.withdraw(500);
		bal = start.getBalance();
		assertEquals(999400, bal, 0.001);
		
		// Test mid bound 3
		start.withdraw(1000);
		bal = start.getBalance();
		assertEquals(998400, bal, 0.001);
		
		// Test beyond scope
		start.withdraw(-100);
		error = start.getErrorMsg();
		assertEquals("Invalid withdrawal amount.", error);
	}
	
	//=====================================================
	// Test the transfer() method for an account.
	//
	// TEST BOUNDS:
	// ------------
	// LOW: 0 
	// MID: 100, 500, 1,000 (3 tests)
	// HIGH: 10,000
	// BEYOND SCOPE: Any negative number
	//=====================================================
	@Test
	public void testTransfer()
	{
		start.deposit(1000000); // 1,000,000
		
		// Test low bound
		start.transferFrom(account2, 0);
		String error = start.getErrorMsg();
		assertEquals("Invalid withdrawal amount.", error);
		
		// Test mid bound 1
		start.transferFrom(account2, 100);
		double bal1 = start.getBalance();
		double bal2 = account2.getBalance();
		assertEquals(999900, bal1, 0.001);
		assertEquals(100, bal2, 0.001);
		
		// Test mid bound 2
		start.transferFrom(account2, 500);
		bal1 = start.getBalance();
		bal2 = account2.getBalance();
		assertEquals(999400, bal1, 0.001);
		assertEquals(600, bal2, 0.001);
		
		// Test mid bound 3
		start.transferFrom(account2, 1000);
		bal1 = start.getBalance();
		bal2 = account2.getBalance();
		assertEquals(998400, bal1, 0.001);
		assertEquals(1600, bal2, 0.001);
		
		// Test beyond scope
		start.transferFrom(account2, -100);
		error = start.getErrorMsg();
		assertEquals("Invalid withdrawal amount.", error);
	}
	
	//=============================
	// Tests for Savings account
	//=============================
	@Test
	public void testSavingsInterest()
	{
		account2.setInterestRate(1.25);
		double rate = account2.getInterestRate();
		assertEquals(1.25, rate, 0.001);
		
		account2.deposit(1000);
		double result = account2.CalcDepositInterest(12);
		assertEquals(1250, result, 0.001);
	}
	
	//=============================
	// Tests for Checking account
	//=============================
	@Test
	public void testChecking()
	{
		int checkNum = start.getCheckNum();
		assertEquals(0, checkNum);
	}
}
