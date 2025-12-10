public class Duck extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Duck flies");
    }
}
