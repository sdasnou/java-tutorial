package externalizable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\santo\\Videos\\Captures\\test.txt");
            ObjectInputStream obj = new ObjectInputStream(fis);
            Employee employee =  (Employee) obj.readObject();
            System.out.println(employee);
            obj.close();
        } catch(Exception e){
            e.printStackTrace();
        }
        
    }
}
