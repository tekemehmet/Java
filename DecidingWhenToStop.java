package day021;

public class DecidingWhenToStop {
    public static void main(String[] args) {

        String msg = "Hello World" ;

        int charCount = msg.length();

        int countOfCharToIterate = 3 ;

        // x <= charCount-n

        for (int x = 0; x <=charCount-3 ; x++) {
            System.out.println(msg.substring(x, x+3) );
        }

    }


}
