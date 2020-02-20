package day033;

public class DayConverter_Switch {

    public static void main(String[] args) {

        System.out.println(getDaysOfTheWeekFromNumber(6));
        System.out.println(getDaysOfTheWeekFromNumber(16));

        int[] allCodes = {5,3,11,4,33};

//        String day = getDaysOfTheWeekFromNumber( allCodes[0]);
//        System.out.println("day = " + day);

        for (int x = 0; x < allCodes.length ; x++) {
            String day = getDaysOfTheWeekFromNumber( allCodes[x]);
            System.out.println("day = " + day);

        }

        System.out.println("===================================================================");

        for(  int eachCode : allCodes) {
            System.out.println("each day = " + getDaysOfTheWeekFromNumber(eachCode));
        }


    }

    public static String getDaysOfTheWeekFromNumber(int dayCode) {

        //String dayName = "" ;
        switch (dayCode) {

            case 1:
                return "Monday";
//                dayName = "Monday";
//                break ;
            case 2:
                return "Tuesday";
//                dayName = "Tuesday";
//                break ;
            case 3:
                return "Wednesday";
//                dayName = "Wednesday";
//                break ;
            case 4:
                return "Thursday";
//                dayName = "Thursday";
//                break ;
            case 5:
                return "Friday";
//                dayName = "Friday";
//                break ;
            case 6:
                return "Saturday";
//                dayName = "Saturday";
//                break ;
            case 7:
                return "Sunday";
//                dayName = "Sunday";
//                break ;
            default:
                return "FUNDAY!!";
//                dayName = "FUNDAY!!";
        }

//        return dayName;
    }

}

