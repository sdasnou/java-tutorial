package OOPs.Polymorphism;

public class RunTimePoly extends Child {
    
    @Override
    void display() {
        System.out.println("RunTimePoly class display method");
    }
    public static void main(String[] args) {
        Child obj = new RunTimePoly();
        obj.display(); // Calls the display method of RunTimePoly class
    }
}
