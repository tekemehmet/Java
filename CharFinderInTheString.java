package day019;

public class CharFinderInTheString {

    public static void main(String[] args) {

        String name = "Mehmet Teke";

        int countOfE = 0;

        for (int x = 0; x < name.length() ; x++) {

            System.out.println( name.charAt(x));

            if ( name.charAt(x) == 'e' ) {
                System.out.println("BINGO");
                ++countOfE;
            }


        }
        System.out.println("countOfE = " + countOfE);;
    }
}
