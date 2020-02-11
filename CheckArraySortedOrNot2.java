package day025;

import java.util.Arrays;

public class CheckArraySortedOrNot2 {

    public static void main(String[] args) {

        int[] nums = {13,31,8,5,21,2};

        System.out.println("nums = " + Arrays.toString(nums));

        // CREATE A VARIABLE CALLED isSortedAlready and assign value of true
        // I ASSUME THE ARAY IS ALREADY SORTED
        //AND IF IT IS NOT THEN I CHANGE THE VALUE OF isSortedAlready to FALSE

        boolean isSortedAlready = true;

        for (int x = 0; x < nums.length-1; x++) {

            // pick first item and compare second item
            // keep repeating until there is no more item

            System.out.println("is " + nums[x] + " less than  " + nums[x+1] + " ? " + (nums[x]<nums[x+1])    );

            if (  ! (nums[x] < nums[x+1]) ) {
                System.out.println("ARRAY IS NOT SORTED, NO POINT CHECKING THE REST");
                isSortedAlready = false;
                break;
            }
        }
        System.out.println("isSortedAlready = " + isSortedAlready);

    }
}
