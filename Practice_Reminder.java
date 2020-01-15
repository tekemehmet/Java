package day06;

import java.util.Scanner;

public class Practice_Reminder {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Please Enter a Number so that I will convert to hours");
        int minutes = scan.nextInt();

        int hourPart = (minutes/60);
        int minutesPart = (minutes%60);

        System.out.println(minutes + " minutes is " + hourPart + " hours and " + minutesPart + " minutes");


    }
}
