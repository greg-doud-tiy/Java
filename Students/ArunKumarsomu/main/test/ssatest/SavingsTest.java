package ssatest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ssa.Savings;

public class SavingsTest {

private Savings savings1 , savings2, savings3 ;
	
	@Before
	public void setup(){
		
		savings1 = new Savings();
		savings2 = new Savings(500, "Savings");
		savings3 = new Savings("Savings");
		
		System.out.println(" Testing Junit");
	}
	@Test
	public void testCreatingSavingsUsingDefaultConstructor() {

		assertEquals(0.0, savings1.getBalance(),0);
		
	}
	@Test
	public void testCreatingSavingsUsingAccountNoAndStringConstructor() {
		assertEquals(500, savings2.getId());
		assertEquals(0.0, savings2.getBalance(),0);
		assertEquals("Savings",savings2.getDescription());
		
	}
	@Test
	public void testCreatingSavingsUsingStringConstructor() {
		assertEquals(0.0, savings3.getBalance(),0);
		assertEquals("Savings",savings3.getDescription());
	}
	@Test
	public void testDepositAccount() {
		savings1.deposit(200.0);
		assertEquals(200.0, savings1.getBalance(),0);
	}
	@Test
	public void testWithDrawAccount() {
		savings1.deposit(200.0);
		savings1.withdraw(100.0);
		assertEquals(100.0, savings1.getBalance(),0);
	}
	@Test
	public void testTransferFromOneToAnotherAccount() {
		savings1.deposit(200.0);
		savings2.deposit(200.0);
		savings1.transferFrom(savings2, 100.0);
		assertEquals(300.0, savings1.getBalance(),0);
		assertEquals(100.0, savings2.getBalance(),0);
	}
	@Test
	public void testCalcDepositInterestMethod() {
		savings1.deposit(1000.0);
		assertEquals(1000.0, savings1.getBalance(),0);
		savings1.calcDepositInterest(12);
		assertEquals(1015.0, savings1.getBalance(),0);
	}

	@Test
	public void testPrintMethod() {
		savings2.deposit(200.0);
		savings2.withdraw(100.0);
		assertEquals("S 	500		Savings		        $100.00 	 	1.50", savings2.print());
	}
}
