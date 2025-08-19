package OOPs;
public class Calling {
    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation(5);
        encapsulation.increment();
        encapsulation.decrement();
        encapsulation.reset();
        System.out.println("Current value: " + encapsulation.getValue());
    }
}
