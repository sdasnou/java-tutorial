package Super;
public class Child extends Father {
    
    void print(){
        System.out.println("Child");
        super.display();
    }
     
    protected void finalize() throws Throwable {
         System.out.println("finalize");
    }

    public static void main(String[] args) {
        
        Child obj=   new Child();
        System.out.println(obj.a);
        obj.a = 20;
        System.out.println(obj.a);
        obj.print();
    }
}
