package day06;

import java.util.Scanner;

public class Practice_NextLine {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /* What is your name
        Which city you live in, included state
        What is your street adress
         */

        System.out.println("What is your name");
        String name = scan.nextLine();

        System.out.println("Which city you live ?");
        String livingPlace = scan.nextLine();

        System.out.println("What is your street adress ?");
        String adress = scan.nextLine();

        System.out.println(" Your name is " + name + " and you live in" + livingPlace + ", your adress is " + adress);


    }
}
