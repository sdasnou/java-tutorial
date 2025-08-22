package Polymorphism;

import javax.management.RuntimeErrorException;

public class ParentClass1 {
    
    static void print(){
        System.out.println("parent static ");
    }
    
    Object display() throws Exception{ //super type 
        throw new RuntimeException("its a parent exceprion");
       // return "parent";
    }
}
