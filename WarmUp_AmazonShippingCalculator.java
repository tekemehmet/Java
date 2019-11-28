package day013;

import java.nio.file.AccessMode;

public class WarmUp_AmazonShippingCalculator {

    public static void main(String[] args) {

        /*
        Amazon has 2 type of user one is Prime member and another is regular member
        Prime member get free shipping in all purchase
        regular member user get free shipping only if their purchase is more than 25$
        otherwise they get 5$ shipping free
         */

        String memberType = "member";
        double amount = 55.99d;
        int shippingFee = 0;

        // first I wanna check  it is prime member or not

        if (memberType.equalsIgnoreCase("PRIME member") ) {
            System.out.println("YOU GET 1 DAY FREE SHIPPING!!!!");
            System.out.println("Your final price is " + amount  );


        } else if (! memberType.equalsIgnoreCase("Prime member")&& amount > 25) {
            System.out.println("NOT A PRIME MEMBER BUT YOU ORDER IS MORE THAN 25");
            System.out.println(" YOU GOT FREE SHIPPING ON AMOUNT " + amount);
        } else {

            System.out.println(" DO WANT TO SIGN UP FOR PRIME MEMBERSHIP");
            shippingFee = 5;
            amount = amount + shippingFee;  // amount += shippingFee
            System.out.println("YOUR FINAL AMOUNT IS " + amount);
        }

    }
}
