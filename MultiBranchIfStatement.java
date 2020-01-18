package day08;

public class MultiBranchIfStatement {

    public static void main(String[] args) {

        /* given your currentSpeed, speedLimit
        check whether the current speed is

        more than 90 ----> jail
        more than 80 and less than 90  ---> reckless driving
        *****************************************************
        more than 70            ----> point taken
        more than 60 and less than 70 ---> warning

        if not speeding keep driving
        */

        int currentSpeed = 60 ;

        if (currentSpeed > 70 ) {
            System.out.println(" Point taken !!!! ");
        } else if ( currentSpeed > 60 ) {
            System.out.println(" Your speed is more than 60 and less than 70");
        } else {
            System.out.println(" Keep driving you are good!!!!");
        }




    }
}
