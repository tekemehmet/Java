package day013;

public class TestStringStartWithOrEndWith {

    public static void main(String[] args) {

        String name = "Muge";

        System.out.println( name.startsWith("Mu") ) ; //true
        System.out.println(name.startsWith("mu"));  // false because case sensitive
        System.out.println(name.startsWith("Mac") ); //false
        System.out.println("********************************************************");
        System.out.println( name.endsWith("e") ); // true
        System.out.println( name.endsWith("A"));  // false
        System.out.println(name.endsWith("E"));  // false
    }
}
