import java.util.ArrayList;

public class App {
    static int a; // static  
    int b; // non static b= 9
    String str= "Das";
    
    public static void main(String[] args) throws Exception {
        int d= 0; // local var
        System.out.println("local variable " + d);
        System.out.println("before assignment static variable  " + a);
        App.a = 10;
        System.out.println("after assignment static variable  " + a);
        App app = new App(); 
        System.out.println("before assignment non static variable " + app.b);
        app.b= 40;
        System.out.println("after assignment non static variable  " + app.b);  
        System.out.println("before assignment non static variable Str " + app.str);
    }

}


