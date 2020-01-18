package day08;

public class IfStatementExamples {
    public static void main(String[] args) {

        int speedLimit = 60;
        int yourCurrentSpeed = 100;

        // if the your currentSpeed is more than speed limit
        // get pulled over by the police
        //given ticket by the police
        // taken away some points on your license
        // go to court

        //if not over the limit
        // go shopping

        //outside if statement, say the end

        boolean amISpeeding = (yourCurrentSpeed>speedLimit);

        if ( amISpeeding) {
            System.out.println("get pulled over by the police");
            System.out.println("given ticket by the police");
            System.out.println("taken away some points on your license");
            System.out.println("go to court");

        } else {
            System.out.println("go shopping!!");
            System.out.println("Enjoy your day");
        }
        System.out.println("THE END");
    }
}
