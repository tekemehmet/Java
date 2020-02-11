package day025;

import java.util.Arrays;

public class StringToCharArray {

    public static void main(String[] args) {

        String myName = "mehmet teke";
        char[] myNameChar = new char[myName.length()];
        int counter = 0;
        for (int x = 0; x < myName.length(); x++) {

            myNameChar[x] = myName.charAt(x);
            counter++;
        }

        System.out.println("My name chars " + Arrays.toString(myNameChar));
        System.out.println("counter = " + counter);




        }
    }

