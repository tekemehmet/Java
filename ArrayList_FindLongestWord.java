package day037;

import java.util.ArrayList;

public class ArrayList_FindLongestWord {

    public static void main(String[] args) {

        ArrayList<String> nameLst = new ArrayList<>();
        nameLst.add("Qalbinur");
        nameLst.add("Ruzi");
        nameLst.add("Sabahiddin");
        nameLst.add("Guzelnurin");
        nameLst.add("Muyesser");
        nameLst.add("Mustafa");
        System.out.println("nameLst = " + nameLst);

        // assume the first one is the longest then compare with the rest
        String longestName = nameLst.get(0); // String longestName = " " ;

        for (int x = 0; x < nameLst.size(); x++) {

            String currentName = nameLst.get(x);

            if( currentName.length() >= longestName.length() ){
                longestName = currentName;
            }
        }
        System.out.println("longestName = " + longestName);

        // How do I concatenation of all longest words if there are more than one
        for (int i = 0; i < nameLst.size(); i++) {
            if (nameLst.get(i).length() == longestName.length()) {

                System.out.println("longest  Word = " + nameLst.get(i));
            }
        }


        // length : counting the elements inside array, it is a property of array object
        // length() : counting the characters inside String. It is a method of String object
        // size() : counting the elements inside ArrayList object
        System.out.println("================================================");
        // HOW DO WE USE FOR EACH LOOP TO GO THROUGH EACH ITEMS
        for ( String currentName  : nameLst){
            System.out.println("currentName = " + currentName);
        }





    }
}

