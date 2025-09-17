package Thread.DaemonThread;

public class DaemonThreadExample {
    public static void main(String[] args) { //daemon //child 
        DaemonThread thread1 = new DaemonThread(); //child  //daemon 
        thread1.setDaemon(true);
        thread1.start();
        try {
           Thread.sleep(10000);
        } catch(Exception e){
            e.fillInStackTrace();
        }
        System.out.println("main closed");
    }
}
