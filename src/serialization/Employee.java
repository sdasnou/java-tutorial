package serialization;

import java.io.Serializable;

class Employee implements Serializable{

    private static final long serialVersionUID = 1l; 
    
    int id;
    String name;
    transient int salary;

    public Employee(int id, String name , int salary){
        this.id = id;
        this.name = name;
        this.salary= salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
}
