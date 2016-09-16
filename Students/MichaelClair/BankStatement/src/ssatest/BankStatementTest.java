package ssatest;

import static org.junit.Assert.*;

import ssa.Account;
import ssa.Savings;
import ssa.Checking;

import org.junit.Before;
import org.junit.Test;

public class BankStatementTest {

	@Before
	public void setup(){
	}
	@Test
	public void accountTest() {
		//Tests Constructors
		assertEquals("My account", new Account("My account").getDescription());
		assertEquals(123, new Account(123, "My account").getId());
		assertEquals(40.00, new Account(40.00).getBalance(),0);
		
		//Tests deposit/withdraw
		assertEquals(90.00, new Account(40.00).deposit(50.00),0);
		assertEquals(30.00, new Account(40.00).withdraw(10.00),0);
		
		//Tests setters/getters
		Account account = new Account();
		account.setDescription("Account Description");
		assertEquals("Account Description",account.getDescription());
		account.setId(5);
		assertEquals(5,account.getId());
		account.setBalance(40.00);
		assertEquals(40.00,account.getBalance(),0);
		
		//Tests transfer
		Account account2 = new Account(50.00);
		account.transferFrom(account2, 30.00);
		assertEquals(70.00, account.getBalance(),0);
		assertEquals(20.00, account2.getBalance(),0);
		
		//Tests print
		assertEquals("Account 5 Balance is $070.00", account.print());
	}
	@Test
	public void savingsTest() {
		//Tests constructors and getters
		assertEquals(123, new Savings(123,"My Savings").getId());
		assertEquals("My Savings", new Savings(123,"My Savings").getDescription());
		
		//Tests setters and getters
		Savings savings = new Savings();
		savings.setInterestRate(.015);
		assertEquals(.015, savings.getInterestRate(),0);
		savings.setInterestRate("1.5%");
		assertEquals(.015, savings.getInterestRate(),0);
		savings.setMinBalance(50.00);
		assertEquals(50.00, savings.getMinBalance(),0);
		
		//Tests calcDepositInterest
		savings.deposit(100.00);
		savings.calcDepositInterest(12);
		assertEquals(101.5, savings.getBalance(),0);	
		
		//Tests that calcDepositInterest won't work if minBalance is not met
		savings.setMinBalance(150.00);
		savings.calcDepositInterest(12);
		assertEquals(101.5, savings.getBalance(),0);
		
		//Tests print
		savings.setDescription("My savings");
		assertEquals("S 1 My savings          101.50      .01", savings.print());
	}
	@Test
	public void checkingTest() {
		Checking checking = new Checking();
		checking.deposit(100.00);
		//Tests getter
		assertEquals(100,checking.getLastCheckNbr());
		//Tests increment of lastCheckNbr
		checking.withdraw(50.00, 101);
		assertEquals(102,checking.getLastCheckNbr());
		//Tests ability to set check number in constructor
 		checking.withdraw(40.00, 200);
 		assertEquals(201,checking.getLastCheckNbr());
 		//Tests setter
		checking.setLastCheckNbr(300);
		assertEquals(300,checking.getLastCheckNbr());
		//Tests print
		checking.setDescription("My checking");
		checking.setId(2);
		assertEquals("C 2 My checking         10.00 300",checking.print());
		}
}

