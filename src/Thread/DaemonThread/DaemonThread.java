package Thread.DaemonThread;

public class DaemonThread extends Thread{
    
    @Override
    public void run(){
        //for (int i =0; i<5;i++){
        while(true){
            System.out.println("Daemon Thread ");
            try{
                Thread.sleep(500);
            } catch(Exception e){
                e.printStackTrace();
            }
        }
        
    }
}
