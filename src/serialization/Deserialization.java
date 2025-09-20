package serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class Deserialization {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\santo\\Videos\\Captures\\test1.txt");
            ObjectInputStream obj = new ObjectInputStream(fis);
            List<Employee> employee =  (List) obj.readObject();
            System.out.println(employee);
            obj.close();
        } catch(Exception e){
            e.printStackTrace();
        }
        
    }
}
