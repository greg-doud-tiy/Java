package ssa;

public class Checking extends Account{

	



	static int chkNbr =1;

	
	
	
	
	public Checking() {
		super();
//		this.chkNbr = chkNbr;
		chkNbr += 10;

		
	}
	
	
	public static int getChkNbr() {
		return chkNbr;
	}




	public static void setChkNbr(int chkNbr) {
		Checking.chkNbr = chkNbr;
	}

	// Print Method
			public String print() {
		    	 String str = super.print();
		    	 str += String.format("  ", this.getChkNbr());
		    	 return str;
			}
	
}
