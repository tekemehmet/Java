package day011;

public class LogicalNotOperator {

    public static void main(String[] args) {

        //LOGICAL NOT OPERATOR  !  EXCLAMATION MARK used to negate the boolean value

        System.out.println( true );
        System.out.println( false );
        System.out.println( ! true); // result is false
        System.out.println( ! false); // result is true

        boolean isRecording = false ;
        System.out.println( ! isRecording );

        // third you can use it in front of a boolean expression
        //boolean expression is any expression that result in a boolean value
        // for example  7>5 ,  x>10 , y==20,  x<=100,  x>y

        System.out.println(  !(7>5)  );

        int x = 7;
        System.out.println( x>10 ); //false
        System.out.println(  ! (x>10));  //true (not false)



    }


}
