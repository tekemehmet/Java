package day022;

public class MultiplicationTable {

    public static void main(String[] args) {

        for (int base = 1; base <=10 ; base++) {

//            System.out.println("1 x 1 = " + 1 * 1 );
//            System.out.println("1 x 2 = " + 1 * 2 );
//            System.out.println("1 x 3 = " + 1 * 3 );

            System.out.println("1 x " + base + " = " + 1 * base);

        }
        System.out.println("**********************************************");
        for (int base = 1; base <=10 ; base++) {
            //System.out.println("2 x 1 = " + 2 * 1 );
//            System.out.println("2 x 2 = " + 2 * 2 );
//            System.out.println("2 x 3 = " + 2 * 3 );
            System.out.println("2 x " + base + " = " + 2 * base);
        }
        System.out.println("**********************************************");
        for (int base = 1; base <=10 ; base++) {
            System.out.println("3 x " + base + " = " + 3 * base);
        }

    }
}
