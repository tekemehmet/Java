package day06;

import java.util.Scanner;

public class UsingTheValueOfOtherVariables {

    public static void main(String[] args) {
/*
        int myFavoriteNumber = 300 ;
        int yourFavoriteNumber = myFavoriteNumber;

        System.out.println("MY Favorite Number " + myFavoriteNumber);
        System.out.println("Yout Favorite Number " + yourFavoriteNumber);

        yourFavoriteNumber = 100;

        System.out.println("MY Favorite Number " + myFavoriteNumber);
        System.out.println("Yout Favorite Number " + yourFavoriteNumber);

        //Create a variable called yourOrder, type String and assign a value
        // Optionally assign this value using Scanner
        // Create another variable called myOrder and assign the value
        //to same value as yourOrder by copying
        // and just print them out


 */
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your order?  I want the same");
        String yourOrder = scan.nextLine();
        String myOrder = yourOrder;

        System.out.println("My order is " + myOrder);
        System.out.println("Your order is " + yourOrder);




    }
}
