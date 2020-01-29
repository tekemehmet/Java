package day015;

import java.util.Scanner;

public class NameChecker {

    public static void main(String[] args) {


        // declare a variable to store your name
        // check whether you name length is less than 4
        // if so print short name
        // if it is within 5-10
        //if so print medium name
        // if it is more than 11
        // print longer name

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name:");

        String name = scan.next();
        int len = name.length();

        if (len < 4) {
            System.out.println("SHORT NAME");
        } else if (len > 5 && len < 10) {
            System.out.println("MEDIUM NAME");
        } else if (len >= 11) {
            System.out.println("LONG NAME");
        }

        if ( name.contains("a") || name.contains("e")) {
            System.out.println("My name is contain a or e ");
        } else {
            System.out.println("I don't have both characters");
        }
    }
}