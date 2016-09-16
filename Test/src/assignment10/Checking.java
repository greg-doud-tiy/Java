package assignment10;

public class Checking extends Account {
	@Override
	public void deposit(double amount) {
		System.out.printf("%s", "Checking");
	}
}
