package AnnonymousBlock;

public class Annonymous {
    public static void main(String[] args) {
      //print(); //static method 
      new Annonymous(); //object create

    }
    public static void print(){
        System.out.println("static method");
    }
    static { //static block
        System.out.println("Static block");
    }
    { //annonymous block
        System.out.println("annonymous block");
    }
    public void display(){ //non static method
        System.out.println("non static  block");
    }
    public Annonymous(){
        System.out.println("constructor");
    }
}
