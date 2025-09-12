package Thread.Deadlock;

public class Deadlock {
    
    public static void main(String[] args) {
        Resource first = new Resource("first");
        Resource second = new Resource("second");
        Thread1 thread1= new Thread1("Thread1", first, second);
        Thread1 thread2= new Thread1("Thread2", second, first);
        thread1.start();
        thread2.start();
    }
}
