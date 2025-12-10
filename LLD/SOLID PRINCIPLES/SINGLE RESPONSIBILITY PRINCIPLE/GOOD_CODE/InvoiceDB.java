// package LLD.SOLID_PRINCIPLES.SINGLE_RESPONSIBILITY_PRINCIPLE.GOOD_CODE;

public class InvoiceDB {

    public void saveToDatabase(Invoice invoice) {
        System.out.println("Invoice of amount " + invoice.getAmount() + " saved to database.");
    }
}
