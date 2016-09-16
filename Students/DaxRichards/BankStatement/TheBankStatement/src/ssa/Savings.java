package ssa;

					/***************************************************/
					/**********       TheBankStatement       ***********/
					/***************************************************/

public class Savings extends Account {

	double interestRate;
	boolean isBelowMin;
	double totIntPaid;
    char   savingsCode;
	
	public double getTotIntPaid() {
		return totIntPaid;
	}

	public Savings() {

		setBelowMin(false);
		setAcctCode('s');

	}


	public boolean isBelowMin() {
		return isBelowMin;
	}

	public void setBelowMin(boolean isBelowMin) {
		this.isBelowMin = isBelowMin;
	}

	public double getIntRate() {
		return 100*interestRate;
	}

	public void setIntRate(double interestRate) {
		if(interestRate >= 0)
		this.interestRate = interestRate;
		
	}

	public double CalcDepositInterest(int months) {
	
		if ((isBelowMin() == false) && getIntRate() > 0){
			double amount = (((getIntRate())/12)*months) * this.getBalance()/100;
			deposit(amount);
			totIntPaid += amount;
			return amount; ///This was added in case you would like to pass as a parameter in the deposit method directly
	   }
		else{
			return 0.00;
			}
		
				}
public String print(){
	
	//return super.print() + " the total interest paid to date on the account is: $" + String.format("%.2f",getTotIntPaid());
	return super.print() + "\t\t" + String.format("%.2f",getIntRate());
	
}
}