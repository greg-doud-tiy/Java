package ssa;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestAccount {

		
		@Before
		
		public void setup(){
			
		}

		@Test
		public void accountTest() {
			//new Account accTest set balance at 500
				Account accTest = new Account();
				accTest.setBalance(500);
			//Declare a new Account test1
				Account test1 = new Account();
			//set balance of test1 to 500 and test
				test1.setBalance(500);
				assertEquals(500, test1.getBalance(),0);
			//deposit 500 into test1 and test 
				test1.deposit(500);
				assertEquals(1000, test1.getBalance(),0);
			//withdraw 300 from test1 and test
				test1.withdraw(300);
				assertEquals(700, test1.getBalance(),0);
			//transfer from test1 to accTest and test
				test1.transferFrom(accTest, 200);
				assertEquals(500, test1.getBalance(),0);
			//withdrawal for more than is in the account, should deny transaction and return balance of 500 and test
				test1.withdraw(800);
				assertEquals(500, test1.getBalance(),0);
			//transfer for more than is in account
				test1.transferFrom(accTest, 1000);
				assertEquals(500, test1.getBalance(),0);
			//test to get account id and test what whether it comes back correct id automatically assigned
				test1.getAccountId();
				assertEquals(1002, test1.getAccountId(),0);
			//set description and test get description to see if they are working
				test1.setDescription("This is only a test");
				assertEquals("This is only a test", test1.getDescription());
			//test to get account id and test what whether it comes back with error
			//came back with error
			//	test1.getAccountId();
			//	assertEquals(0, test1.getAccountId(),0);
			//test for inputting negative number
			//	test1.deposit(-200);
			//	assertEquals(0, test1.getBalance(),0);
				test1.printHeader();
				test1.print();
		}
				@Test
			public void savingsTest(){
		
				Savings test2 = new Savings();
			//set and get MinimumBalance and testing
				test2.setMimimumBalance(300);
				assertEquals(300, test2.getMinimumBalance(),0);
			//get and set InterestRates and testing
				test2.setInterestRate(.005);
				assertEquals(.005, test2.getInterestRate(),0);
				test2.print();

		
		}
	}



