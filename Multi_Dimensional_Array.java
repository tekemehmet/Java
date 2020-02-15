package day027;

import java.util.Arrays;

public class Multi_Dimensional_Array {

    public static void main(String[] args) {

        int[] arr1D = {1,2,3};  // single array

        // 2D array: is an array that contains single dimensional arrays
        // single array i  0 1 2      0  1  2
        int[][] arr2D = { {1,2,3} , { 4, 5, 6 }  };
//  multi array index :      0           1


        System.out.println(arr2D.length);
        System.out.println(Arrays.toString(arr2D[0])); // [1,2,3]
        System.out.println(Arrays.toString(arr2D[1])); // [4,5,6]

        System.out.println(arr2D[0][2]); // value is 3

        System.out.println(arr2D[1][1]); // value is 5

        // Arrays.toString is only applicable to Single Array

        // Arrays.deepToString (multi-D Arrays);

        System.out.println(Arrays.deepToString(arr2D));






    }
}
