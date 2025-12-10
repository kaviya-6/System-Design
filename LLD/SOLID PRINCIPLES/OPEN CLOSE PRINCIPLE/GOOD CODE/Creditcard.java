// package LLD.SOLID_PRINCIPLES.OPEN_CLOSE_PRINCIPLE.GOOD_CODE;

public class Creditcard implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Processing Credit Card payment of amount: " + amount);
    }
}
