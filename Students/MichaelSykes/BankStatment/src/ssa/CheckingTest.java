package ssa;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckingTest {

	@Test
	public void testWithdraw() {
		Account myNewAccount = new Account();
		myNewAccount.setBalance(200);
		assertEquals(100,myNewAccount.withdraw(100),0);
	}

	@Test
	public void testGetLastCheckNbr() {
		Checking myNewChecking = new Checking();
		assertEquals(100,myNewChecking.getLastCheckNbr());

	}

	@Test
	public void testSetLastCheckNbr() {
		Checking myNewChecking = new Checking();
		assertEquals(100,myNewChecking.getLastCheckNbr());
	}

}
