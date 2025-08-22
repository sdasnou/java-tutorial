public class RunTimePolymorphism  extends Parent{
   
    @Override
    void deposit() {
        System.out.println("Runtime deposit");
    }
    
    public static void main(String[] args) {
        Parent p = new RunTimePolymorphism();
        p.deposit();
    }
}
