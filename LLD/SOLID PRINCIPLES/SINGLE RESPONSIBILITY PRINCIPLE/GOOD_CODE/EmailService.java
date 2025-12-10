// package LLD.SOLID_PRINCIPLES.SINGLE_RESPONSIBILITY_PRINCIPLE.GOOD_CODE;

public class EmailService {

    public void sendEmailNotification(Invoice invoice) {
        System.out.println("Email notification sent for invoice of amount " + invoice.getAmount());
    }
}
