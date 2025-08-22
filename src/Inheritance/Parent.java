package Inheritance; //folder


public class Parent {
    public int a =10;
    private int b = 20;
    protected int c = 30;
    int d = 40;

    public void display (){
        System.out.println("public");
    }
    private String display1(){
        System.out.println("private");
        return "test";
    }

    protected void display2 (){
        System.out.println("protected");
    }
    void display3 (){
        System.out.println("default");
    }
}
