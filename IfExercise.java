package day08;

import java.util.Scanner;

public class IfExercise {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Guess my favorite number : ");
        int yourFavoriteNumber = scan.nextInt();
        int myFavoriteNumber = 7;

        if (yourFavoriteNumber == myFavoriteNumber) {

            System.out.println(" BINGO ");

        } else {
            System.out.println(" Try again later ");

        }
    }
}