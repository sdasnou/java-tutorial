package Polymorphism;

import java.io.FileNotFoundException;

public class Child1 extends ParentClass1{
  

    int a = 10;
    static void print(){
        System.out.println("child static ");
    }

    @Override
    Integer display() throws RuntimeException {
        return 0;
    }

    public static void main(String[] args) {
        Child1 obj = new Child1();  
        obj.print();
        System.out.println(obj.a);
        try {
            System.out.println(obj.display());
        } catch(Exception e){
            e.printStackTrace();
        }
        
        
    }
}
