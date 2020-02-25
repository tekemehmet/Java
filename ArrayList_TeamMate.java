package day037;

import java.util.ArrayList;

public class ArrayList_TeamMate {

    public static void main(String[] args) {

        ArrayList<String> teamMate = new ArrayList<>();

        teamMate.add("Mehmet");
        teamMate.add("Omer");
        teamMate.add("Bulut");
        teamMate.add("Richard");
        teamMate.add("Fariza");
        teamMate.add("Rokshana");
        teamMate.add("Sumeyye");
        teamMate.add("Senay");
        teamMate.add("Sukran");
        teamMate.add("Enver");

        System.out.println("teamMate = " + teamMate);

        // first item
        System.out.println("First Item = " + teamMate.get(0) );

        // last item
        int lastItemIndex = teamMate.size()-1;
        System.out.println("Last Item = " + teamMate.get(lastItemIndex));

        //print all item forward
        System.out.println("All Items");
        for (int i = 0; i < teamMate.size(); i++) {
            System.out.println("Item " +(i+1)+" = " + teamMate.get(i));
        }

        // reverse print
        System.out.println("All Items Reverse Order");
        for (int i = lastItemIndex; i >= 0 ; i--) {
            System.out.println("Item " +(i+1)+" = " + teamMate.get(i));

        }

        // print 2 items at a time
        System.out.println("\nPrint 2 items at a time");
        for (int x = 0; x <= teamMate.size()-2 ; x+=2) {
            System.out.println("\t"+ teamMate.get(x)+ "---" + teamMate.get(x+1) );
        }

        // Challenge : Pair them up by 3
        // concat everyone in one string separated by -
        String result = "";

        for (int i = 0; i < teamMate.size(); i++) {
            result = result + teamMate.get(i)+"-";
            if(i == teamMate.size()-1 ){
                result = result + teamMate.get(i);
            }

        }
        System.out.println("result = " + result);

        //TODO : How can we turn a List into  String and Store in ? and manipulated

        String lstToString = teamMate.toString();
        System.out.println("lstToString = " + lstToString);
        System.out.println("lstToString = " + lstToString.replace(", ","-")
                                                        .replace("]","")
                                                        .replace("[",""));


    }
}
