package immutable;

public class GerbageCollectorExample {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("gc called"); //excute 3 
    }
    
    public static void main(String[] args) {
        GerbageCollectorExample obj = new GerbageCollectorExample();
        System.out.println(obj); //excute 1
        obj = null;
        //System.gc();// request 
        Runtime obj1 = Runtime.getRuntime();
        obj1.gc();// request 
        System.out.println(obj); // excute 2
    }
}
