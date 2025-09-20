package Thread.Volatile;

public class VolatileTest {
    public static void main(String[] args) {
        VolatileExample obj1= new VolatileExample("Thread1");
        VolatileExample obj2 = new VolatileExample("Thread2");
        obj1.start();
        obj2.start();
    }
}
