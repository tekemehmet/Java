package day09;

import java.util.Scanner;

public class CitizenTypeChecker {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = scan.nextInt();

        String citizenType;

        if (age > 65) {
            citizenType = "Senior";

        } else {
            citizenType = "Not Senior";
        }
        System.out.println("The citizen age is " + age + " , and he is a " + citizenType);
    }
}
