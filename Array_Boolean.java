package day022;

public class Array_Boolean {

    public static void main(String[] args) {

        boolean [] trueFalse = new boolean[3];
        System.out.println(trueFalse[0]);
        System.out.println(trueFalse[1]);
        System.out.println(trueFalse[2]);

        trueFalse[0] = true;
        trueFalse[1] = false;
        trueFalse[2] = 10>11; //false

        System.out.println(trueFalse[0]);
        System.out.println(trueFalse[1]);
        System.out.println(trueFalse[2]);


    }
}
