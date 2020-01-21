package day010;

public class SeasonAction {
    public static void main(String[] args) {

        /* What do you do in each season

       Spring : Hike, Easter , Nawruz
       Summer : Swim, Vacation, BBQ , Holiday
       Fall : Black Friday, Hiking, Harvest, Halloween
       Winter : Snowboarding, Ski, Christmas, New Year
         */

        String season = "Fall";
        String action = "";

        switch ( season ) {

            case "Spring" :
                action = "Hike";
                break;
            case "Summer" :
                action = "Swim";
                break;
            case "Fall" :
                action = "Black Friday";
                break;
            case "Winter" :
                action = "Snowboarding";
                break;
            default:
                action = "GO HOME";
                break;

        }
        System.out.println(action);


    }
}
