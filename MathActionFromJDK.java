package day034;

import java.util.Arrays;

public class MathActionFromJDK {

    public static void main(String[] args) {
        // where is String class coming from ?
        // it is coming from a package called java.lang
        // it is a special package
        // and any class in it, does not need importing when being used
        // for example String class

        // what if I really want to explicitly import String class
        // import java.lang.String
        String str = "Hello";
        java.lang.String str1 =  "Hello" ;

        // There is a class under java.lang called Math
        // and it has lots of math utility methods that ready to be used

        int sum = Math.addExact(5,20);
        System.out.println(sum);

        int max = Math.max(10,100);
        System.out.println(max);

        int top = Math.abs(-5);
        System.out.println(top);





    }
}
