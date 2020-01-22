package day011;

public class LogicalOperators {

    public static void main(String[] args) {

        // combining multiple condition together
        // in Java there is no range check directly like math
        // for example
        //in math  60 < x < 100
        // in Java x > 60 && x < 100

        // &&  2 ampersand  & 1 ampersand ---> Logical AND operator
        // This is used to check both conditions are true at the same time

        /*
        * int x=70 ; x > 60 && x < 100 ; true
        * int x=10 ; x > 60 && x < 100 ;  false
        * int x=110 ; x > 60 && x < 100 ; false
        * int x=99 ; x > 60 && x < 100 ; true
         */

        System.out.println("TRUTH TABLE");
        System.out.println( "RESULT OF true && true is " + (true && true) );
        System.out.println("RESULT OF  false && true is " + (false && true) );
        System.out.println( "RESULT OF true && false is " + (true && false) );
        System.out.println("RESULT OF  false && false is " + (false && false) );
        System.out.println("**************************************************");
        System.out.println( "RESULT OF true || true is " + (true || true) );
        System.out.println("RESULT OF  false || true is " + (false || true) );
        System.out.println( "RESULT OF true || false is " + (true || false) );
        System.out.println("RESULT OF  false || false is " + (false || false) );


        // Create a variable called num with type int
        //
        int num = 10;
        System.out.println( num>100 || num<60 );

        System.out.println("Number " + num + " is " + (num>100 && num<60));

        System.out.println( true || false || false );
        System.out.println( true && true && false );

        // check X is more than 50 and X is not 52 or X equal to 57
        int x = 57;
        System.out.println( x > 50 && x != 52 || x == 57 );





    }
}
