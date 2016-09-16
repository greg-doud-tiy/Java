package ssa;
import java.util.*;

public class InvestAcct extends Stock{
	
	 int id;
	 String name;
	 ArrayList<Stock> stocks = new ArrayList<>();
	 double cashBalance;
	 double stockValue;
	 
	 public void createInvestAct(int id, String name, double cash){
		 this.id = id;
		 this.name = name;
		 this.cashBalance = cash;
	 }
	 public boolean buyShares(String symb, String stkName, String date, double amt, double noOfStk){
		 if ((amt * noOfStk) > this.cashBalance){
			 
			 System.out.println(" cash bal and no of stk :"+ this.cashBalance + " " +  noOfStk);
			 System.out.println(" You dont have enough cash available");
			 return false;
		 }
		 else
		 {
//			 System.out.println(" cash bal before buy :"+this.cashBalance );
//			 System.out.println(" Amt to buy :"+ amt );
			 this.cashBalance  =  this.cashBalance - ( noOfStk * amt );
//			 System.out.println(" cash bal after buy :"+this.cashBalance );
			 return true;
		 }
	 }
	 public String print(String stk){
		
		 System.out.println("\nInvestment Acct  Name              Balance       Stock Value ");
		 System.out.println("===============  ==============    ========      ============");
		 System.out.println(this.id +"\t\t "+ this.name +"\t   "+ this.cashBalance + "  \t  "+ this.stockValue);
		 return "";
	 }
	 public String print(){
		
		 
		 System.out.println("\n\nSym     Name            Shares  Cost    Price   Value   Gain      Purchase Date       Sell Date ");
		 System.out.println( "===     ====            ======  ====    =====   =====   ====      =============      ============");
		 this.stockValue = 0 ;
		 
		 for ( Stock s1: stocks){
		 this.stockValue += (s1.currentPrice * s1.noOfShares );
		 System.out.println(s1.print());
		 }
		 
		 System.out.println("\nInvestment Acct  Name              Balance       Stock Value ");
		 System.out.println("===============  ==============    ========      ============");
		 System.out.println(this.id +"\t\t "+ this.name +"\t   "+ this.cashBalance + "  \t  "+ this.stockValue);
		 return "";
	 }
	 
	 public static void main(String[] args){
		 
		 InvestAcct invest = new InvestAcct();
		 
		 invest.createInvestAct(100, "Peter Smith", 10000.00);
		 invest.print("Initial Print ");
		 
		 if(invest.buyShares("PG", "Proctor Gamble", "2016-01-01", 200.00, 10)){
			 Stock s1 = new Stock("PG", "Proctor Gamble", "2016-01-01", 200.00, 10);
			 invest.stocks.add(s1);
		 }
		 if(invest.buyShares("APPL", "Apple Computers", "2016-02-01", 300.00, 10)){
			 Stock s2 = new Stock("APPL", "Apple Computers", "2016-02-01", 300.00, 10);
			 invest.stocks.add(s2);
		 }
		 if(invest.buyShares("MSOFT", "Microsoft LTD", "2016-03-01", 250.00, 10)){
			 Stock s2 = new Stock("MSOFT", "Microsoft LTD", "2016-03-01", 250.00, 10);
			 invest.stocks.add(s2);
		 }
		
		 invest.print();
		 
		 for ( Stock s1: invest.stocks){
			 if ( s1.getSymbol() == "MSOFT")
				 s1.splitStock();
			 if ( s1.getSymbol() == "PG")
				invest.cashBalance += s1.sellStock("PG", "2016-09-30", 5);
			 if ( s1.getSymbol() == "APPL")
				 s1.setCurrentPrice(400.00);
		 }
		 invest.print();
		 
		 if(invest.buyShares("APPL", "Apple Computers", "2016-06-01", 400.00, 8)){
			 Stock s2 = new Stock("APPL", "Apple Computers", "2016-06-01", 400.00, 8,2);
			 invest.stocks.add(s2);
		 }
		 
		 invest.print();
		 
		 for ( Stock s1: invest.stocks){
			 	
			 if ( s1.getSymbol() == "APPL" && s1.lot == 2)
				 invest.cashBalance += s1.sellStock("APPL", "2016-09-01", 5);
		 }
		 invest.print();
		 
		 
	 InvestAcct invest2 = new InvestAcct();
		  
		 invest2.createInvestAct(200, "John Smith", 15000.00);
		 invest2.print("Initial Print ");
		 
		 if(invest2.buyShares("PG", "Proctor Gamble", "2016-01-01", 200.00, 10)){
			 Stock s1 = new Stock("PG", "Proctor Gamble", "2016-01-01", 200.00, 10);
			 invest2.stocks.add(s1);
		 }
		 if(invest2.buyShares("APPL", "Apple Computers", "2016-02-01", 300.00, 10)){
			 Stock s2 = new Stock("APPL", "Apple Computers", "2016-02-01", 300.00, 10);
			 invest2.stocks.add(s2);
		 }
		 if(invest2.buyShares("MSOFT", "Microsoft LTD", "2016-03-01", 250.00, 10)){
			 Stock s2 = new Stock("MSOFT", "Microsoft LTD", "2016-03-01", 250.00, 10);
			 invest2.stocks.add(s2);
		 }
		
		 invest2.print();
		 
		 
	 }

}
