package day027;

public class Array_Task_Max_Number_Finder {

    public static void main(String[] args) {

        // WRITE A PROGRAM THAT RETURNS TO MAXIMUM NUMBER FROM AN ARRAY
        //DO NOT USE SORT ARRAY

        int[] nums = {100,10000,9999,8888,1231,2345};
        int max = nums[0];

        for (int i=0; i < nums.length; i++){
            if ( max < nums[i]) {
                max = nums[i];
            }

        }
        System.out.println("firs Max Number: " + max);

        //----------------SECOND MAX NUMBER-------------------------------

        int secondMax = nums[0];
        for (int i = 0; i < nums.length ; i++) {
            if(secondMax < nums[i] && nums[i] != max){
                secondMax = nums[i];
            }
        }
        System.out.println("second Max Number = " + secondMax);





    }
}
