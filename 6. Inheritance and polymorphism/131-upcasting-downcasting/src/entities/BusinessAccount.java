package entities;

public class BusinessAccount extends Account {
    private double loanLimit;

    // super = uses the constructor of the superclass
    public BusinessAccount(int number, String holder, double balance, double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {
        if (amount <= loanLimit) {
            balance += amount;
        }
    }

}
