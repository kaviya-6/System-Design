public class Main {
    public static void main(String[] args) {

        Flyable f1 = new Sparrow();
        f1.fly();

        Flyable f2 = new Duck();
        f2.fly();

        Bird o = new Ostrich();
        o.eat();     // Works perfectly → LSP followed
    }
}
