// package LLD.SOLID_PRINCIPLES.OPEN_CLOSE_PRINCIPLE.GOOD_CODE;

public class UPI implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Processing UPI payment of amount: " + amount);
    }
}
