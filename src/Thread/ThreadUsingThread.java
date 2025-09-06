package Thread;

public class ThreadUsingThread  extends Thread{
    @Override
    public void run(){
        System.out.println("run method");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("run method2");
    }

    public static void main(String[] args) {
        ThreadUsingThread obj = new ThreadUsingThread();
        obj.start(); // --> ready for execution ---> ask computer to get the CPU details () --> run()
    }
}
