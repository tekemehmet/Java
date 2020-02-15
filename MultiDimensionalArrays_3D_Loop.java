package day027;

import java.util.Arrays;

public class MultiDimensionalArrays_3D_Loop {

    public static void main(String[] args) {
        // N dimensional Array MUST contains (N-1) dimensional arrays

        // 2D ARRAY
        int[][] arr2D = {  { 1, 2, 3  }, {4, 5, 6 } };

        // 3D ARRAY : Contains 2D Array
        int[][][] arr3D = {  {   { 1, 2, 3 }, {4,5,6}   } , {   {7,8,9} , {10,11,12}  }  };
        //              index               0                             1

        for (int i = 0; i < arr3D.length; i++) { // each index of 2D array
            for (int j = 0; j <arr3D[i].length ; j++) {  // each index number of 1D array
                for (int k = 0; k < arr3D[i][j].length ; k++) { // each index number of the values

                    System.out.print(arr3D[i][j][k]+" ");
                }
                
            }
        }


    }
}
