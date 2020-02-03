package day019;

import java.util.Scanner;

public class SpeedAction {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter start speed and end speed !!!");

        int start = scan.nextInt();
        int end = scan.nextInt();

        for (; start < end ; start++) {
            System.out.println(start);
        }


    }
}
