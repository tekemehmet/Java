package day017;

import java.util.Scanner;

public class WarmUp_NameCorrector {

    public static void main(String[] args) {

        // Create a String variable to store your name in any case combination
        // create a variable called name2
        //make your first letter uppercase then rest lowercase

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = scan.nextLine();
        String name2 = (name.substring(0, 1).toUpperCase()) + name.substring(1).toLowerCase();
        System.out.println(name2);
    }
}