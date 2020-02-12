package day026;

import java.util.Arrays;

public class StringSplitPractice {

    public static void main(String[] args) {

        String students = "Abbos, Zulyar, Zhibek,Hasan, Muge,Orhan,Susan";

        students = students.replace(" ","");
        System.out.println("students = " + students);

        // first get all the name into String array called namesArray

        //Spell the name of each person in this format
        // A-b-b-o-s- .......

        // Optionally count a from each name and print

        String[] namesArrays = students.split(","); // split by coma ,
        System.out.println(Arrays.toString(namesArrays));

        for (int j = 0; j < namesArrays.length ; j++) {


            String name = namesArrays[j]; // Abbos ---> A-b-b-o-s-

            for (int i = 0; i < name.length(); i++) {

                System.out.print(name.charAt(i) + "-");

            }
            System.out.println();

        }


    }
}
