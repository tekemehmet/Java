package day09;

import java.util.Scanner;

public class LanguagePicker {

    public static void main(String[] args) {

        /* assume you are on the call and you have been given option to be greeted by the language of your
        chice according to the number you provided
        1--> Hello
        2--> Selam
        3--> Hola
        4--> Privet
        5--> Merhaba
        6-->Szia
        7-->bonjour
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number between 1-7");
        int languageOption = scan.nextInt() ;

        String greeting = ""; // assigning a empty String value

        if (languageOption==1) {
            greeting = " Hello";
        } else if(languageOption==2) {
            greeting = " Selam";
        } else if(languageOption==3) {
            greeting = "Hola";
        } else if(languageOption==4) {
            greeting = "Privet";
        } else if(languageOption==5) {
            greeting = "Merhaba";
        } else if(languageOption==6) {
            greeting = "Szia";
        } else if (languageOption==7) {
            greeting = "Bonjour";
        } else
            greeting = "UNKNOWN";

        System.out.println(greeting + ", SDET");
    }
}
