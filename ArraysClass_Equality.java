package day024;

import java.util.Arrays;

public class ArraysClass_Equality {

    public static void main(String[] args) {

        int[] scores1 = {2,5,6,4,8,7,9,10};
        int[] scores2 = {22,45,6,69,2,14,52};
        int[] scores3 = {2,5,6,4,8,7,9,10};

        System.out.println( scores1 == scores2 );
        System.out.println( scores1 == scores3 );

        // equals---> Arrays.equals(firstArray,secondArray)
        boolean isS1S2Equals = Arrays.equals(scores1,scores2);
        System.out.println("is Score1 has same content as Score2: " + isS1S2Equals ); //false

        boolean isS1S3Equals = Arrays.equals(scores1,scores3);
        System.out.println("is Score1 has same content as Score3: " + isS1S3Equals ); // true

    }
}
