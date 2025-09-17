package Thread.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(5);
        for(int i =0; i<50; i++) {
            Task obj = new Task();
            service.submit(obj);
        }
        service.shutdown();
    }
}
