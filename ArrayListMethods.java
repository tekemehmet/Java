package day036;

import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {

        // Create a ArrayList object of long and assign it to a variable

        ArrayList<Long> lst = new ArrayList<>();

        // add item, read item, update the item, remove the item, check the location.....

        lst.add(12L); // 12L is automatically converted to new Long(12L); because ArrayList only store object
        lst.add(100L);
        lst.add(14L);
        lst.add(1,200L);

        System.out.println("lst = " + lst);

        // counting items inside ArrayList
        System.out.println("Counting items using lst.size = " + lst.size());

        // Getting items inside ArrayList Object

        System.out.println("First item is : lst.get(0) = " + lst.get(0));
        System.out.println("First item is : lst.get(1) = " + lst.get(1));
        System.out.println("First item is : lst.get(2) = " + lst.get(2));
        System.out.println("First item is : lst.get(3) = " + lst.get(3));

        // TASK : GET THE SUM OF ABOVE ARRAYLIST ITEMS
        long sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += lst.get(i);
        }
        System.out.println("sum = " + sum);

        // TASK : GET THE MAX OF ABOVE ARRAYLIST ITEMS

        long max = lst.get(0);
        for (int x = 0; x < lst.size(); x++) {
            if(lst.get(x) > max) {
                max = lst.get(x);
            }
        }
        System.out.println("Max Number : " + max);


    }
}
