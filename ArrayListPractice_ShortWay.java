package day038;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice_ShortWay {

    public static void main(String[] args) {

        // create List of 6 double in short way
        // we will just read them and will not add or remove item
        List<Double> price = Arrays.asList(9.99 , 5.55, 3.76 ,8.99 , 0.99 , 65.67, 0.99);
        System.out.println("price = " + price);
       // price.add(12.8); // we can not at item at that method "asList"
        int count = 0;

        for (Double each  : price){
            if (each > 5 ){
                ++count;
            }
        }
        System.out.println("count = " + count);

        // I want to add 2 more prices ( does not have to be same list)
        ArrayList<Double> newPrices = new ArrayList<>( price);

        newPrices.add(199.99);
        newPrices.remove(0.99); // remove method will remove first occurrence of the value

        System.out.println("newPrices = " + newPrices);

        // Create a ArrayList Object in one shot with many items so we can add or remove

        ArrayList<Double> oneShotPrice = new ArrayList<>(Arrays.asList(9.99 , 5.55, 3.76 ,8.99 ) );

        // Add 100.99 after 9.99
        oneShotPrice.add(1,100.99);
        //remove item3
        oneShotPrice.remove(2);
        System.out.println("oneShotPrice = " + oneShotPrice);

    }
}
