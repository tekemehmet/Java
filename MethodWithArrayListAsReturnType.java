package day037;

import java.util.ArrayList;
import java.util.List;

public class MethodWithArrayListAsReturnType {
    public static void main(String[] args) {

        System.out.println( getListFrom1TillFinalNumber(7)  );

        System.out.println( getListFrom1TillFinalNumber(2)  );

        System.out.println( getListFrom1TillFinalNumber(20)  );

        List<Integer> myList = getListFrom1TillFinalNumber(25);
        System.out.println("myList = " + myList);

    }

    // Crete a method that accept a finalNumber as int
    // return an ArrayList of Integer containing numbers
    // starting from 1 till finalNumber

    /**
     *
     * @param finalNumber
     * @return  List<Integer>
     */
    public static List<Integer> getListFrom1TillFinalNumber(int finalNumber){

        List<Integer> nums = new ArrayList<>();
        for (int numbers = 1; numbers <= finalNumber; numbers++) {
            nums.add(numbers);
        }
        //System.out.println("nums = " + nums);
        return nums;

    }

}
