package ssatest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ssa.Account;

public class AccountTest {

	private Account acct , acct2, acct3 ;
	
	@Before
	public void setup(){
		
		acct = new Account();
		acct2 = new Account(500, "Checkings");
		acct3 = new Account("Savings");
		
		System.out.println(" Testing Junit");
	}
	@Test
	public void testCreatingAccountUsingDefaultConstructor() {

		assertEquals(0.0, acct.getBalance(),0);
		
	}
	@Test
	public void testCreatingAccountUsingAcctAndStringConstructor() {
		assertEquals(500, acct2.getId());
		assertEquals(0.0, acct2.getBalance(),0);
		assertEquals("Checkings",acct2.getDescription());
		
	}
	@Test
	public void testCreatingAccountUsingStringConstructor() {
	
		assertEquals(0.0, acct3.getBalance(),0);
		assertEquals("Savings",acct3.getDescription());
	}
	@Test
	public void testSetDescriptionMethod() {
		acct3.setDescription("This is My Account");
		assertEquals("This is My Account", acct3.getDescription());
		
	}
	
	@Test
	public void testDepositAccount() {
		acct.deposit(200.0);
		assertEquals(200.0, acct.getBalance(),0);
	}
	@Test
	public void testWithDrawAccount() {
		acct.deposit(200.0);
		acct.withdraw(100.0);
		assertEquals(100.0, acct.getBalance(),0);
	}
	@Test
	public void testTransferFromOneToAnotherAccount() {
		acct.deposit(200.0);
		acct2.deposit(200.0);
		acct.transferFrom(acct2, 100.0);
		assertEquals(300.0, acct.getBalance(),0);
		assertEquals(100.0, acct2.getBalance(),0);
	}
	@Test
	public void testPrintMethod() {
		acct2.deposit(200.0);
		assertEquals(" \t500\t\tCheckings\t\t        $200.00", acct2.print());
	}
	
}
