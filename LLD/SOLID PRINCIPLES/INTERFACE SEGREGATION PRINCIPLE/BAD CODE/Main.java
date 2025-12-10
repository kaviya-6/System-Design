public class Main {
    public static void main(String[] args) {
        Bird b = new Ostrich();  // LSP Broken!
        b.fly();                 // Throws exception
    }
}
