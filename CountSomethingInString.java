package day021;

public class CountSomethingInString {

    public static void main(String[] args) {


        String myName = "Ahmet Ankara Mehmet tekemet Bursa Eskisehir";

        int charCount = myName.length();
        System.out.println("charCount = " + charCount);
        int lastCharIndex = charCount - 1;
        System.out.println("lastCharIndex = " + lastCharIndex);

        int counter = 0;

        System.out.println("---3 char ---");

        for (int x = 0; x <= lastCharIndex-2; x++) {

            String current2Char = myName.substring( x , x+3 );

            if ( current2Char.equalsIgnoreCase("met")  ) {

                counter ++;

            }

        }
        System.out.println("counter = " + counter);

    }
}
