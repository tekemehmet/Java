package day026;

public class ArrayTask_NumberTest_Logic1 {

    public static void main(String[] args) {

        //write a program to tet all the element in this int array are more than 100

        int[] scores = { 156, 101, 76, 187, 87, 110 } ;


        String finalResult = " ";  // if all numbers are more than 100 then make it Yes, not make it No

        int cntLessThan100 = 0;

        for ( int eachNum  : scores) {

            if ( eachNum > 100) {
                ++cntLessThan100;
            }
        }
        System.out.println("cntLessThan100 = " + cntLessThan100);
        if ( cntLessThan100 == scores.length) {
            finalResult = "Yes";
        } else {
            finalResult = "No";
        }
        System.out.println("finalResult = " + finalResult);

    }
}
