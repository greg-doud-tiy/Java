package com.ssa.tiy.thebankaccount;

public class Checking extends Account {
	
	int chkNum;
	
	public Checking(int chkNum){
		super();
		this.chkNum = chkNum;
	}

	public int getChkNum() {
		return chkNum;
	}

	public void setChkNum(int chkNum) {
		this.chkNum = chkNum;
	}
	public String print(){
		String printFromAccount = super.print();
		return String.format("%s  %1d",printFromAccount, this.getChkNum());
	}
	
	
}
