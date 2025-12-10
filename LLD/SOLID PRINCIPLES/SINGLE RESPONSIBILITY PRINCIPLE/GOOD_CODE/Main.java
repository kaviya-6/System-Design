// package LLD.SOLID_PRINCIPLES.SINGLE_RESPONSIBILITY_PRINCIPLE.GOOD_CODE;

public class Main {
    public static void main(String[] args) {

        Invoice inv = new Invoice(22.90);
        inv.generateInvoice();

        InvoiceDB invDB = new InvoiceDB();
        invDB.saveToDatabase(inv);

        EmailService email = new EmailService();
        email.sendEmailNotification(inv);
    }
}
