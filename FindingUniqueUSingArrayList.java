package day036;

import java.util.ArrayList;

public class FindingUniqueUSingArrayList {

    public static void main(String[] args) {

        int[] nums = {11,11,22,33,33,55,45,85,25,14,36,95,45,78,65} ;

        ArrayList<Integer> uniqueLst = new ArrayList<>();

        // I want to add items to uniqueList if it does not already contains that item

        for ( int each : nums) {
            //System.out.println("each = " + each);
           if( ! uniqueLst.contains(each))
            uniqueLst.add(each);

        }
        System.out.println("uniqueLst = " + uniqueLst);

    }
}
