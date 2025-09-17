package Thread;

public class ThreadExample extends Thread{
    
    public void run(){
        for (int i =0; i<50; i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) { //daemon (backgound thread)
        ThreadExample obj1 = new ThreadExample(); //child thread
        obj1.setName("thread1");
        
        
        ThreadExample obj2 = new ThreadExample();
        obj2.setName("thread2");
         obj1.start();
         try {
            obj1.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
         obj2.start();
    }
}
