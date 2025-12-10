// package LLD.SOLID_PRINCIPLES.OPEN_CLOSE_PRINCIPLE.GOOD_CODE;

public class Debitcard implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Processing Debit Card payment of amount: " + amount);
    }
}
