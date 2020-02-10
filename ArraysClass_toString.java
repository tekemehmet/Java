package day024;

import java.util.Arrays;

public class ArraysClass_toString {

    public static void main(String[] args) {

        double[] num = {12.25,  55.45,36.59};
        String pricesString = Arrays.toString(num);
        System.out.println(pricesString);
        int lengthString = pricesString.length();

        for (int i = 0; i < lengthString ; i++) {
            char currentChar = pricesString.charAt(i);
            System.out.println("character at index " + i + " is ----> " + currentChar);

        }

    }
}
