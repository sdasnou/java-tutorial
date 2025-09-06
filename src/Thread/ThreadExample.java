package Thread;

public class ThreadExample {
    
    public void run(){
        for (int i =0; i<50; i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } 
        }
    }

    public static void main(String[] args) {
        ThreadExample obj1 = new ThreadExample();
        obj1.run();
        //obj1.setName("thread1");
        
        ThreadExample obj2 = new ThreadExample();
        // obj2.setName("thread2");
        // obj1.setPriority(MAX_PRIORITY);
        // obj1.start();
        // obj2.start();

        
        // try {
           
        //     obj1.join(); // wait unit current threads is not finished 
                            //yield same priority thread can get a chance to excute
        //     obj2.start();
        
        // } catch (InterruptedException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }
    }
}
