package day034;

import java.util.Arrays;

public class MethodThatReturnMoreThanOneValue {

    public static void main(String[] args) {

        String sentence = "I laove Java";

        char[] eachChar = sentence.toCharArray();
        String[] eachWord = sentence.split(" ");

        int[] resultArr = returnBoysVSGirlsResult();
        System.out.println(Arrays.toString(resultArr));

    }

    //create a method that return int array returnBoysVSGirlsResult
    public static int [] returnBoysVSGirlsResult () {
        int[] boysGirlsCount = {56,52};
        return boysGirlsCount;
    }

}
