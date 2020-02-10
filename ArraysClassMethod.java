package day024;

import java.util.Arrays;

public class ArraysClassMethod {

    public static void main(String[] args) {

        // Arrays class coming from java.util package
        // it has a lot of pre-built method to work with array object

        // for printing the content of the array
        // toString---> Arrays.toString(yourArrayHere)
        //This method will give you string representation of any type of array
        // the result will look ---> [ item1, item2, item3,......lastItem]

        // Sorting an array in ascending order
        // sort ---> Arrays.sort(yourArrayHere)

        // for checking for equality of 2 array object content
        // equals ----> Arrays.equals(firstArray,SecondArray)

        String[] superHeros = {"Superman","Batman","Wonder Woman", "Aquaman", "Cyborg", "Flash"};
        // System.out.println( superHeros ); This is not work
        System.out.println(Arrays.toString(superHeros)  );

        String superHerosAsString = Arrays.toString(superHeros) ;
        System.out.println( superHerosAsString );

        // how do we get first character of superHerosAsString variable

        System.out.println( superHerosAsString.charAt(0)); // it give us "["
        System.out.println(superHerosAsString.substring(0,2)); // it give us "[S"

        System.out.println("-------------------------------------------------------");

        int[] numbers = {10,44,55,3,78};

        System.out.println( Arrays.toString(numbers) );






    }
}
