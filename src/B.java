interface B {
  
    default void withdraw () {
        System.out.println("interface");
    }
    void deposit ();
    void interest();
}
