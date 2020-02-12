package day026;

import java.util.Arrays;

public class Sorting_CharArray {

    public static void main(String[] args) {

        String survey = "Complete B15 Online 1 Month Survey";


        char[] surveyChars = survey.toCharArray();

        Arrays.sort(surveyChars);

        System.out.println("AFTER Sorting" + Arrays.toString(surveyChars));
    }
}
