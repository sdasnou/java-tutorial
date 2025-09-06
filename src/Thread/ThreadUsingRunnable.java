package Thread;

public class ThreadUsingRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("run method");
        try {
            Thread.sleep(10000);
            throw new InterruptedException();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("run method2");
    }
    
    public static void main(String[] args) {
        ThreadUsingRunnable obj = new ThreadUsingRunnable();
        Thread thread = new Thread(obj);
        thread.start();
    }
}
