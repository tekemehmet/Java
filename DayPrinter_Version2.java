package day09;

public class DayPrinter_Version2 {
    public static void main(String[] args) {

        /*
        * if the daycode is 1 ----> Monday
        * if the daycode is 2 ----> Tuesday
        *.................................
        * if the daycode is 7 ----> Saturday
        * if none of the above just print unknown day
        *
        *   */

        int dayCode =9 ;
        String dayName = ""; // assigning a empty String value

        if (dayCode==1) {
            dayName = " Monday";
        } else if(dayCode==2) {
            dayName = " Tuesday";
        } else if(dayCode==3) {
            dayName = "Wednesday";
        } else if(dayCode==4) {
            dayName = "Thursday";
        } else if(dayCode==5) {
            dayName = "Friday";
        } else if(dayCode==6) {
            dayName = "Saturday";
        } else if(dayCode==7) {
            dayName = "Sunday";
        } else {
            dayName = "Unknown";
        }

        System.out.println("Day is " + dayName);
    }
}
