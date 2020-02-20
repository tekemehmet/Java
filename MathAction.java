package day034;

import day031.Calculator_v2;

import java.util.Arrays;

public class MathAction {

    // calling the static methods of other classes

    public static void main(String[] args) {

        // call your build3DigitNumbers method here
        // "build3DigitNumber" is under day34 package
        // and inside "WarmUp_Method_3digit" class
        int result1 = WarmUp_Method_3digit.build3DigitNumber(6,4,0);
        System.out.println("result1 = " + result1);

        // in order to use Arrays class that coming from java.util package
        // first we need to import them  import java.util.Arrays;
        // in order to call static method of Arrays class,
        // we need to use classname.methodname(...);

        int[] nums = {2,5,87};
        System.out.println(Arrays.toString(nums));

        // How can I call static method called calculate in "Calculator_v2" under day 31 package
        // first of all, it is not under current package day34
        // so we need to import the class---> import day31.Calculator_v2
        // in order to call static method of Calculator_v2 class,
        // Calculator_v2.yourStaticMethodName(...)

        Calculator_v2.calculator(5,6,'-');

    }
}
