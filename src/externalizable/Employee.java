package externalizable;

import java.io.Externalizable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Employee implements Externalizable{

    private static final long serialVersionUID = 25l; 
    
    int id;
    String name;
    int salary;

    public Employee() {

    }
    public Employee(int id, String name , int salary){
        this.id = id;
        this.name = name;
        this.salary= salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(id);
        out.writeUTF(name + " Cuttack");
        out.writeInt(salary);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        id = in.readInt();
        //name = in.readUTF();
        name ="cuttack";
        salary = in.readInt();
    }
}
