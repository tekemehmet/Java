package day05;

import java.util.Scanner;

public class GroceryShopping {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is the price of tomato ?");
        double priceTomato = scan.nextDouble();
        System.out.println("How many tomato you want to buy ? ");
        double amoutOfTomato = scan.nextDouble();
        System.out.println("What is the price of potato ?");
        double pricePotato = scan.nextDouble();
        System.out.println("How many potato you want to buy ? ");
        double amoutOfPotato = scan.nextDouble();
        System.out.println("What is the price of banana ?");
        double priceBanana = scan.nextDouble();
        System.out.println("How many banana you want to buy ? ");
        double amoutOfBanana = scan.nextDouble();

        System.out.println(" Tomato Price is " + (priceTomato*amoutOfTomato));
        System.out.println(" Potato Price is " + (pricePotato*amoutOfPotato));
        System.out.println(" Banana Price is " + (priceBanana*amoutOfBanana));


    }
}
