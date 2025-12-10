// package LLD.SOLID_PRINCIPLES.OPEN_CLOSE_PRINCIPLE.GOOD_CODE;

public class Main {
    public static void main(String[] args) {

        Payment p1 = new UPI();
        p1.pay(1000);

        Payment p2 = new Debitcard();
        p2.pay(2000);

        Payment p3 = new Creditcard();
        p3.pay(3000);
    }
}
