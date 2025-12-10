public class Ostrich extends Bird {
    @Override
    public void fly() {
        // WRONG: Ostrich cannot fly
        throw new UnsupportedOperationException("Ostrich cannot fly!");
    }
}
