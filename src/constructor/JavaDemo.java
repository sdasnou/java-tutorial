package constructor;

public class JavaDemo extends Father{

    int a;

    public JavaDemo( int a){
        //this.a = a;
        //super(10);
        super(10);
        System.out.println("JavaDemo");  
    }

 

    public JavaDemo(String str){
         super(10);
    }



    public static void main(String[] args) {

       JavaDemo obj2 = new JavaDemo();
       System.out.println(obj2.a);
    }

    public void setA(int a) {
        this.a = a;
    }
}
