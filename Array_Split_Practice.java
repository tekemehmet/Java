package day039;

public class Array_Split_Practice {

    public static void main(String[] args) {

        String itemDetails = "Dyson Vacuum,399,16.25";
        String[] itemSplitArr = itemDetails.split(",");

        String name = itemSplitArr[0];
        System.out.println("name = " + name);

        double price = Double.parseDouble(itemSplitArr[1] );
        System.out.println("price = " + price);

        double monthly = Double.parseDouble(itemSplitArr[2] );
        System.out.println("monthly = " + monthly);

        itemDetails = name + "," + price*0.2 + "," + monthly;
        System.out.println("itemDetails = " + itemDetails);

        System.out.println("item name = " + itemDetails.split(",")[0] );
        System.out.println("item price = " + Double.parseDouble(itemDetails.split(",")[1] ));
        System.out.println("item monthly = " + Double.parseDouble( itemDetails.split(",")[2] ));



//        System.out.println("item name = " + itemDetails.split(",")[0] );
//        System.out.println("item price = " + itemDetails.split(",")[1] );
//        System.out.println("item monthly = " + itemDetails.split(",")[2] );
    }
}
