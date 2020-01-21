package day010;

import java.util.Scanner;

public class SeasonAction_Scanner {
    public static void main(String[] args) {

        /* What do you do in each season

       Spring : Hike, Easter , Nawruz
       Summer : Swim, Vacation, BBQ , Holiday
       Fall : Black Friday, Hiking, Harvest, Halloween
       Winter : Snowboarding, Ski, Christmas, New Year
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Hey what is the season?");


        String season = scan.next();
        String action = "";

        switch ( season ) {

            case "Spring" :
                action = "Hike, Easter , Nawruz";
                break;
            case "Summer" :
                action = "Swim, Vacation, BBQ , Holiday";
                break;
            case "Fall" :
                action = "Black Friday, Hiking, Harvest, Halloween Friday";
                break;
            case "Winter" :
                action = "Snowboarding, Ski, Christmas, New Year";
                break;
            default:
                action = "GO HOME";
                break;

        }
        System.out.println(action);


    }
}
