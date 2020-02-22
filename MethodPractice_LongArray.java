package day036;

import java.util.Arrays;

public class MethodPractice_LongArray {

    public static void main(String[] args) {

        long[] myLongArr = {1L,23L,36L,42L,59L};
        System.out.println("before swamp myLongArr = " + Arrays.toString(myLongArr));

        swampFirstAndLastValue(myLongArr);
        System.out.println("After swamp myLongArr = " + Arrays.toString(myLongArr));

        long[] myNums1 = new long[5];
        System.out.println("myNums1 = " + Arrays.toString(myNums1)); // myNums1 = [0, 0, 0, 0, 0]

        Long[] myNums2 = new Long[5];
        System.out.println("myNums2 = " + Arrays.toString(myNums2));// myNums2 = [null, null, null, null, null]

        //write a static void method to accept a long array.
        //It should swamp first value with last value of the array
    }
    public static void swampFirstAndLastValue(long[] nums){

        // nums[0]  ,  nums[ nums.length-1]
        long temp = nums[0];
        nums[0] = nums[nums.length-1];
        nums[nums.length-1] = temp;


    }
}
