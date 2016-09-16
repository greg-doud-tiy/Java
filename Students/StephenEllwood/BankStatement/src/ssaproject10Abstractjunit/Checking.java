package ssaproject10Abstractjunit;

public class Checking extends Account{
    private int lastCheckNo=100;
   // public static boolean nonconsecChkr = false;
    public Checking(){//I had to do this bc once define one constructor the default is overiden
        super();
    }
    public Checking(String desc){
        this();
    }
    public Checking(int accountId,String desc){
        super(accountId,desc);  
//        this(desc);
//        this.setId(accountId);
    }
    public double withdraw(double wd){
//      if(Checking.lastCheckNo!=checkno)       Checking.setLastCheckNo(checkno);
        this.setLastCheckNo();
        return super.withdraw(wd);}
    public double withdraw(double wd, int checkno){
        this.setLastCheckNo(checkno);

        return super.withdraw(wd);}
    public int getLastCheckNo() {
        return lastCheckNo;
    }
    public int setLastCheckNo() {
        return lastCheckNo++;
        //Checking.lastCheckNo = lastCheckNo;
    }
    public int setLastCheckNo(int checkno) {
        return lastCheckNo=checkno;
        //Checking.lastCheckNo = lastCheckNo;
    }
    public String print1() {
        return String.format("Checking %45s Last check:%d",super.print(), getLastCheckNo());}
    public String print() {
        return String.format("Chkg %-24s %-3d ",super.print(), getLastCheckNo());}
}
//if((Savings.isSav==false)&&(Checking.lastCheckNo!=checkno))       Checking.setLastCheckNo(checkno);
////else if (Savings.isSav==false)  Checking.setLastCheckNo();