package day012;

public class CarShopping {

    public static void main(String[] args) {

        // buy corolla or Tesla (only if its within the budget)
        // There is only one car covered with cloth
        //we dont know what car it is and what is the price
        //once we take out the cloth
        //we check whether its toyota, if it is we buy it without checking price
        // if it is not we check if it is a Tesla and also check whether it is within the budget



        String carBrand = "Tesla";

        int carPrice = 60000;

        int budget = 60000 ;

        if ( carBrand.equals("corolla") || (carBrand.equals("Tesla") && carPrice <= budget)) {
            System.out.println("CAR ACQUIRED !!!");

        } else {
            System.out.println("NOT WHAT I AM LOOKING FOR");
        }





    }
}
