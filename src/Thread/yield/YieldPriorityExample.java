package Thread.yield;

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - iteration " + i);

            if (i == 3) {
                System.out.println(getName() + " yielding...");
                Thread.yield();
            }
        }
    }
}

public class YieldPriorityExample {
    public static void main(String[] args) {
        MyThread low = new MyThread("LowPriorityThread");
        MyThread normal = new MyThread("NormalPriorityThread");
        MyThread high = new MyThread("HighPriorityThread");

        low.setPriority(Thread.MIN_PRIORITY);   
        normal.setPriority(Thread.NORM_PRIORITY); 
        high.setPriority(Thread.MAX_PRIORITY);  

        low.start();
        normal.start();
        high.start();
    }
}
