package day029;

import java.util.Arrays;

public class FillingUpArrayValue {

    public static void main(String[] args) {

        // create an int array with size 100 and fill it up as below
        //      [1,2,3,4,5,..................98,99,100]

        int[] numbers = new int[100];

//        numbers[0] = 1;
//        numbers[1] = 2;
//        numbers[2] = 3;
        //..............
        //numbers[99]= 100;

        for (int x = 0; x < numbers.length ; x++) {
            numbers[x] = x+1;

        }

        System.out.println(Arrays.toString(numbers));







    }
}
