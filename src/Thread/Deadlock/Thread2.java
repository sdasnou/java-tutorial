package Thread.Deadlock;

public class Thread2 extends Thread {
    Resource first;
    Resource second;

    public Thread2(String name, Resource first, Resource second){
        super(name);
        this.first = first;
        this.second = second;
    }

    @Override
    public void run() {
        synchronized(second){ //lock (class level)
            System.out.println( Thread.currentThread().getName() + "  locked " +second);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            synchronized(first){
              System.out.println( Thread.currentThread().getName() + "  locked " +first); 
            }
            
        }
        
    }

    // private synchronized String getData(){ //object level locking 

    // }
    
    
}
