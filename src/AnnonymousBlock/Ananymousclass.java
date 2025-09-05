package AnnonymousBlock;

public class Ananymousclass {
   
    public static void main(String[] args) {
       Thread t1 = new Thread(new Runnable() {
            @Override
            public void run(){
             System.out.println("Ananymous class");
            }
           
        });
        t1.start(); 
    }
    
}
