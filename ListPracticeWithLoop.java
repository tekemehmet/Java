package day037;

import java.util.ArrayList;
import java.util.List;

public class ListPracticeWithLoop {
    public static void main(String[] args) {

        /*
        * Create an ArrayList in Integer and fill it up with 1-100
         */
        List<Integer> nums = new ArrayList<>();

        for (int i = 1; i <= 100 ; i++) {
            nums.add(i);

        }
        System.out.println("nums = " + nums);

        // change all the odd number value to 0 ;

        for (int i = 0; i < nums.size(); i+=2) {
            //System.out.println(" Odd Values are at Index = " + i );
            nums.set(i,0);
        }
        System.out.println("nums = " + nums);

        //Insert 100 to First Index
        nums.add(0,100);
        System.out.println("nums = " + nums);

        // How to find index of value 20
        System.out.println("nums.indexOf of 20 = " + nums.indexOf(20));

        // insert 100 right after 34 :
        List<Integer> lst2 = new ArrayList<>();
        lst2.add(44);
        lst2.add(14);
        lst2.add(34);
        lst2.add(41);
        lst2.add(19);
        System.out.println("lst2 = " + lst2);
        lst2.add(3,100);
        System.out.println("lst2 = " + lst2);



    }
}
