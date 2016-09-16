package ssa;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BankStatementTest {

	
	Account testAccount = new Account();
	Savings savingsA = new Savings();
	Checking checkingB = new Checking();
	Savings testSavings = new Savings();
	
	
	
	


	/***************************************************/
	/*************     setId Method     ****************/
	/***************************************************/
	@Test
	public void testSetId(){
	//Private Method - tested within the constructor
	Account testAccount = new Account(111, "New Account");
	assertEquals(111, testAccount.getId());
	Account testAccount1 = new Account(999, "New Account");
	assertEquals(999, testAccount1.getId());
	Account testAccount2 = new Account(000, "New Account");
	assertEquals(000, testAccount2.getId());
	Account testAccount3 = new Account(234, "New Account");
	assertEquals(234, testAccount3.getId()); 
	}
	/***************************************************/
	/*************     setAcctCode Method     ****************/
	/***************************************************/
	@Test
	public void testSetAcctCode(){
	assertEquals('s',savingsA.getAcctCode());
	assertEquals('c',checkingB.getAcctCode());
	
	}
	/***************************************************/
	/**************   setDescription    ****************/
	/***************************************************/
	@Test
	public void setDescription(){
	testAccount.setDescription("Account 1");
	assertEquals("Account 1", testAccount.getDescription());
	testAccount.setDescription("Account 2");
	assertEquals("Account 2", testAccount.getDescription());
	testAccount.setDescription("Account 3");
	assertEquals("Account 3", testAccount.getDescription());
	testAccount.setDescription("Account 4");
	assertEquals("Account 4", testAccount.getDescription());
	}
	
	/***************************************************/
	/***********    setBalance & Deposit     ***********/
	/***************************************************/
	@Test
	public void testSetBalDeposit(){
	testAccount.deposit(0.00);
	assertEquals(0.00, testAccount.getBalance(), 0);
	testAccount.withdraw(testAccount.getBalance());
	testAccount.deposit(-10.00);
	assertEquals(0.00, testAccount.getBalance(), 0);
	testAccount.withdraw(testAccount.getBalance());
	testAccount.deposit(110.00);
	assertEquals(110.00, testAccount.getBalance(), 0);
	testAccount.withdraw(testAccount.getBalance());
	testAccount.deposit(2000.01);
	assertEquals(2000.01, testAccount.getBalance(), 0);
	}
	
	/***************************************************/
	/***********      withdraw Method        ***********/
	/***************************************************/
	@Test
	public void testWithdraw(){
	testAccount.deposit(50.00);
	testAccount.withdraw(10.00);
	assertEquals(40.00, testAccount.getBalance(), 0);
	testAccount.withdraw(testAccount.getBalance());
	testAccount.deposit(0.00);
	testAccount.withdraw(10.00);
	assertEquals(0.00, testAccount.getBalance(), 0);
	testAccount.withdraw(testAccount.getBalance());
	testAccount.deposit(50.00);
	testAccount.withdraw(60.00);
	assertEquals(50.00, testAccount.getBalance(), 0);
	testAccount.withdraw(testAccount.getBalance());
	testAccount.deposit(100.00);
	testAccount.withdraw(75.50);
	assertEquals(24.50, testAccount.getBalance(), 0);
	}
	
	/***************************************************/
	/****       transfer Method  (From Savings)     ****/
	/***************************************************/
	@Test
	public void testTransferFromSavings(){
	savingsA.deposit(100.00);
	checkingB.deposit(100.00);
	checkingB.transferFrom(savingsA,  50.00);
	assertEquals(50.00,savingsA.getBalance(),0);
	assertEquals(150.00,checkingB.getBalance(),0);
	savingsA.withdraw(savingsA.getBalance());
	checkingB.withdraw(checkingB.getBalance());
	savingsA.deposit(100.00);
	checkingB.deposit(100.00);
	checkingB.transferFrom(savingsA,  1000.00);
	assertEquals(100.00,savingsA.getBalance(),0);
	assertEquals(100.00,checkingB.getBalance(),0);

	}
	 @Test
	public void testTransferFromChecking(){
	savingsA.deposit(100.00);
	checkingB.deposit(100.00);
	savingsA.transferFrom(checkingB,  50.00);
	assertEquals(150.00,savingsA.getBalance(),0);
	assertEquals(50.00,checkingB.getBalance(),0);
	savingsA.withdraw(savingsA.getBalance());
	checkingB.withdraw(checkingB.getBalance());
	savingsA.deposit(100.00);
	checkingB.deposit(100.00);
	savingsA.transferFrom(checkingB,  1000.00);
	assertEquals(100.00,checkingB.getBalance(),0);
	assertEquals(100.00,savingsA.getBalance(),0);
	}
	

	/***************************************************/
	/***************************************************/
	/***********  Testing the Savings Class  ***********/
	/***************************************************/
	/***************************************************/
	
	/***************************************************/
	/***********      setBelowMin Method     ***********/
	/***************************************************/
@Test
public void testSetBelowMin(){
	
	testSavings.setBelowMin(false);
	assertFalse("", testSavings.isBelowMin());
	testSavings.setBelowMin(true);
	assertTrue("", testSavings.isBelowMin());
	testSavings.setBelowMin(true);
	assertTrue("", testSavings.isBelowMin());
	testSavings.setBelowMin(false);
	assertFalse("", testSavings.isBelowMin());
	
	
}

	/***************************************************/
	/***********   setIntRate Method    ***********/
	/***************************************************/
	@Test
	public void testsetIntRate(){
		
		testSavings.setIntRate(.015);
		assertEquals(1.5,testSavings.getIntRate(),0);
		testSavings.setIntRate(0.5);
		assertEquals(50,testSavings.getIntRate(),0);
		testSavings.setIntRate(0);
		assertEquals(0,testSavings.getIntRate(),0);
		testSavings.setIntRate(-1.0);
		assertEquals(0,testSavings.getIntRate(),0);
		
	}
     
	/***************************************************/
	/******     CalcDepositInterest Method      ********/
	/***************************************************/
	@Test
	public void testCalcDepositInterest(){
	testSavings.setBelowMin(false);
	testSavings.setIntRate(-1);
	testSavings.deposit(500);
	assertEquals(0, testSavings.CalcDepositInterest(4), 0);
	testSavings.withdraw(testSavings.getBalance());
	testSavings.setBelowMin(false);
	testSavings.setIntRate(0);
	testSavings.deposit(500);
	assertEquals(0, testSavings.CalcDepositInterest(4), 0);
    testSavings.withdraw(testSavings.getBalance());
	testSavings.setBelowMin(false);
	testSavings.setIntRate(0.2);
	testSavings.deposit(100);
	assertEquals(6.67, testSavings.CalcDepositInterest(4), 0.1);
	testSavings.withdraw(testSavings.getBalance());
	testSavings.setBelowMin(false);
	testSavings.setIntRate(1.0);
	testSavings.deposit(150);
	assertEquals(75.00, testSavings.CalcDepositInterest(6), 0);
	
	}
	/***************************************************/
	/***************************************************/
	/***********  Testing the Checking Class  ***********/
	/***************************************************/
	/***************************************************/
	
	/***************************************************/
	/***********     setlastCheckNbr Method  ***********/
	/***************************************************/
	@Test
	public void testSetlastCheckNbrDefault(){
	
		assertEquals(100, checkingB.getLastCheckNbr());
	
	
	}
	@Test
	public void testlastCheckNbr(){
	
	checkingB.setLastCheckNbr(-1);
	assertEquals(100, checkingB.getLastCheckNbr());
	checkingB.setLastCheckNbr(0);
	assertEquals(100, checkingB.getLastCheckNbr());
	checkingB.setLastCheckNbr(550);
	assertEquals(550, checkingB.getLastCheckNbr());
	checkingB.setLastCheckNbr(999);
	assertEquals(999, checkingB.getLastCheckNbr());
	
	
}
	/***************************************************/
	/***********    LastChkNbr Incrementing  ***********/
	/***************************************************/
	
	@Test
	public void testWithdrawChecking(){
		
		
		checkingB.deposit(50.00);
		checkingB.withdraw(10.00);
		assertEquals(40.00, checkingB.getBalance(), 0);
		assertEquals(101, checkingB.getLastCheckNbr());
		checkingB.withdraw(10);
		assertEquals(102, checkingB.getLastCheckNbr());
		assertEquals(30.00, checkingB.getBalance(), 0);
		checkingB.deposit(0.00);
		checkingB.withdraw(10.00);
		assertEquals(103, checkingB.getLastCheckNbr());
		assertEquals(20.00, checkingB.getBalance(), 0);
	
	}
	
}



