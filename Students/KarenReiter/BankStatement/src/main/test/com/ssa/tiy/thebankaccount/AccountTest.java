package com.ssa.tiy.thebankaccount;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class AccountTest {
	
	Account acc;
	Savings sav;
	Checking chk;
	
	
	@Before
	public void setup(){
		acc= new Account();
		sav = new Savings(0.05);
		chk= new Checking(100);
		
	}
	@Test
	public void testEverything(){
		sav.deposit(100.00);
		assertEquals(100, sav.getBalance(),0);
		assertEquals(200, chk.chkNum,200);
		
		
		
	}
	
}
