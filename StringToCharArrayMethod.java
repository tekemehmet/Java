package day025;

import java.util.Arrays;

public class StringToCharArrayMethod {

    public static void main(String[] args) {

        String name = "Alesya";

        // how would you store each and every character
        // to an char array from above name
        // without using method we are about to learn

        char[] namesChars = new char[ name.length()  ];
//          manuel method
//        namesChars[0] = name.charAt(0); 'a'
//        namesChars[1] = name.charAt(1); 'l'
//        namesChars[2] = name.charAt(2); 'e'
//        namesChars[3] = name.charAt(3); 's'
//        namesChars[4] = name.charAt(4); 'y'
//        namesChars[5] = name.charAt(5); 'a'

        for (int x = 0; x < namesChars.length; x++) {

            namesChars[x] = name.charAt(x);
        }
        System.out.println("namesChars: " + Arrays.toString(namesChars));

        //----------------SHORT WAY-----toCharArray----------------------************************************
        char[] namesChars2 = name.toCharArray();
        System.out.println("namesChars2 = " + Arrays.toString(namesChars2));


        String myName = "mehmet teke";
        char[] myNameChar = myName.toCharArray();
        System.out.println("My name chars " + Arrays.toString(myNameChar));





    }
}
