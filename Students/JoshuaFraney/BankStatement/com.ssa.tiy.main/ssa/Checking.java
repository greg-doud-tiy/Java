package ssa;

public class Checking extends Account{

	private int lastCheckNbr;
	

	public Checking(){
		setType("C");
		lastCheckNbr++;
		}
	public  Checking(String description) {
		super(description);
		setType("C");
		lastCheckNbr++;
		}
	public Checking(int id, String description){
		super(id, description);
		setType("C");
		lastCheckNbr++;
		}
	public String print() {
		return getType() + " " + super.print() + df.format(getBalance()) + "  "+ getLastCheckNbr();
	}
	public int getLastCheckNbr() {
		return lastCheckNbr;
	}
	public void setLastCheckNbr(int lastCheckNbr) {
		this.lastCheckNbr = lastCheckNbr;
	}
	
		
	}
	

