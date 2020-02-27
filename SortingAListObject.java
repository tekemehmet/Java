package day038;

import java.util.*;

public class SortingAListObject {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(300, 200, 700, 600, 800));

        // 2 ways to sort an ArrayList
        // Collection utility class ( just like Arrays utility class for array objects)

        //Collection is a class coming from java.util package
        // it has alot of ready method to work with Collection objects like ArrayList and so on

        Collections.sort(nums);
        System.out.println("nums after sort = " + nums); //[200, 300, 600, 700, 800]

        //Thi version sort method accept 2 arguments
        // 1st is the list to be sorted
        // 2nd a Comparator Object that contains comparing logic
        // good news is there is ready method already in java
        //we can get reverse order comparator object by calling
        //Comparator.reverseOrder() , just take it and use it
        Collections.sort(nums, Comparator.reverseOrder()  );
        System.out.println("nums after reverse order = " + nums); //[800, 700, 600, 300, 200]

        nums.sort(Comparator.naturalOrder() );
        System.out.println("nums after natural order = " + nums); // [200, 300, 600, 700, 800]

    }
}
