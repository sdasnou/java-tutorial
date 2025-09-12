package Thread.Deadlock;

public class Resource {
    String name1;

    public Resource(String name){
        this.name1 = name;
    }

    @Override
    public String toString() {
        return name1;
    }

}
