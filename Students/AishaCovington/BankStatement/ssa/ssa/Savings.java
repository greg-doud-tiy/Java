package ssa;


public class Savings extends Account {
	
	private double interestRate;
	private double deposit;
	
		public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate){
		this.interestRate = interestRate;
	}
	public void calcDepositInterest(int months){
		double InterestPaid = this.getInterestRate() / 12 * months * this.getBalance();
		this.deposit(InterestPaid);
		this.getBalance();

	}
	public double getDeposit() {
		return deposit;
	}
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	
	
	
	

	public String print(){
		String st =super.print();
		st += String.format("     %5.3f", this.getInterestRate());
				return st;
				
				
		
	}
	
}

