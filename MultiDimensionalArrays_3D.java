package day027;

import java.util.Arrays;

public class MultiDimensionalArrays_3D {

    public static void main(String[] args) {
        // N dimensional Array MUST contains (N-1) dimensional arrays

        // 2D ARRAY
        int[][] arr2D = {  { 1, 2, 3  }, {4, 5, 6 } };

        // 3D ARRAY : Contains 2D Array
        int[][][] arr3D = {  {   { 1, 2, 3 }, {4,5,6}   } , {   {7,8,9} , {10,11,12}  }  };
        //              index               0                             1

        //[ index num of 2D array] [index num of 1D array] [index num of values]

        //print 9:
        System.out.println( arr3D[1][0][2]); // return 9

        // print 2:
        System.out.println( arr3D[0][0][1]); // return 2

        // print {1,2,3}
        System.out.println(Arrays.toString(arr3D[0][0]));// {1,2,3}

        // print {10,11,12}
        System.out.println( Arrays.toString(arr3D[1][1])  ); // {10,11,12}  1D array

       //print {7,8,9} , {10,11,12}
        System.out.println(Arrays.deepToString(arr3D[1]) ); // returns 2d Array

        System.out.println(Arrays.deepToString(arr3D)); // [[[1, 2, 3], [4, 5, 6]], [[7, 8, 9], [10, 11, 12]]]




    }
}
