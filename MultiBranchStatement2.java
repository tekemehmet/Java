package day08;

public class MultiBranchStatement2 {

    public static void main(String[] args) {


        /*
        more than 90 ----> jail
        more than 80 and less than 90  ---> reckless driving
        more than 70 and less than 80 ----> point taken
        more than 60 and less than 70 ---> warning
        */

        int currentSpeed = 85;

        if (currentSpeed > 90) {
            System.out.println("Jail time");
        } else if ( currentSpeed > 80 ) {
            System.out.println("Reckless driving");
        } else if (currentSpeed > 70) {
            System.out.println("Point taken");
        } else {
            System.out.println("Warning");
        }
    }
}
