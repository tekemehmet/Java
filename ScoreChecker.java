package day011;

public class ScoreChecker {

    public static void main(String[] args) {


        int score = 25;

        if ( score < 0 || score > 100) {
            System.out.println("Invald Score!!!");
        } else if ( score==100 ) {
            System.out.println("Perfect Score");
        } else if ( score >70 && score <100) {
            System.out.println("You have Passed");
        } else if ( score <20) {
                System.out.println("Come to my Office");
        } else if ( score >30 && score<40) {
            System.out.println("Attend additional classes");
        } else if ( score >40 && score<70) {
            System.out.println("Little bit more study will let you pass");
        } else {
            System.out.println("You Failed");
        }


    }
}
