public class CompileTImePolymorphism {
    int balance = 0;
    
    // int deposit (int amount){
    //     balance = balance + amount;
    //     return balance;
    // }

    String  deposit (String name){ //String 
        return "String";
    }

    Object deposit (Object name){
        return "Object";
    }

    Object deposit (Integer name){
        return "Integer";
    }

   
    int deposit (int account, int rateOfInterest, int time ){
        balance = balance + (balance * time * rateOfInterest /100);
        return balance;
    }

    int deposit (int account, int year, int rateOfInterest , int tenure ){
        balance = balance + balance* (1+ year * rateOfInterest ) * (tenure/12);
        return balance;
    }

    //Compile time polymorphism (or) overloading

    public static void main(String[] args) {
        Integer obj1 = null;
        CompileTImePolymorphism obj = new CompileTImePolymorphism();
        obj.deposit(100);
        System.out.println("after deposit  " + obj.balance);
        obj.deposit(100, 8, 12);
        System.out.println("after deposit  " + obj.balance);
        obj.deposit(1021, 1, 7, 24);
        System.out.println("after deposit  " + obj.balance);
        obj.deposit("100");
        System.out.println("Object / String " + obj.deposit('c')); //Integer
        System.out.println("Object / String " + obj.deposit("c"));//integer
        System.out.println("Object / String " + obj.deposit(new Integer(1)));//integer
    }
    

}
