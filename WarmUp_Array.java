package day023;

public class WarmUp_Array {

    public static void main(String[] args) {

        // create an int array of 7 items
        // assign values
        // 1.print out in reverse order
        // 2.store last item in a variable called lastItem
        // print it out separately
        //3. print the item right in the middle,
        // optionally : fin sum, max, min, average.

        //First way to create ARRAY
        int[] nums = new int[7];
        nums[0] = 1;
        nums[1] = 3;
        nums[2] = 15;
        nums[3] = 61;
        nums[4] = 17;
        nums[5] = 31;
        nums[6] = 15;

        // 2nd.Way to Create ARRAY
        int[] nums2 = new int[] {11,2,54,63,1,25,9};


        // 3rd and Shortest way
        int[] number = {5, 10, 25, 1, 23, 3, 56};


        for (int i = number.length-1 ; i >= 0 ; i--) {  // Reverse Order the Number

            System.out.println("index " + i + " : " +number[i] );
        }

        int arraySize = number.length;
        int lastItemIndex = arraySize-1;

        int lastItem = number[lastItemIndex];
        System.out.println("last item Value = " + lastItem);

        System.out.println("Middle value is: " + number[number.length/2]); // middle value

        int counter = 0;
        int sum = 0;
        for (int x = 0; x <= lastItemIndex; x++) {

            sum = sum + number[x];
            counter++;
        }
        System.out.println("Sum: " + sum);
        System.out.println("counter = " + counter);
        System.out.println("Average Value: " + 123/7);






    }
}
