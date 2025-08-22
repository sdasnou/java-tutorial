package Accessmodifier.test;

import Inheritance.Parent;

public class Child{
    public static void main(String[] args) {
        
        //Child ch = new Child();
        Parent ch = new Parent();
        System.out.println(ch.a); //public 
        //System.out.println(ch.b); // not accessible bcz private 
        System.out.println(ch.c); // protected
        System.out.println(ch.d); //default
        ch.display();
        //ch.display1(); //not accessible
        ch.display2(); //protected
        ch.display3(); //default
    }
}
