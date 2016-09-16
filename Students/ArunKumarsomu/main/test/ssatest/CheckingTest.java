package ssatest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import ssa.Checking;

public class CheckingTest {

private Checking checking1 , checking2, checking3 ;
	
	@Before
	public void setup(){
		
		checking1 = new Checking();
		checking2 = new Checking(500, "Checking");
		checking3 = new Checking("Checking");
		
		System.out.println(" Testing Junit");
	}
	@Test
	public void testCreatingSavingsUsingDefaultConstructor() {

		assertEquals(0.0, checking1.getBalance(),0);
		
	}
	@Test
	public void testCreatingSavingsUsingAccountNoAndStringConstructor() {
		assertEquals(500, checking2.getId());
		assertEquals(0.0, checking2.getBalance(),0);
		assertEquals("Checking",checking2.getDescription());
		
	}
	@Test
	public void testCreatingSavingsUsingStringConstructor() {
		assertEquals(0.0, checking3.getBalance(),0);
		assertEquals("Checking",checking3.getDescription());
	}
	@Test
	public void testDepositAccount() {
		checking1.deposit(200.0);
		assertEquals(200.0, checking1.getBalance(),0);
	}
	@Test
	public void testWithDrawAccount() {
		checking1.deposit(200.0);
		checking1.withdraw(100.0);
		assertEquals(100.0, checking1.getBalance(),0);
	}
	@Test
	public void testTransferFromOneToAnotherAccount() {
		checking1.deposit(200.0);
		checking2.deposit(200.0);
		checking1.transferFrom(checking2, 100.0);
		assertEquals(300.0, checking1.getBalance(),0);
		assertEquals(100.0, checking2.getBalance(),0);
	}
	@Test
	public void testPrintMethod() {
		checking2.deposit(200.0);
		checking2.withdraw(100.0);
		assertEquals("C 	500		Checking		        $100.00		101", checking2.print());
	}

}
