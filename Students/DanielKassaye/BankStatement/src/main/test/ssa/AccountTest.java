package ssa;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class AccountTest {
	Checking checking = new Checking();
	Savings savings = new Savings();

	@Before
	public void setup(){
	    
	  //setting values for the test
		checking.setId(1);
		checking.setDescription("Checking1");  
		checking.deposit(200);
		checking.withdraw(100);
		
		savings.deposit(5000);
		savings.withdraw(4800);
		savings.setDescription("Savings1");
		savings.setMonths(2);
		savings.setIntRate(0.015);
	}
	
	@Test
	public void indicatorTest() {
	
		assertEquals('S', savings.firstLetterOfAccountName());
		assertEquals('C', checking.firstLetterOfAccountName());
		
	}

	 @Test
	    public void testDeposit() {
		

		//Test for deposit method 
		assertEquals(100, checking.getBalance(),0);
		
		assertEquals("deposit",200, checking.deposit(100),0);
		assertEquals("deposit",0, checking.deposit(-100),0);
		
		assertEquals(200, checking.getBalance(),0);
		
	 }
	 
	 
	    @Test
	    public void testWithdrwal() {

		//Test for withdraw method
		
		assertEquals(100, checking.getBalance(),0);
		assertEquals("withdraw",0, checking.withdraw(100),0);
		assertEquals("withdraw",0, checking.withdraw(100),0);
		assertEquals(0, checking.getBalance(),0);
		assertEquals("withdraw",0, checking.withdraw(100),0);	
		
	    }
	    
	    @Test
	    public void testPrint() {
		
		//Test for print method
		assertEquals('C' + "  " + 1 + "	"	+ "Checking1" +	"		" +	"100.00" + "  " + 0, checking.print());
	    }
	    
	    @Test
	    public void testTransfer() {
		
		assertEquals(100, checking.getBalance(),0);
		assertEquals(300, savings.transferFrom(checking, 100),0);	
		
		assertEquals(300, savings.getBalance(),0);
		
	
		assertEquals(300, checking.transferFrom(savings, 300),0);
		assertEquals(0, savings.getBalance(),0);

	    }
	    
	    @Test
	    public void testSavings()
	    {
		//Test for calcDepositInterest in Savings class 
	    	
	   savings.getMonths();
		assertEquals(0.499, savings.calcDepositInterest(),0.001);
		System.out.println(savings.calcDepositInterest());
		
		
	    }
	    
	    
}
