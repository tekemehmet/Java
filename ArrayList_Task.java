package day039;

import java.util.*;

public class ArrayList_Task {

    public static void main(String[] args) {

        ArrayList<String> productLst
                = new ArrayList<>(Arrays.asList("iPhone 6s,449,18.71",
                "iPhone 6s Plus,549,22.88",
                "iPhone X,1149,56.16",
                "MacbookPro,1499.99,79.49",
                "ThumbDrive,39.99,2.68",
                "Beats HeadPhones,349.99,15.12",
                "Mouse,79.99,8.98",
                "Charger,39.99,4.56",
                "iPad,429,18.31",
                "Dyson Vacuum,399,16.25",
                "TV,2199,89.49",
                "Apple Watch,559,21.18") );

        System.out.println("productLst = " + productLst);
        System.out.println("Product Size = " + productLst.size());

//        String itemDetails = "iPhone 6s,449,18.71";
//        System.out.println("item name = " + itemDetails.split(",")[0] );
//        System.out.println("item price = " + itemDetails.split(",")[1] );
//        System.out.println("item monthly = " + itemDetails.split(",")[2] );

        // Task 1 : print only items name

        for (String eachProduct : productLst){
            String namePart = eachProduct.split(",")[0] ; // split by comma and get the first item
            System.out.println("eachProduct name = " + namePart);
        }
        // TASK 1 via For Loop
        System.out.println("**************** TASK 1 ****************************");

        for (int i = 0; i < productLst.size(); i++) {

            String namePart = productLst.get(i).split(",")[0];
            System.out.println("eachProduct name = " + namePart);

        }

        // TASK 2 : Print All the prices more than 500;
        System.out.println("**************** TASK 2 ****************************");

        for ( String eachProduct : productLst) {

            double price = Double.parseDouble(eachProduct.split(",")[1] );
            if(price>500){
                System.out.println("price = " + price);
            }
        }

        // Task 3 : print average price
        System.out.println("**************** TASK 3 ****************************");
        double sum = 0;
        double average = 0;
        for ( String eachProduct : productLst) {

            double price = Double.parseDouble(eachProduct.split(",")[1]);
            sum += price;
        }
        average = sum/12;
        System.out.println("sum = " + sum);
        System.out.println("average = " + sum/productLst.size());

        //Task 4 : print all the items name that has less than 20$ monthly payment.
        System.out.println("**************** TASK 4 ****************************");

        for ( String eachProduct : productLst) {

            String name = eachProduct.split(",")[0] ;
            double monthly = Double.parseDouble( eachProduct.split(",")[2]);

            if(monthly < 20){
                System.out.println(name + " monthly price is less than $20 = " + monthly);
            }
        }

        //Task 5 : Print the monthly payments of all the iPhone no matter what model.
        System.out.println("**************** TASK 5 ****************************");

        for ( String eachProduct : productLst) {

            String name = eachProduct.split(",")[0];
            double monthly = Double.parseDouble(eachProduct.split(",")[2]);

            if ( name.contains("iPhone") ){
                System.out.println(name + " => " + monthly);
            }
        }

        //Task 6 : Print all information about most expensive items.
        System.out.println("**************** TASK 6 ****************************");

        double maxPrice = Double.parseDouble(productLst.get(0).split(",")[1] );
        int maxPriceIndex = 0;

        for (int i = 0; i < productLst.size(); i++) {

            String priceString = productLst.get(i).split(",")[1];
            double price =  Double.parseDouble( priceString );

            if (price > maxPrice){
                maxPrice = price;
                maxPriceIndex = i;
            }
        }
        System.out.println("maxPriceIndex = " + maxPriceIndex);
        System.out.println("maxPrice = " + maxPrice);
        System.out.println("maxPriceIndex = " + productLst.get(maxPriceIndex));

        //Task 7 : Update Dyson price to 80% off (Monthly payment should also be calculated accordingly)
        System.out.println("**************** TASK 7 ****************************");

        System.out.println(productLst.contains("Dyson")); // false
        System.out.println(productLst.indexOf("Dyson")); // -1

        int dysonIndex = 0;
        for (int i = 0; i < productLst.size(); i++) {

            if (productLst.get(i).startsWith("Dyson") ){
                dysonIndex = i;

            }
        }
        System.out.println("dysonIndex = " + dysonIndex);
        String dysonDetails = productLst.get(dysonIndex);
        String name = dysonDetails.split(",")[0];
        double price = Double.parseDouble( dysonDetails.split(",")[1]);
        double monthly = Double.parseDouble( dysonDetails.split(",")[2]);
        dysonDetails = name + "," + price*0.2 + "," + monthly;  // String concatenation

        System.out.println("dysonDetails = " + dysonDetails);
        productLst.set(dysonIndex, dysonDetails); // Put in the List
        System.out.println("productLst = " + productLst);

        System.out.println("**************** TASK 8 ****************************");
        //Task 8 : Count the items prices more than average price.

        int cnt = 0;
        for ( String eachProduct : productLst){

            double prices = Double.parseDouble( eachProduct.split(",")[1]);
            if (prices > average){
                ++cnt;
            }
        }
        System.out.println("all the items with prices more than average cnt = " + cnt);


        System.out.println("**************** TASK 9 ****************************");
        //OPTIONALLY :
        //Task 9 : Remove all the items has more than average price.

        for (int i = 0; i < productLst.size(); i++) {

            double prices = Double.parseDouble(productLst.get(i).split(",")[1]);
            if (prices > average) {

                productLst.remove(i);
                --i;    // because of index shifted
            }
        }
        System.out.println("productLst after removing = " + productLst.size());

        System.out.println("**************** Three ArrayList Task ****************************");
      //  Create 3 more ArrayList objects to separately store  itemNames(String), prices(Double) , monthlyPayments(Double)  :
        ArrayList<String> itemNames = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();
        ArrayList<Double> monthlyPayments = new ArrayList<>();

        String item1 = "iPhone 6s Plus,549,22.88";

        for (String eachProduct : productLst) {


            itemNames.add(eachProduct.split(",")[0]);
            double pricePart = Double.parseDouble(eachProduct.split(",")[1]);
            prices.add(pricePart);
            double monthlyPart = Double.parseDouble( eachProduct.split(",")[2]);
            monthlyPayments.add(monthlyPart);
        }
        System.out.println("itemNames = " + itemNames);
        System.out.println("price = " + prices);
        System.out.println("monthlyPayments = " + monthlyPayments);




    }
}
