package ssaproject10Abstractjunit;

public class Mainlineold {
public static void main(String[] args) {
 // create checking1 - default constructor
    Account checking1 = new Checking();
//          checking1.id = 10;
//          checking1.balance = 1.00;
    int checking1Id = checking1.getId();
    checking1.setDescription("Checking 1");
    checking1.withdraw(100.00); // bal 0
    checking1.deposit(500.00); // bal 500
    checking1.deposit(200.00); // bal 700
    checking1.setDescription("Checking 1 Modified");
    checking1.deposit(200.00); // bal 900
    checking1.withdraw(600); // bal 300
    //checking1.deposit(1.03); // bal 1.00

    // create checking2 - description constructor

    // create savings3 - description constructor
    Savings savings1 = new Savings("Savings 1");
//          savings3.id = 20;
//          savings3.balance = 2.00;
    int savings1Id = savings1.getId();
    savings1.setDescription("savings 1");
    savings1.withdraw(100.00); // bal 0
    savings1.deposit(300.00); // bal 300
    savings1.deposit(200.00); // bal 500
    savings1.setDescription("Savings 1 Modified");
    savings1.deposit(100.00); // bal 600
    savings1.withdraw(100.00); // bal 500
    //savings1.deposit(3.01); // bal 3.01
    savings1.CalcDepositInterest(12);//507.5
    // total should be 807.5;
    System.out.printf("Total all accounts is %.2f\n", checking1.getBalance() + savings1.getBalance());

    System.out.println("Transfer amount all accounts ...");
    checking1.transferFrom(savings1, 1.01);
    
    savings1.transferFrom(checking1, 1.01);

    // total should be 807.5;
    System.out.printf("%n Total all accounts is %.2f\n", checking1.getBalance()  + savings1.getBalance());
}
}
