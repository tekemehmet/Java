package day036;

import jdk.swing.interop.SwingInterOpUtils;

public class MethodWithParameter {

    public static void main(String[] args) {

        int num = 25;
        addOneHundred(num);//125
        addOneHundred(25); // 125
        addOneHundred(new Integer(25)); //125
    }

    public static void addOneHundred( int x ){

        System.out.println( x + 100 );
    }
}
