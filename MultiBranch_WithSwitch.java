package day010;

public class MultiBranch_WithSwitch {

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
        int itemNumber = 11 ;
        // what data type of variable I can use here
        //byte, short, int, char, String

        switch (itemNumber) {
            case 11:
                System.out.println("You have selected 11");
                order = "Burger";
                break;
            case 5:
                System.out.println("You have selected 5");
                order = "French Fry";
                break;
            case 8:
                System.out.println("You have selected 8");
                order = "Nugget";
                break;
            case 35:
                System.out.println("You have selected 35");
                order = "Ice Cream";
                break;
            case 55:
                System.out.println("You have selected 55");
                order = "Coke";
                break;
            default:
                System.out.println("You have selected Unknown");

        }

        System.out.println("Your order is " + order);

    }
}
