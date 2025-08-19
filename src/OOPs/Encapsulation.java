package OOPs;
public class Encapsulation {
    private int value = 0;
    int intValue = 0; // package-private access

    public Encapsulation(int initialValue) {
        this.value = initialValue;
        this.intValue = initialValue; // package-private access
    }
    public void increment() {
        value++;
    }
    public void decrement() {
        value--;
    }

    public void reset() {
        value = intValue;
    }

    public int getValue() {
        return value;
    }
}
