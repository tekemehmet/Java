package day029;

import java.util.Arrays;

public class FillingUpArrayValue_EvenNumbers {

    public static void main(String[] args) {

        // create an int array with size 100 and fill it up as below
        //      [0,2,4,6,..................98,100]

        //  this is what we would do without the loop
//        numbers[0] = 0 ;   // 0 * 2
//        numbers[1] = 2 ;   // 1 * 2
//        numbers[2] = 4 ;   // 2 * 2
//        numbers[3] = 6 ;   // 3 * 2
//        numbers[4] = 8 ;   // 4 * 2
//        numbers[5] = 10 ;  // 5 * 2
//        //.....
//        numbers[99] = 198 ; // 99 * 2


        int[] numbers = new int[100];

        for (int x = 0; x < numbers.length ; x++) {

                numbers[x] = x*2;
        }

        System.out.println(Arrays.toString(numbers));



    }
}
