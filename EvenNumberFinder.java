package day017;

public class EvenNumberFinder {

    public static void main(String[] args) {

        // Write a program to print out a even number from 100-0

        int x = 100;


        System.out.println("Even Numbers");

        while (x >= 0) {

            if (x % 2 == 0) {

                System.out.println(x + " is even number");

            }
            --x;
        }
    }
}