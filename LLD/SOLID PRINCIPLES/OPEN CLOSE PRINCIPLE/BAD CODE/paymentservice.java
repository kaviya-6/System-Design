// package LLD.SOLID_PRINCIPLES.OPEN_CLOSE_PRINCIPLE.BAD_CODE;

public class PaymentService {

    public void processPayment(String type, double amount) {

        if (type.equals("CREDIT_CARD")) {
            System.out.println("Processing credit card payment of amount: " + amount);
        }
        else if (type.equals("PAYPAL")) {
            System.out.println("Processing PayPal payment of amount: " + amount);
        }
        else if (type.equals("BITCOIN")) {
            System.out.println("Processing Bitcoin payment of amount: " + amount);
        }
        else {
            System.out.println("Payment method not supported.");
        }
    }
}
