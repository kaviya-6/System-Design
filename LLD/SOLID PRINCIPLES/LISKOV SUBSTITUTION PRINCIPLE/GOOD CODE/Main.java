public class Main {
    public static void main(String[] args) {

        Bird b1 = new Sparrow();
        b1.eat();

        Flyable f1 = new Sparrow();
        f1.fly();

        Flyable f2 = new Duck();
        f2.fly();

        Bird b2 = new Ostrich();
        b2.eat();  // Correct, Ostrich can eat

        // No fly() called on Ostrich -> LSP satisfied
    }
}
