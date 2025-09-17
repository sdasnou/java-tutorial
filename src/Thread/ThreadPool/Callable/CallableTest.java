package Thread.ThreadPool.Callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTest {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        Future[] results = new Future[2];
        for (int i =0; i <2 ;i++) {
            results[i] =service.submit(new CallableExample());
        }
        for (Future result : results){
            try {
                System.out.println("isdone ----> " +result.isDone());
                System.out.println(result.get());
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (ExecutionException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        service.shutdown();
    }
}
