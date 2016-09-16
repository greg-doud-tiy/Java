package ssa;



				/***************************************************/
				/**********       TheBankStatement       ***********/
				/***************************************************/

public class Checking extends Account {
	
	
	

	private int lastCheckNbr = 100;
	public char checkCode;
	
	
	
	
	



	public Checking(){
		
		setAcctCode('c');
		
	}
	
	

	public double withdraw(double amt){
		
		
		lastCheckNbr++;
		return super.withdraw(amt);
		
	
	}


	public int getLastCheckNbr() {
		return lastCheckNbr;
	}

	public void setLastCheckNbr(int lastCheckNbr) {
		if(lastCheckNbr >= 100)
		this.lastCheckNbr = lastCheckNbr;
	}

	public String print(){ return super.print() + " \t " + getLastCheckNbr();}
	

}
