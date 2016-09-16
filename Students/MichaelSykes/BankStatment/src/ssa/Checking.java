package ssa;

public class Checking extends Account {

private static int lastCheckNbr = 100;


	public int getLastCheckNbr() {
	return lastCheckNbr;
}

public static void setLastCheckNbr(int lastCheckNbr) {
	Checking.lastCheckNbr = lastCheckNbr;
}

	double withdraw(double amount) {
		lastCheckNbr++;
		return
			super.withdraw(amount);
		}
	public String print() {
		//return "Account " + id + " balance is $ " + String.format("%.2f", balance);
		return super.print() + "\t     " + lastCheckNbr + "\t " + "N/A";
	}
 }

