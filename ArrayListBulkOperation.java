package day038;


import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.Arrays;
import java.util.List;

public class ArrayListBulkOperation {

    public static void main(String[] args) {

        List<String> groceries = Arrays.asList("Egg", "Milk", "Butter", "Apple", "Salmon");
        System.out.println("groceries = " + groceries);

        ArrayList<String> newLst = new ArrayList<>( groceries ) ;

        newLst.add("Diet Coke");
        newLst.add("Sugar");

        System.out.println("newLst = " + newLst);

        // actually I have list of items for you here : Pasta, branzini ,asparagus, spinach
        // good news is I already created a List object for you so you can just add them all to your existing list

        List<String> newItemToAdd = Arrays.asList("Past", " branzini" , "asparagus" , "spinach");

        // Adding one list to another list
        // we want to add all items inside newItemsToAdd to newLst
        newLst.addAll(newItemToAdd);
        System.out.println("newLst = " + newLst);









    }
}
