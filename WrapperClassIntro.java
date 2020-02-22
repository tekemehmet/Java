package day035;

public class WrapperClassIntro {

    public static void main(String[] args) {

        int x = 10;
        // primitive data types are pure value has no attribute or behaviour
        // each primitive type has wrapper class that turn it into object so we can treat it

        // this is the old not recommend way to create Integer Object
        Integer xObj1 = new Integer(12);

        // valueOf method of Integer class
        //return a integer object by wrapping up the value you passed
        // it has 2 overload version one that accept int , another accept String
        Integer x2 = Integer.valueOf(10);
        Integer x3 = Integer.valueOf("10");

        // since x2 is pointing to Integer Object
        // we can all the methods of Integer class using this Object
        byte bValue = x2.byteValue();
        System.out.println("bValue = " + bValue);

        double dValue = x2.doubleValue();
        System.out.println("double Value = " + dValue);

        Integer nums = 10;
        System.out.println("nums = " + nums);

    }
}
