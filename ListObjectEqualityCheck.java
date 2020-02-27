package day038;

import java.util.*;

public class ListObjectEqualityCheck {

    public static void main(String[] args) {

        List<Integer> num1 = new ArrayList<>(Arrays.asList(200, 300, 600, 700, 800));

        List<Integer> num2 = new ArrayList<>(Arrays.asList(200, 300, 600, 700, 800));

        List<Integer> num3 = new ArrayList<>(Arrays.asList(300, 200, 700, 600, 800));

        System.out.println("num1.equals(num2) " + num1.equals(num2)); // true

        System.out.println("num1.equals(num2) " + num2.equals(num3)); // false


    }


}
