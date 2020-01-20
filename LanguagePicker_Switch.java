package day09;

import java.util.Scanner;

public class LanguagePicker_Switch {

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
        switch (languageOption) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Selam");
                break;
            case 3:
                System.out.println("Hola");
                break;
            case 4:
                System.out.println("Privet");
                break;
            case 5:
                System.out.println("Privet");
                break;
            case 6:
                System.out.println("Privet");
                break;
            case 7:
                System.out.println("Privet");
                break;
            default:
                System.out.println("Unknown");

        }

    }
}
