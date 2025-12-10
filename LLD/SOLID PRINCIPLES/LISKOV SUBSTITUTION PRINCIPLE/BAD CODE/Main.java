public class Main {
    public static void main(String[] args) {

        Bird b1 = new Sparrow();
        b1.fly();
        b1.eat();

        Bird b2 = new Duck();
        b2.fly();

        Bird b3 = new Ostrich();  // LSP violation here
        b3.fly(); // Wrong behavior
    }
}
