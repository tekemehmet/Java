package day012;

import java.util.Scanner;

public class Season_IgnoreCase {

    public static void main(String[] args) {

        // ignore upper or lower case

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your season please!");
        String season = scan.next();

        if (season.equalsIgnoreCase("Spring")){
            System.out.println("Hiking, Nevruz, Alergy, Cool weather");
        } else if ( season.equalsIgnoreCase("Summer")) {
            System.out.println("Enjoy the Sunshine");
        } else if ( season.equalsIgnoreCase("Fall")) {
            System.out.println("Just Code");
        } else if ( season.equalsIgnoreCase("winter")){
            System.out.println("Ski, Snowman, Code");
        } else {
            System.out.println("NOT VALID");
        }


    }
}
