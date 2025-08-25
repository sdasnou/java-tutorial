package immutable;

public class ImmetableTest {
    public static void main(String[] args) {
        Immutable test = new Immutable(10);
        System.out.println(test.getValue());
        System.out.println(test);
        test = new Immutable(10);
        System.out.println(test);
    }
}
