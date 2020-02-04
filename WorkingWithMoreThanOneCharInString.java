package day020;

public class WorkingWithMoreThanOneCharInString {

    public static void main(String[] args) {

        // given a String print 2 characters in one line
        // print 2 characters in one line
        // for example : Gokyuzum
        /*  go
            ky
            uz
            um
         */

        String name = "Gokyuzum";

          int charCount = name.length();
//        int x = 0;
//        System.out.println( name.substring(x,x+2) );
//        x = x + 2;
//        System.out.println( name.substring(x,x+2) );
//        x = x + 2;
//        System.out.println( name.substring(x,x+2) );
//        x = x + 2;
//        System.out.println( name.substring(x,x+2) );

        for ( int x = 0; x <= charCount-1; x+=2){
            System.out.println( name.substring(x,x+2) );
        }


//************************************************************************
        // EASY UNDESTAND
//        System.out.println( name.substring(0,2) );
//        System.out.println( name.substring(2,4) );
//        System.out.println( name.substring(4,6) );
//        System.out.println( name.substring(6,8) );
    }
}
