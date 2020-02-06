package day021;

public class OrderOfBreakContinue {

    public static void main(String[] args) {

        for (int x = 0; x <= 10 ; x++) {

            break;
            //this will not work, Unreachable Code!!!
            //System.out.println("HELLO");
        }
        System.out.println("THE END");
    }
}
