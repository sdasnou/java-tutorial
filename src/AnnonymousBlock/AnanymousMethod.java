package AnnonymousBlock;

public class AnanymousMethod {
    public static void main(String[] args) {
       Thread t1 = new Thread(() -> {
           System.out.println("Ananymous method");
        });
        t1.start(); 
    }
}
