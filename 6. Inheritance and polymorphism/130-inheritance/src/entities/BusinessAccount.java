package entities;

public class BusinessAccount extends Account {

    private double loanLimit;

    BusinessAccount(String name, int id, double balance) {
        super(name, id, balance);
        this.loanLimit = 0.0; // Default credit limit
    }

    public double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {
        if (amount <= loanLimit) {
            balance += amount;
        }
    }

}
