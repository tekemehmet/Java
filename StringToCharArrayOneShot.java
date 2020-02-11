package day025;

import java.util.Arrays;

public class StringToCharArrayOneShot {

    public static void main(String[] args) {

        // pick up your own name and turn in into char array and use for each loop to loop over them
        // optionally count how many a you have in your name

        String name = "mehmet";

        char[] allCharsInName = name.toCharArray();
        int counter = 0;
        for (char eachChar : allCharsInName){
            System.out.println("eachChar = " + eachChar);
            counter++;
        }
        System.out.println("How many Char in the Name = " + counter);

        // How many "e" we have
        int count = 0;
        for ( char eachChar : allCharsInName){

            if(eachChar=='e'){
                ++count;
            }
        }
        System.out.println("How many e char in the name = " + count);

        // how do i sort low to high
        Arrays.sort(allCharsInName);
        System.out.println("allCharsInName = " + Arrays.toString(allCharsInName));


    }
}
