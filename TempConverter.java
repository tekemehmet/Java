package day04;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {

        double celcius;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the Fahrenheit");

        double fahrenheit= input.nextDouble();

        celcius = (5.0/9)*(fahrenheit-32);

        System.out.println("Result is " + celcius + " C");

    }
}
