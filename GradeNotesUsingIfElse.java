package day08;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class GradeNotesUsingIfElse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your note");
        int note = scan.nextInt();

        if (note>90) {
            System.out.println("Your grade is A");
        } else if (note>80) {
            System.out.println(" Your grade is B");
        } else
            System.out.println(" Study Hard");
    }
}
