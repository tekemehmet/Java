package day011;

public class StringEqualityPractice_Condition {

    public static void main(String[] args) {

        String myStr = "Cava" ;

        if ( myStr.equals("Java")) {
            System.out.println(" CORREECT WORD");
        } else {
            System.out.println("SAY JAVA!!!!!!!");
        }
        // Update this program to add more condition
        //using else if in the middle
        /*
        check the value of myStr
        if it is Java ---> Correct Word
        if it is Cava ---> Pumpkin
        else say NOT JAVA NOR PUMPKIN
         */

        if (myStr.equals("Java")){
            System.out.println("Correct Word");
        } else if (myStr.equals("Cava")) {
            System.out.println("Pumpkin");
        } else {
            System.out.println("NOT JAVA NOR PUMPKIN");
        }

    }
}
