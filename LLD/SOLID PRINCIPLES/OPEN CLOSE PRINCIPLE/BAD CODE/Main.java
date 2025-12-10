// package LLD.SOLID_PRINCIPLES.OPEN_CLOSE_PRINCIPLE.BAD_CODE;

public class Main {
    public static void main(String[] args) {
        PaymentService ps = new PaymentService();
        ps.processPayment("CREDIT_CARD", 1000);
        ps.processPayment("BITCOIN", 500);
    }
}
