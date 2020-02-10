package day024;

public class ForEachLoopReadOnly {

    public static void main(String[] args) {

        int yourFavNumber = 300;
        int myFavNumber = yourFavNumber;

        myFavNumber = 299;
        System.out.println(yourFavNumber);

        long[] nums = {10,40,20};
        //how do i change double my first item in the array
        nums[0] = nums[0]*2;  //  nums[0]*=2

//        for (int x = 0; x < 3; x++) {
//            nums[x] = nums[x]*2; // here we are doubling the value of each item
//        }
//
//        for (int x = 0; x < 3; x++) {
//            System.out.println( nums[x] );
//        }
//
//
//
//        for (int x = 0; x < 3; x++) {
//            long eachItem = nums[x];
//            eachItem = 100;
//            System.out.println( nums[x] );
//        }

        for (long eachItem  : nums ) {  // NEVER USE FOR EACH LOOP TO MODIFY ARRAY ITEMS
            eachItem = 100;

        }
        System.out.println(nums[1]);






    }
}
