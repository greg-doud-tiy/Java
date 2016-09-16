package ssa;

public class Stock {

	String stockSymbol;
	String stockName;
	String purchaseDate;
	String sellDate;
	double purchaseAmount;
	double noOfShares;
	double currentPrice;
	int lot=0;
	
	public Stock(){
		
	}
	
	public Stock(String stkSym, String stkName, String purchDate, double purchAmt, double noOfshr, int lotNo){
		setLotNo(lotNo);
		setSymbol(stkSym);
		setName(stkName);
		setPurchaseDate(purchDate);
		setSellDate("");
		setPurchaseAmount(purchAmt);
		setNoOfShares(noOfshr);
		setCurrentPrice(purchAmt);
	}
	
	public Stock(String stkSym, String stkName, String purchDate, double purchAmt, double noOfshr){
		lot++;
		setSymbol(stkSym);
		setName(stkName);
		setPurchaseDate(purchDate);
		setSellDate("");
		setPurchaseAmount(purchAmt);
		setNoOfShares(noOfshr);
		setCurrentPrice(purchAmt);
	}
	
	public double sellStock(String stkSym,String sellDt, double qty){
		double balance = 0.0;
		if (this.noOfShares >= qty ){
			this.noOfShares -= qty;
			this.sellDate = sellDt;
			balance = qty * this.currentPrice;
		}
		else System.out.println("Enter valid quantity of stocks to sell , no of shares in your act : "+ this.noOfShares);
		
		return balance;
		
	}
	
	public void splitStock(){
		System.out.printf("\n Before Split: %.2f  shares of %s  at %.2f/Share ",this.noOfShares,this.stockSymbol,this.currentPrice);
		this.noOfShares = this.noOfShares * 2 ;
		this.currentPrice = this.currentPrice / 2 ;
		this.purchaseAmount = this.currentPrice;
		System.out.printf("\n After  Split: %.2f  shares of %s  at %.2f/Share ",this.noOfShares,this.stockSymbol,this.currentPrice);
	}
	
	public String print(){
		double value = this.noOfShares * this.currentPrice ;
		double gain = value - (this.noOfShares * this.purchaseAmount) ;
		String out;
		out = this.stockSymbol + "\t" + this.stockName + "\t" + this.noOfShares ;
		out +=  "\t" + this.purchaseAmount + "\t" + this.currentPrice + "\t" + value + "\t" + gain ;
		out += "\t  " + this.purchaseDate + "\t     " + this.sellDate;
		return out;
	}
	public void setLotNo(int lotNo) {
		lot  = lotNo;
	}
	public String getSymbol() {
		return stockSymbol;
	}
	public void setSymbol(String symbol) {
		stockSymbol = symbol;
	}
	public String getName() {
		return stockName;
	}
	public void setName(String name) {
		stockName = name;
	}
	public String getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public String getSellDate() {
		return sellDate;
	}
	public void setSellDate(String sellDate) {
		this.sellDate = sellDate;
	}
	public double getPurchaseAmount() {
		return purchaseAmount;
	}
	public void setPurchaseAmount(double purchaseAmount) {
		this.purchaseAmount = purchaseAmount;
	}
	public double getNoOfShares() {
		return noOfShares;
	}
	public void setNoOfShares(double noOfShares) {
		this.noOfShares = noOfShares;
	}
	public double getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
	
	
	
	
}
