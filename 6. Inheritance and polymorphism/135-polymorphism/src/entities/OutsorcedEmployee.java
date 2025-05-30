package entities;

public class OutsorcedEmployee extends Employee {
    private double additionalCharge;

    public OutsorcedEmployee(String name, int hours, double valuePerHour, double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment() {
        return super.payment() + additionalCharge * 1.1; // 10% additional charge
        // return valuePerHour * hours + additionalCharge * 1.1; 
    }
}
