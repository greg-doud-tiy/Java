package ssa;

public class Animal {
	
	private int nbrLegs = 4;
	private int heightInInches = 12;
	
	public int getHeight() { 
		return (int) Math.round(this.heightInInches * 2.54); 
	}
	
	public void setHeightInInches(int height) {
		this.heightInInches = height;
	}
	public int getNbrLegs() { return nbrLegs+1; }
	public void setNbrLegs(int nbrLegs) { 
		this.nbrLegs = nbrLegs; 
	}

}
