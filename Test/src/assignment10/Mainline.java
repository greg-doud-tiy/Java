package assignment10;

import java.util.ArrayList;

public class Mainline {

	public static void main(String[] args) {
		ArrayList<Account> accounts = new ArrayList<Account>();
		accounts.add(new Checking());
		accounts.add(new Savings());
		for(Account account : accounts) {
			Class<? extends Account> sorc = account.getClass(); 
			System.out.println(sorc.getSimpleName());
		}
	}

}
