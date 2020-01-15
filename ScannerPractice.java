package day06;

import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        double regularPrice, salePrice, discountPercentage ;

        System.out.println(" What is the regular price ? "); // Ask the User
        regularPrice = scan.nextDouble();      // Capture the input

        System.out.println(" What is the discount of percentage : ");  // Ask the User
        discountPercentage = scan.nextDouble();                        // Capture the Input

        salePrice = regularPrice-discountPercentage*regularPrice; // Calculation here

        System.out.println("Regaular price is " + regularPrice
                + ", discount is " + discountPercentage + " and you got deal for " + salePrice + "$");

    }
}
