package day033;

public class DayConverter {

    public static void main(String[] args) {

        /*
        * getDaysOfTheWeekFromNumber
        * This method will take number from 1-7
        * and convert that to actual day in word
        * @param int dayCode to represent day in number
        * @return the day in word in English as String
        * if the number is valid
        * if the number is not 1-7 return FUNDAY!
         */

        String dayD = getDaysOfTheWeekFromNumber(5);
        System.out.println(dayD);


    }
    public static String getDaysOfTheWeekFromNumber(int dayCode){

        String day= " ";

        if(dayCode==1){
            day = "Monday";
            System.out.println("Monday");

        }else if( dayCode==2){
            day = "Tuesday";
            System.out.println("Tuesday");
        } else if( dayCode==3){
            day = "Wednesday";
            System.out.println("Wednesday");
        }else if( dayCode==4) {
            day = "Thursday";
            System.out.println("Thursday");
        }else if( dayCode==5) {
            day = "Friday";
            System.out.println("Friday");
        }else if( dayCode==6) {
            day = "Saturday";
            System.out.println("Saturday");
        }else if( dayCode==7) {
            day = "Sunday";
            System.out.println("Sunday");
        }else {
            System.out.println("FUNDAY");
        }
        return day;

    }


}
