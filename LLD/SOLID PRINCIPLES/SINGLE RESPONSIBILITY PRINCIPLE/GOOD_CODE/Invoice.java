// package LLD.SOLID_PRINCIPLES.SINGLE_RESPONSIBILITY_PRINCIPLE.GOOD_CODE;

public class Invoice {
    private double amount;

    public Invoice(double amt) {
        this.amount = amt;
    }

    public double getAmount() {
        return amount;
    }

    public void generateInvoice() {
        System.out.println("Invoice generated of amount " + amount);
    }
}
