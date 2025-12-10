// package LLD.SOLID_PRINCIPLES.SINGLE_RESPONSIBILITY_PRINCIPLE.BAD_CODE;

public class Invoice {

    private double amount;

    public Invoice(double amt) {
        this.amount = amt;
    }

    public void generateInvoice() {
        System.out.println("Invoice generated of amount " + amount);
    }

    public void saveToDatabase() {
        System.out.println("Invoice saved to database.");
    }

    public void emailNotification() {
        System.out.println("Email sent.");
    }
}
