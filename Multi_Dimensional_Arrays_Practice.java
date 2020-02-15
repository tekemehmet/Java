package day027;

import java.util.Arrays;

public class Multi_Dimensional_Arrays_Practice {

    public static void main(String[] args) {

        String[][] names = {   { "Mussie" , "Ghoya"   } , { "Hasan", "Tetiana"   }};
        // index Number                 0                           1

        // print Hasan
        System.out.println(names[1][0]); // Hasan

        // print Tetiana
        System.out.println(names[1][1]); // Tetiana

        // Assign Dilshat
        names[1][1] = "Dilshat";   // Assigning
        System.out.println(names[1][1]); // Dilshat

        // print Hasan and Dilshat
        System.out.println(Arrays.toString(names[1])); // [Hasan, Dilshat]

        // print all
        System.out.println(Arrays.deepToString(names)); // [[Mussie, Ghoya], [Hasan, Dilshat]]

        int[][] numbers = {  {  1,2,3} , {4,5,6} , {7,8,9}};
        //              index    0          1         2

        for (int i = 0; i <  numbers.length ; i++) {
            System.out.println(Arrays.toString(numbers[i]));

            // [1, 2, 3]
            // [4, 5, 6]
            // [7, 8, 9]

        }

        for (int i = 0; i <  numbers.length ; i++) {
            for (int j = 0; j < numbers[i].length ; j++) {
                System.out.print(numbers[i][j]+ " ");

                // 1 2 3 4 5 6 7 8 9

            }
        }

        System.out.println("\n======================FOR LOOP=======================================");

        // print all the even numbers

        int[][] ages = {  { 10  } ,  { 12,13,14,15,16,17 } , { 19,20,21,22,23  }  } ;

        for (int i = 0; i < ages.length; i++) {
            for ( int j=0; j< ages[i].length ; j++ ) {

                if (ages[i][j] % 2 != 0){ // return odd numbers, skip it
                    continue;
            }
                System.out.print(ages[i][j]+" ");  // 10 12 14 16 20 22  Even number print out

            }

        }
        System.out.println("\n=======================FOR EACH LOOP================================");

        int[] arr1D = {1,2,3};

        for ( int each : arr1D ) {
            System.out.print(each+ " ");
        }

        System.out.println("\n=======================FOR EACH LOOP- 2D ARRAY================================");

        int[][] arr2D = {   {10,20,30} , {40,50,60,70,80,90,100} };

        for ( int[] each1DArray :  arr2D) {
            for (int eachElement : each1DArray)
            System.out.print(eachElement + " ");
        }





    }
}
