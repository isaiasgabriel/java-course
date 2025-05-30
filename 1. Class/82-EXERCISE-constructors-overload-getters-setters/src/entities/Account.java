package entities;

public class Account {
    private int number;
    private String name;
    private double balance;

    public Account(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public Account(int number, String name, double initialDeposit) {
        this.number = number;
        this.name = name;
        deposit(initialDeposit);
    }

    public int getNumber() {
        return this.number;
    }

    public String getName() {
        return this.name;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double value) {
        if (value > 0) {
            balance += value;
        } else {
            System.out.println("Value must be greater than 0.");
        }
    }

    public void withdraw(double value) {
        balance -= Math.abs(value) + 5;
    }

    public String toString() {
        return "Account: "
                + number
                + ", Holder: " + name
                + ", Balance: $" + String.format("%.2f", balance);
    }

}
