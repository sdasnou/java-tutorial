package OOPs.Polymorphism;

public class CompileTimePloy {

    int display(int a) {
        return a;
    }

    double display(double a) {
        return a;
    }

    String display(String a) {
        return a;
    }

    public static void main(String[] args) {
        CompileTimePloy obj = new CompileTimePloy();
        System.out.println("Integer: " + obj.display(5));
        System.out.println("Double: " + obj.display(5.5));
        System.out.println("String: " + obj.display("Hello"));
    }
    
}
