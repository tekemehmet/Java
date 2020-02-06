package day021;

public class SearchingSomethingInString3 {

    public static void main(String[] args) {



        // Find out index all the word in cases insensitive manner
        // i will go through each and every letter of the String by three char
        // for loop
        // while i am going through each and every character
        // i will check whether current character i am looking at
        // equals to a or A
        //if it is i will print the index
        //if not --> just move on
        //perform this action until I reach last character

        String myName = "Ahmet Ankara Mehmet teke Bursa Eskisehir";

        int charCount = myName.length();
        System.out.println("charCount = " + charCount);
        int lastCharIndex = charCount - 1;
        System.out.println("lastCharIndex = " + lastCharIndex);

        System.out.println("---3 char ---");

        for (int x = 0; x <= lastCharIndex-2; x++) {

            String current2Char = myName.substring( x , x+3 );
            if ( current2Char.equalsIgnoreCase("KIS")  ) {

                System.out.println("The index of \"kis\" is " + x);
            }


        }

    }
}
