package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationTest {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        Employee obj = new Employee(10, "kiran", 10000);
        Employee obj1 = new Employee(11, "subrat", 5000);
        Employee obj2 = new Employee(12, "pratyus", 2009);
        empList.add(obj);
        empList.add(obj1);
        empList.add(obj2);
        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\santo\\Videos\\Captures\\test1.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos);
            objectOutputStream.writeObject(empList);
            objectOutputStream.close();

            System.out.println("test");
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
