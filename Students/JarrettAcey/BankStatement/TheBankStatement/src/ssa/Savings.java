
	
	package ssa;

	public class Savings extends Account{

		double InterestRate;
		
		
		public Savings() {
			super();
			InterestRate = .015;
		}
		
		public double getInterestRate() {
			return InterestRate;
		}

		public void setInterestRate(double interestRate) {
			InterestRate = interestRate;
		}
		
		
		public double calcDepositInterest(int months) {
			double	monthlyIntRate = InterestRate / 12;
			double interest = monthlyIntRate * months * getBalance();
			deposit(interest);
			return interest;
		}
		
		
		// Print Method
		public String print() {
	    	 String str = super.print();
	    	 str += String.format(" %11.3f ", this.getInterestRate());
	    	 return str;
		}
		
	}



