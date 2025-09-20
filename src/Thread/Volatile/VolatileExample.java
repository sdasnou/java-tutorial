package Thread.Volatile;

import java.util.Date;

public class VolatileExample extends Thread {
    public VolatileExample(String name){
        super(name);
    }
     Integer data = 1;
    public void run(){
        synchronized(data){
            for(int i = 0; i <50; i++) {
                System.out.println(Thread.currentThread().getName() + "---->" + data + " " +new Date().getTime());
                data++;
            }
        }
        
    }
}
