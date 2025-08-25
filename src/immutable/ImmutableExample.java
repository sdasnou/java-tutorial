package immutable;
public class ImmutableExample{

    public static void main(String[] args) {
        String str = "Kiran" ;
        System.out.println(System.identityHashCode(str));//
        str = str.concat("kumar");
        System.out.println(str);
        System.out.println(System.identityHashCode(str)); //
        StringBuilder str1 = new StringBuilder("Kiran") ;
        System.out.println("Str1 ---> " + System.identityHashCode(str1));//
        str1.append("kumar");
        System.out.println(str1);
        System.out.println("Str1 ---> " +System.identityHashCode(str1)); //
    }
}