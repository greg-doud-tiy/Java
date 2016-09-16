package ssa;

public class Checking extends Account {

	private int lastCheckNbr;
	
	public Checking(){
		super();
		this.lastCheckNbr = 100;
	}
	
	public Checking(int actid, String desc){
		super(actid, desc);
		this.lastCheckNbr = 100;
	}
	
	public int getLastCheckNbr() {
		return lastCheckNbr;
	}

	public void setLastCheckNbr(int lastCheckNbr) {
		this.lastCheckNbr = lastCheckNbr;
	}

	public Checking( String desc){
		super(desc);
		this.lastCheckNbr = 100;
	}
	
	public boolean withdraw(double amt){
		this.lastCheckNbr++;
		return (super.withdraw(amt));
	}
	
	public String print(){
		return ("C" + super.print()+ "\t\t" + this.lastCheckNbr);
	}
}
