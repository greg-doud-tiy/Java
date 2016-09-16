package ssaproject10Abstractjunit;

import java.io.PrintStream;

public abstract class Account {
    private int id;
    private double balance;//I can't call this in junit if this isn't package level
    private static int transId = 0;//set at 0 because it increments by the time we print out
    private String desc;
    private boolean isTransfer = false;
//Account type not needed
    public Account(){
        this.balance = 0.;
        int idOne= (int) (Math.random()*1000)+1;
        this.id= idOne; 
        this.desc= "Account type: ";}
    public Account(String description){
        this();         this.desc = description;}
    public Account(int accountId,String desc){
        this("");this.id= accountId;}
    boolean canWithdraw(double wd){
        if (this.balance >=wd && wd>0) return true;
        else return false;}
    public double withdraw(double wd){
        if(canWithdraw(wd)&&(!getIsTransfer())){
            double x = this.getBalance() - wd;//setbalance
            this.setBalance(x);
            Account.transId++;
//            if((Savings.isSav==false)&&(Checking.lastCheckNo!=checkno))       Checking.setLastCheckNo(checkno);
//            else if (Savings.isSav==false)  Checking.setLastCheckNo();
            System.out.println("\nTransaction#"+ Account.transId+" for w/d of $"+ wd);
            return this.getBalance();
        }
        else if(canWithdraw(wd)&&(getIsTransfer())){
            this.setBalance(this.getBalance() - wd);// = balance - wd;//setbalance
            Account.transId++;
            setIsTransfer(false);
            System.out.println("\n Withdrawal of $"+ wd);
            return this.getBalance();
            }
        else {
        System.out.println("\nThe withdrawal amount "+wd+" exceeds your current balance of "+this.getBalance()+". Transaction cancelled.");
        return this.getBalance();
        }
    }//System.out.printf("The original balance is $%.2f.%n", cardBalance);
//    public void balance(double bal){
//        setBalance(bal);
//    }
    public double deposit (double dep){
        if (dep<0) {System.out.println("Invalid deposit amount"); return this.getBalance();}
        else{
        setBalance(this.getBalance()+dep);
        Account.transId++;
        float dep2 = (float) dep;//just to test the printfmethod since it won't do %.2d
        System.out.printf("\nTransaction #%d for deposit of $%.2f %n",Account.transId,dep2);
        return this.getBalance();}
        }
    public void transferFrom(Account loseaccount, double amount){//transferring from account to this
        setIsTransfer(true);
        if(canWithdraw(amount)){
            loseaccount.withdraw(amount);
            setBalance(this.balance+amount);//this avoids duplicate increment of trnsId
            System.out.print("Transfer just occurred of $"+amount+ " from act "+loseaccount.getDescription()+" to act "+this.getDescription()+"\n");
        }}
    
    public PrintStream printst(){
//        NumberFormat formatter = NumberFormat.getCurrencyInstance();
//        String moneyString = formatter.format(balance);
//        return "Account "+accountId+"'s balance is :"+moneyString;
        return System.out.printf("^^Account %d's balance is $%.2f ",this.getId(), this.getBalance());
        //if do sysout it is technically a "printstream")
    }
    public String print1(){
      return String.format("%n**Account %d's balance is $%.2f ", this.getId(), this.getBalance());}
    public String print(){
        return String.format("%3d %-15s $%.2f ", this.getId(), this.getDescription(),this.getBalance());}
    public String transaction(){
        return "Transaction # "+ Account.transId;
    }
//    public String toString2() {
//        return ( desc + " Account");
//    }
    public boolean getIsTransfer(){
        return this.isTransfer;}
    public boolean setIsTransfer(boolean flag){
        return flag;} 
    public String getDescription() {
        return desc;}
    public void setDescription(String desc) {
        this.desc = desc;}

    public int getId() {
        return id;
    }
    private void setId(int id) {
        this.id = id;
    }
    public double getBalance() {
        return balance;
    }
    public double setBalance(double balance) {// return type facilitates junittesting
        this.balance = balance;
        return this.balance;
    }
    
}
