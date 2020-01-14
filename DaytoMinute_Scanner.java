package day05;

import java.util.Scanner;

public class DaytoMinute_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("tell me how many day ");
        int day = scan.nextInt();
        int minute = day*24*60;

        System.out.println(day + " day is equal to " + minute + " minutes");
    }
}
