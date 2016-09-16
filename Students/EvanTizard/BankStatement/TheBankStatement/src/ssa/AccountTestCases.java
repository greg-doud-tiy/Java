package ssa;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AccountTestCases {
	Checking acct= new Checking();
	Savings savingsAcct= new Savings();
	@Before
	public void setup(){
		
		
		
		
		acct.setDescription("Evans Account");
		acct.setAccountBalance(100);
		savingsAcct.setInterestRate(0.015);
		
		
	}

	@Test
	public void testBalance(){
		assertEquals(100,acct.getBalance(),0);
		
	}
	

	@Test
	public void testDeposit() {
		assertEquals(200, acct.deposit(100),0);
		
	}
	
	@Test
	public void testDescription() {
		assertEquals("Evans Account", acct.getDescription());
		
	}
	@Test
	public void testSavings(){
		assertEquals(0.015, savingsAcct.getInterestRate(),0);
		
	}
	@Test
	public void testLastCheckingNumber() {
		assertEquals(110, acct.getLastCheckNumber(),0);
	}
	

}
