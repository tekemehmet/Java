package day024;

public class WarmUp_Array {

    public static void main(String[] args) {

        String[] groceryItem = {"apple", "banana" , "grape", "strawberry", "blueberry" , "kiwi"};
        float[] price = {1.99f , 0.99f , 4.65f, 3.89f , 3.88f, 2.88f};

        for ( String eachFruit  : groceryItem ) {

            System.out.print(eachFruit + "-->");

        }
        System.out.println();
        // print everything in one line with arrow and do not put arrow after last one
        int itemCount = groceryItem.length;
        int lastItemIndex= itemCount-1;
        String lastFruit = groceryItem[lastItemIndex]; // groceryItem[groceryItem.length-1]

        for ( String eachFruit  : groceryItem ) {

            System.out.print(eachFruit);
            if (! eachFruit.equals(lastFruit))
                System.out.print("-->");
        }

    }
}
