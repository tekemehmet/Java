package day032;

import java.util.Arrays;

public class ArrayPracticeWithMethod {

    public static void main(String[] args) {

        //this is passing the array object directly into the method
        arrayPrinter(new int[]{1,6,5,3,12,3}  );

        //this is assigning the array object into a variable
        // and then pass it into the method
        int[] scores = { 2,5,8,23,4,5,6} ;
        arrayPrinter(scores);

        int[] numbers = new int[] {0,5,6,180,4,9,10};

        printMaxOfIntArray(numbers);
        printMinOfArray(numbers);
        printSumOfArray(numbers);

        printMaxOfIntArray( new int[] {1,5,6,80,4,9,10});
        printMinOfArray(new int[] {1,5,6,80,4,9,10} );
        printSumOfArray(new int[] {1,5,6} );

        compare2ArraySize(   new String[]{"Sezgin","Senay","Mehmet" } , new String[] {"Araz"} );

        String[] names1 = {"Suoerman", " Batman ", " Flash ", };
        String[] names2 = {"Wonder Woman", " Cyborg" , " Green Lantern"};

        compare2ArraySize(names1,names2);

    }
    // arrayPrinter
    // create a method that has one it array as a parameter
    // print out each item in this format
    // array has items :---->> all the items here

    public static void arrayPrinter( int[] nums  ){

            System.out.println("arrays has items : " + Arrays.toString(nums));
        }

        // printMaxOfIntArray
        //this method has one int array as parameter
        // and it will print the max number inside
    public static void printMaxOfIntArray(int[] numbers) {

        int maxNumber = numbers[0];

        for (int i = 0; i < numbers.length ; i++) {
            if( numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }
        System.out.println("Max Number : " + maxNumber );
    }

    public static void printMinOfArray(int[] numbers) {
        // printMinOfIntArray
        // this method has one int array as parameter
        // and it will print the min number inside the array

        int minNumber = numbers[0];

        for (int i = 0; i < numbers.length ; i++) {
            if( numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
        }
        System.out.println("Min Number : " + minNumber );
    }

    public static void printSumOfArray( int[] numbers){
        // printSumOfIntArray
        // this method has one int array as parameter
        // and it will print the sum of all the numbers

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        System.out.println("Sum of the Array : " + sum);
    }

    public static void compare2ArraySize(String[] arr1, String[] arr2){

        if( arr1.length > arr2.length) {
            System.out.println("array 1 has more item ");
        } else if( arr1.length < arr2.length) {
            System.out.println("array 2 has more item ");
        } else {
            System.out.println("they have same item count ");
        }


    }








    }




