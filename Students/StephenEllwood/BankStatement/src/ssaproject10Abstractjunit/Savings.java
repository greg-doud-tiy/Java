package ssaproject10Abstractjunit;

public class Savings extends Account {
    // lecture: the constuctor will always be default even if we call
    // super(paramter)
    // to get around this wee need to call super(parameter) to access
    // contstructor (param)???
    private double annrate;
    // static boolean isSav = true;
    double minBalforInterest;
    double accumInterest;

    public Savings() {// super gets called auto
        this.annrate = .015;
        this.minBalforInterest = 300.;
    }

    public Savings(String desc) {
        this();
        this.setDescription(desc);
    }

    public Savings(int accountId, String type) {
        super(accountId, type);
        // this();//constructor must be the first statement in a constructor"
        this.annrate = .015;
        this.minBalforInterest = 300.;
    }

    public Savings(double givenrate) {
        this();
        // super(type); // super(accountId,type);
        this.annrate = givenrate;
    }

    public Savings(String type, double grate) {
        this(grate);
        this.setDescription(type);
    }

    public double CalcDepositInterest(int months) {
        if (!isAboveMin(this.getBalance())) {
            System.out.println("Not enough Balance ($200) for interest accumulation \n");
            return 0;
        } else {
            double monrate = this.getAnnrate() / 12;
            double effectvrate2 = monrate * months;
            double interestowed = effectvrate2 * this.getBalance();
            deposit(interestowed);
            this.accumInterest += interestowed;
            return interestowed;
        }
    }

    public boolean isAboveMin(double amt) {
        return (amt > minBalforInterest);
    }

    public double getAccumInterest() {
        return accumInterest;
    }

    public double getMinBalforInterest() {
        return minBalforInterest;
    }

    public void setMinBalforInterest(double minBalforInterest) {
        this.minBalforInterest = minBalforInterest;
    }

    public String print1() {
        String s = "Savings "+super.print() + " after an interest payment of " + getAnnrate() * 100 + "% APR";
        System.out.print("  Total Savings account accumulated interest=" + getAccumInterest());
        return s;
    }
    public String print() {
        return String.format("Savg %-19s %10.2f ",super.print(), getAnnrate() * 100);
    }
    public double getAnnrate() {
        return annrate;
    }

    public void setAnnrate(double inputrate) {
        this.annrate = inputrate;
    }
}
