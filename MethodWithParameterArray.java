package day036;

import java.util.Arrays;

public class MethodWithParameterArray {

    public static void main(String[] args) {

        int[] nums ={1,5,3,4,7,2};


//        Arrays.sort(nums);
//        System.out.println("after sort num = " + Arrays.toString(nums));

        System.out.println("before change nums = " + Arrays.toString(nums));
        changeArrayFirstItemto100( nums );
        System.out.println("after change nums = " + Arrays.toString(nums));
    }

    public static void changeArrayFirstItemto100(int[] numbers){

        numbers[0] = 100;
    }
}
