package externalizable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationTest {
    public static void main(String[] args) {
        Employee obj = new Employee(10, "pratus", 10000);
        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\santo\\Videos\\Captures\\test.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos);
            objectOutputStream.writeObject(obj);
            objectOutputStream.close();

            System.out.println("test2");


            while(true) {

            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
