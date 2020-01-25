package day013;

public class NestedIf_ShoppingCalculator {

    public static void main(String[] args) {

        //create a boolean for store result of doYouWantToShop
        // if yes, do you want to go to Store or do you want to shop Online

        boolean youWantToShop = true;
        String preference = "Store";

        //if (youWantToShop == true)
        if (youWantToShop) {

            if (preference.equals("Store")) {
                System.out.println("GOING TO STORE FOR SHOPPING");
            } else {
                System.out.println("GOING TO ONLINE FOR SHOPPING");
            }


        } else {
            System.out.println("Good Job stay at home and CODING!!!");
        }
    }
}
