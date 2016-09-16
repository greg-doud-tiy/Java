package ssa;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {

	@Test
	public void testGetId() {
		Account myNewAccount = new Account(525252, "myNewAccount");
		assertEquals(525252,myNewAccount.getId());
	}
	
	@Test
	public void testSetId() {
		Account myNewAccount = new Account(525252, "myNewAccount");
		assertEquals(525252,myNewAccount.getId());
	}

	@Test
	public void testGetBalance() {
		Account myNewAccount = new Account(575232, "myNewAccount");
		myNewAccount.setBalance(575232);
		assertEquals(575232,myNewAccount.getBalance(),0);
	}
	public void testSetBalance() {
		Account myNewAccount = new Account(575232, "myNewAccount");
		myNewAccount.setBalance(575232);
		assertEquals(575232,myNewAccount.getBalance(),0);
	}

	@Test
	public void testGetDescription() {
		Account myNewAccount = new Account("myNewAccount");
		assertEquals("myNewAccount",myNewAccount.getDescription());
	}
	@Test
	public void testSetDescription() {
		Account myNewAccount = new Account("myNewAccount");
		assertEquals("myNewAccount",myNewAccount.getDescription());
	}

	@Test
	public void testDeposit() {
		Account myNewAccount = new Account();
		assertEquals(2012,myNewAccount.deposit(2012),0);
	}

	@Test
	public void testWithdraw() {
		Account myNewAccount = new Account();
		myNewAccount.setBalance(200);
		assertEquals(100,myNewAccount.withdraw(100),0);
	}

	@Test
	public void testTransferFrom() {
		Account myNewAccount = new Account();
		Account myNewAccount2 = new Account();
		myNewAccount.deposit(100);
		myNewAccount2.deposit(200);
		myNewAccount.transferFrom(myNewAccount2, 50);
		assertEquals(150,myNewAccount.getBalance(), 0);
	}
	@Test
	public void testPrint() {
		Account myNewAccount = new Account();
		String expected = myNewAccount.getAccountType() + "\t\t" + myNewAccount.getId() + "\t   " + myNewAccount.getDescription()
				+ "  " + String.format("%.2f", myNewAccount.getBalance());
		assertEquals(expected, myNewAccount.print());
	}
}
