package Thread.ThreadPool.Callable;

import java.util.concurrent.Callable;

public class CallableExample implements Callable<String>{

    @Override
    public String call() throws Exception {
        if (Thread.currentThread().getName().equalsIgnoreCase("pool-1-thread-2")){
            Thread.sleep(10000);
        }
        
        return Thread.currentThread().getName();
    }
    
}
