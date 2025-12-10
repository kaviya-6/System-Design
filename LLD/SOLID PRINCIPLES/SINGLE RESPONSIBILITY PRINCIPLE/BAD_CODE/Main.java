// package LLD.SOLID_PRINCIPLES.SINGLE_RESPONSIBILITY_PRINCIPLE.BAD_CODE;

public class Main {
    public static void main(String[] args) {

        Invoice inv = new Invoice(22.10);
        inv.generateInvoice();
        inv.saveToDatabase();
        inv.emailNotification();
    }
}
