package day036;

import java.util.ArrayList;
import java.util.List;

public class ArrayListIntro {

    public static void main(String[] args) {

        // How do we create a ArrayList Object

        ArrayList<String>lst1 = new ArrayList<>();
        ArrayList<Integer> lst2 = new ArrayList<>();

       // ArrayList<int> lst2 = new ArrayList<>();  IT WILL ONLY STORE OBJECT, NOT PRIMITIVE

       // Correct way to create arraylist object that store whole number
       // is to use Wrapper class type. Primitive type is FORBIDDEN

        ArrayList<Long> lst3 = new ArrayList<>() ;

        ArrayList<Double> lst4 = new ArrayList<>();

        ArrayList<Boolean> lst5 = new ArrayList<>();

        // OPTIONALLY YOU CAN CREATE IN THIS WAY

        List<String> myLst = new ArrayList<>();

        // List is a more general dtat type compared to ArrayList is more concrete data type
        // ArrayList is one type of List





    }
}
