package day025;

import java.sql.SQLOutput;
import java.util.Arrays;

public class String_SplitMethod {

    public static void main(String[] args) {

        String sentence = "I love Java";

        String[] allWords =  sentence.split(" ");

        System.out.println("allWords = " + Arrays.toString(allWords) );

        System.out.println("How many word do I have in this sentence ? " + allWords.length);

        // How do I get the last word of the sentence using this array I got from String

        System.out.println("Last word in this sentence is " + allWords[allWords.length-1] );

        // ARE WE LIMITED TO SPLIT BY SPACE OR WE CAN SPLIT BY ANYTHING

        String sentence2 = "Everything is Awesome!!!" ;
        // Split by letter 'e'
        String[] splitBy_e_Arr = sentence2.split("e");
        System.out.println("splitBy_e_Arr = " + Arrays.toString(splitBy_e_Arr));

        for ( String eachPieces: splitBy_e_Arr) {
            System.out.println("eachPieces: " + eachPieces);

        }
        //Split this sentence by 'is' and print out your result

        String[] splitByIs = sentence2.split("is");
        System.out.println("splitByIs = " + Arrays.toString(splitByIs) );




    }
}
