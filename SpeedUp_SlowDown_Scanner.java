package day019;

import javax.swing.*;
import java.util.Scanner;

public class SpeedUp_SlowDown_Scanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter start speed and end speed !!!");

        int start = scan.nextInt();
        int end = scan.nextInt();

        if (start < end) {

            for (int i= start;  i <= end; i++) {
                System.out.print(i + ",");
            }

        } else if (start > end) {
            for (int x = start; x > end; x--) {
                System.out.print(x + ",");
            }
        } else {
            System.out.println( "no action needed!!! SAME SPEED!!");
        }

    }
}
