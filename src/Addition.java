// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Collection;
// import java.util.Collections;
// import java.util.Comparator;
// import java.util.HashSet;
// import java.util.Iterator;
// import java.util.LinkedHashSet;
// import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;


class Addition  extends Abstractclass{ //parent class (Grandpa's son)
    private  int a = 20;

    private int addition(int a , int b) {
        return a+b;
    }

    public int subtracts(int a , int b) {
        return a-b;
    }

    // public String getName(){
    //     return "Addition";
    // }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public static void main(String[] args) {
       Addition obj = new Addition();
    }

    //concurrency issue in hashmap     
}

            
