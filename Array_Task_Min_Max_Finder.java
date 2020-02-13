package day027;

public class Array_Task_Min_Max_Finder {

    public static void main(String[] args) {

        // Task02 :
        //    write a program that can find the MINIMUM number form an int array
        //  DO NOT USE SORT METHOD

        int[] scores = {100,987,546,1254,3665,22,4,3,9,15,99,19};
        int min = scores[0];

        for (int i = 0; i < scores.length ; i++) {
            if (min > scores[i]) {
                min = scores[i];
            }

        }
        System.out.println("min = " + min);

//---------------------SECOND MIN NUMBER---------------------------------------------

        int secondMin = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == min) {
                continue;
            }
            if (secondMin > scores[i]){
                secondMin = scores[i];

            }

        }
        System.out.println("secondMin = " + secondMin);
        //------------------THIRD MIN NUMBER-------------------------------------

        int thirdMin = scores[0];
        for (int i = 0; i < scores.length ; i++) {
            if ( scores[i]== min || scores[i] == secondMin ){
                continue;
            }
            if (thirdMin > scores[i]){
                thirdMin = scores[i];
            }
        }
        System.out.println("thirdMin = " + thirdMin);

    }
}
