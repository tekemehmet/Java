package day027;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReview {
    public static void main(String[] args) {


        /*
        declaration:


        regular variables:
            we can only store one single value
                int a = 10;

        array Variables
        int[] arr = {1 , 2, 3};
        index:       0   1  2

        retrieve data:

            arrayName[indexNumber]===> element of that index number
            EX:
            arr[2]==> 3

         */

        int num = 10;
        int[] arr = {10,20,30,40,50,60};
        //length : returns the total number of elements from the array
        int num1 = arr[arr.length-1];

        System.out.println(num1);
        System.out.println("===========================================================");

        for (int x = 0; x < arr.length; x++) {
            System.out.print(arr[x]+ "-");
            
        }
        System.out.println("\n===========================================================");

        //Arrays.toString

        // System.out.println(Arrays.toString(arr));

        String  str = Arrays.toString(arr);
        System.out.println(str);

        // Task01 : Write a program that asks user to enter a number 5 times, and store those number into array

        int[] numbers = new int[5];
        System.out.println(Arrays.toString(numbers)); // [0, 0, 0, 0, 0] default value is zero

        Scanner scan = new Scanner(System.in);

        for (int i=0; i < 5 ; i++) {
            System.out.println("Enter a number: ");
            numbers[i] = scan.nextInt();

        }
        System.out.println(Arrays.toString(numbers));

        // Arrays.sort(variableName): sorts the array in ascending order

        Arrays.sort(numbers);
        int largetsNumber = numbers[numbers.length-1];
        int minNumber = numbers[0];
        System.out.println("largetsNumber = " + largetsNumber);
        System.out.println("minNumber = " + minNumber);

        // Task02 :
        //    write a program that can find the minimum number form an int array


    }
}
