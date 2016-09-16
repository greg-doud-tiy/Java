package ssa;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class AccountsTest {
static Account account;
static Savings savings;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		 account = new Account();
		 savings = new Savings();
		
	}

	@Test
	public void test() {
		
			Account account = new Account();
			
			String testDescription = "Test description for my account";
			account.setDescription(testDescription);
			assertEquals(testDescription, account.getDescription());
			
			double testBalance = 5;
			account.setBalance(testBalance);
			assertEquals(testBalance, account.getBalance(), 0.005);

			double testdeposit = 5;
			account.deposit(5);
			assertEquals(10, account.getBalance(), 0.005);
			
			double testwithdraw = 5;
			account.withdraw(5);
			assertEquals(testwithdraw, account.getBalance(), 0.005);
			
			Account account1 = new Account();
			double testTransfer = 5;
			account1.deposit(10);
			account.transferFrom(account1, 5);
			assertEquals(10, account.getBalance(), 0.005);
			assertEquals(testTransfer, account1.getBalance(), 0.005);
			
			Savings savings2 = new Savings();
			double testinterest = 5;
			savings2.setInterestRate(5);
			assertEquals(testinterest, savings2.getInterestRate(), 0.005);
			
			Savings savings1 = new Savings();
			double testMinimum = 25;
			savings1.setMinimumBalance(25);
			assertEquals(testMinimum, savings1.getMinimumBalance(), 0.005);
			
			Savings savings3 = new Savings();
			savings3.deposit(500);
			double testdepint = 2.5;
			savings3.CalcDepositInterest(4);
			assertEquals(502.5,savings3.getBalance(), 0.005);
			
			Account account11 = new Account();
//			account11.withdraw(-500);
			String testprint = "Processing error";
			assertEquals(testprint, account11.withdraw(-500));
	}

}
