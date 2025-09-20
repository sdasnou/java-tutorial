package Thread.Deadlock;

public class Thread1 extends Thread {
    volatile Resource first;
    Resource second;

    public Thread1(String name, Resource first, Resource second){
        super(name);
        this.first = first;
        this.second = second;
    }

    static void test(){

    }
    @Override
    public void run() {
        synchronized(first){ //lock (class level)
            System.out.println( Thread.currentThread().getName() + "  locked " +first);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            synchronized(second){
              System.out.println( Thread.currentThread().getName() + "  locked " +second);
            }
            
        }
    }

    // private synchronized String getData(){ //object level locking 

    //     return null;
    // }

    // Resource r1= new Resource("test");
    // r1.start()
    // Resource r2= new Resource("test");

    
}
