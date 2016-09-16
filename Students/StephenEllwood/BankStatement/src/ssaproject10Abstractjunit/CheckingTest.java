package ssaproject10Abstractjunit;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

//import ssaproject7INHERITANCE;




public class CheckingTest{
    Checking checking1= new Checking("ss");
    Savings sav1;// = new Savings(); 
    //checking1.balance = 800.00;
    @Before //this before doesn't seem to be visible by other methods
    public void setUp() throws Exception {
    
//    Checking checking1= new Checking("ssa");
//    Savings sav1= new Savings();  
    }
    @Test
    public final void testChecking() {
        //checking1 = new Checking("checking");//this will not be visible in any other method unless declare it up top
        String testDescription = "My Checking";
        checking1.setDescription(testDescription);
        assertEquals(testDescription, checking1.getDescription());
       // assertEquals(checking1.setDescription("My checking"), checking1.getDescription());
        
        checking1.setBalance(800.00);
        //assertEquals("simple", 900., checking1.setBalance(700.00),.01);
        assertEquals("simple", 900., checking1.deposit(100.),.01);
        assertEquals("start", 100,checking1.getLastCheckNo());
        assertNotEquals("neg dep rejected", 800., checking1.deposit(-100.),.01);
        checking1.withdraw(100.);///to 800  //this is  void
        System.out.println("withdraw 100");
        System.out.println("checking lastno is " + checking1.getLastCheckNo());
        assertEquals("wd calls setcheckno", 101, checking1.getLastCheckNo());//I can't do this in one line why not?
        assertEquals("actual wd should work", 800.,checking1.getBalance(),.01);
        
        checking1.withdraw(900.,checking1.getLastCheckNo());
        assertEquals("", 800.,checking1.getBalance(),.01);
        assertEquals("", 101, checking1.getLastCheckNo());
        System.out.println("Final Checking Balance is "+checking1.getBalance());
        //check the new random no check method
        checking1.withdraw(0,188);
        assertEquals("", 188, checking1.getLastCheckNo());
        checking1.setLastCheckNo(101);
    }
   
    @Test
    public void testSavings() {
        sav1 = new Savings(); //I put this here instead of top to set the isSav flag
        assertEquals( 400, (int)sav1.deposit(400));
       //assertEquals("simple", 400., sav1.getBalance(sav1.deposit(400.)),.01);
        assertEquals("simple", 800., sav1.setBalance(sav1.deposit(400.)),.01);
        System.out.println("checking lastno is " + checking1.getLastCheckNo());
        assertEquals("start", 100, checking1.getLastCheckNo());//we are no longer static so this resets
       
        assertEquals("neg dep rejected", 800., sav1.deposit(-200.),.01);
        System.out.println("NEGative entry bal " + sav1.getBalance());
        sav1.withdraw(300.);///to 800
       
        System.out.println("checking lastno is " + checking1.getLastCheckNo());
        assertEquals("check no should not change", 100, checking1.getLastCheckNo());
        assertEquals("actual wd should work", 500.,sav1.getBalance(),.01);
        
        sav1.withdraw(900.);//should fail
        System.out.println("checking lastno is " + checking1.getLastCheckNo());
        assertEquals("failed wd should not change balance", 500.,sav1.getBalance(),.01);
        assertEquals("flag should preven checkno from changing", 100, checking1.getLastCheckNo());
 /////Testing INterest here
        assertEquals("at 500 for savings now X.015",7.5,sav1.CalcDepositInterest(12),.005);
        assertEquals("calcdeposit deposits the int accrued", 507.5,sav1.getBalance(),.01);
        assertEquals("1month is .015/12 X507.5",0.63,sav1.CalcDepositInterest(1),.005);
        sav1.withdraw(310);//should fail if goes under $200
        assertEquals("at 199 for savings now X.015 but no int since bal too low",0,sav1.CalcDepositInterest(12),.005);
        System.out.println("Final Savings Balance is "+sav1.getBalance());
        //System.out.println("Final Checking Balance is "+checking1.getBalance());
        
    }
    @Test
    public void testTransfer() {
//        System.out.println("Final Savings Balance is "+sav1.getBalance()); //sav1 is null even though it is declared up top
        Savings sav1 = new Savings(); 
        sav1.deposit(400.);
        System.out.println("PRETX Checking Balance is "+checking1.getBalance());//00 means that balance of Checking has returned to 0
        checking1.deposit(800);
        sav1.transferFrom(checking1,100.);
        System.out.println("TX Savings Balance is "+sav1.getBalance());
        assertEquals("should work", 500., sav1.getBalance(),.01);
        sav1.transferFrom(checking1,900.);
        assertNotEquals("too big a transfer", 1500., sav1.getBalance(),.01);
        checking1.transferFrom(sav1, 200);
        assertEquals("shoudl work", 300., sav1.getBalance(),.01);
        assertEquals("shoudl work", 900., checking1.getBalance(),.01);
   }
   
}
