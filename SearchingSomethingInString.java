package day021;

public class SearchingSomethingInString {

    public static void main(String[] args) {

        String myName = "Ahmet Ankara";

        int charCount = myName.length();
        System.out.println("charCount = " + charCount);
        int lastCharIndex = charCount - 1;
        System.out.println("lastCharIndex = " + lastCharIndex);

        // Find out index all the a in cases insensitive manner
        // i will go through each and every letter of the String ---> for loop
        // while i am going through each and every character
        // i will check whether current character i am looking at
        // equals to a or A
        //if it is i will print the index
        //if not --> just move on
        //perform this action until I reach last character

        System.out.println("---1 char ---");
        //for (int x = 0; x < charCount ; x++) {
        for (int x = 0; x <= lastCharIndex; x++) {

            String currentChar = myName.substring(x,x+1);
            if ( currentChar.equalsIgnoreCase("a")  ) {

                System.out.println("The index of a or A is " + x);
            }


        }

    }
}
