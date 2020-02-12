package day026;

public class ArrayTask_NumberTest_Logic2 {

    public static void main(String[] args) {

        //write a program to tet all the element in this int array are more than 100

        int[] scores = { 511, 101, 176, 180, 187, 110 } ;


        String finalResult = "Yes";  // if all numbers are more than 100 then make it Yes, not make it No

        // LOGIC 2 :
        // Assume initial value for final Result is Yes
        // Check each item and
        // break as long as one number is less than 100  after assigning final result to NO
        // if we never go inside condition , the final result will remain initail value as YES


        for ( int eachNum  : scores) {

            if (eachNum <= 100 ) {
                finalResult = "No";
                break;

            }
        }
        System.out.println("finalResult = " + finalResult);



    }
}
