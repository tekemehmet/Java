package day04;

import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // ask user to enter name
        System.out.println("Enter your first name please : ");

       //capture what user typed on keyboard in console
        String firstName = scan.next();

        // print the result of what we saved from user input
        System.out.println("Your first name is : " + firstName);

        System.out.println("What is your age? ");
        int age = scan.nextInt();
        System.out.println("Your age is : " + age);

    }
}
