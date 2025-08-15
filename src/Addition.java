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


public class Addition {
    public static void main(String[] args) throws RuntimeException{
      Map<String, Integer> map = new ConcurrentHashMap<>();
      
        Runnable data = () -> {
            for (int i =0; i< 1000; i++){
                map.put("key" +i, i);
            }
        };
        Thread t1 = new Thread(data); 
        Thread t2 = new Thread(data); 
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(map.size());

    } 

    //concurrency issue in hashmap     
}


            
