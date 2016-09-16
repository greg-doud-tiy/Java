package ssa;

import static org.junit.Assert.*;

import org.junit.Test;

public class SavingsTest {


	@Test
	public void testGetInterestRate() {
		Savings myNewAccount = new Savings(2.5);
		assertEquals(2.5,myNewAccount.getInterestRate(), 0);
	}
	
	@Test
	public void testSetInterestRate() {
		Savings myNewAccount = new Savings(2.5);
		assertEquals(2.5,myNewAccount.getInterestRate(), 0);
	}

	@Test
	public void testCalcDepositInterest() {
		Savings myNewAccount2 = new Savings(.015);
		myNewAccount2.setBalance(100);
		assertEquals(1.5,myNewAccount2.calcDepositInterest(12),0);
	}
}