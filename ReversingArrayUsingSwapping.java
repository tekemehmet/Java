package day026;

import java.util.Arrays;

public class ReversingArrayUsingSwapping {

    public static void main(String[] args) {
                        //index :    0   1   2    3   4    5    6
        int[] myNumbers = new int[]{ 5 , 3 , 21 , 2 , 1 ,  13  };

       int size = myNumbers.length;
       int lastIndex = size-1;
       int middleIndex = size/2;

        System.out.println(Arrays.toString(myNumbers) ) ;

        // first and last
        System.out.println( myNumbers[0] + "----" + myNumbers[lastIndex - 0 ] ) ;
        // second and one before last
        System.out.println(  myNumbers[1] + "----" + myNumbers[lastIndex-1] );
        //third and two before last
        System.out.println(  myNumbers[2] + "----" + myNumbers[lastIndex-2] );

        //----------------------For Loop-----------------------------------

        for (int x = 0; x < middleIndex; x++) {

            System.out.println( "Before Swap " + myNumbers[x] + "----" + myNumbers[lastIndex - x ] ) ;

            int temp = myNumbers[x];

            myNumbers[x] = myNumbers[lastIndex-x];
            myNumbers[lastIndex-x] = temp;
            System.out.println( "After Swap " + myNumbers[x] + "----" + myNumbers[lastIndex - x ] ) ;

        }
        System.out.println("After swap : " + Arrays.toString(myNumbers));


    }
}
