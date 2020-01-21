package day010;

public class MultiBranch_Practice {

    public static void main(String[] args) {

        // At the McDonald Drive thru

        System.out.println("Welcome to McDonald, What can I get for you");
        /*
        * 11.Burger
        * 5.French Fry
        * 8.Nuggets
        * 35.Ice Cream
        * 55.Coke

         */

        String order = "";
        int itemNumber = 350 ;

        if (itemNumber == 11) {
            System.out.println("You have selected 11");
            order = "Burger";
        } else if ( itemNumber == 5) {
            System.out.println("You have selected 5");
            order = "French Fry";
        } else if ( itemNumber == 8) {
            System.out.println("You have selected 8");
            order = "Nuggets";
        } else if ( itemNumber == 35) {
            System.out.println("You have selected 35");
            order = "Ice Cream";
        }  else if ( itemNumber == 55) {
                System.out.println("You have selected 55");
                order = "Ice Cream";
        } else {
            System.out.println("You have selected Unknown Item");
            order = "UNKNOWN";
        }

        System.out.println("Your order is " + order);
    }
}
