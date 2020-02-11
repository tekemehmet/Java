package day025;

import java.util.Arrays;

public class CheckArraySortedOrNot {

    public static void main(String[] args) {

        int[] nums = {13,31,8,5,21,2};

        System.out.println("nums = " + Arrays.toString(nums));

        int numsItemCount = nums.length;
        // I want to copy the content of nums array into the new array

        // creating an array with same size as original array
        int[] numsCopy = new int[numsItemCount];
//

        for (int x = 0; x < numsItemCount; x++) {  // COPYING ARRAY TO ANOTHER ARRAY
            numsCopy[x] = nums[x];

        }

        System.out.println("numsCopy = " + Arrays.toString(numsCopy));

        Arrays.sort(numsCopy);

        System.out.println("Sorted numsCopy = " + Arrays.toString(numsCopy));


        // Check whether the array still have same content in same order after sorting
        //What method will check for content

        if( Arrays.equals(nums,numsCopy)) {
            System.out.println("This Array is already SORTED");
        } else {
            System.out.println("This Array is NOT already SORTED");
        }




    }
}
