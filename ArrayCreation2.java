package day022;

public class ArrayCreation2 {

    public static void main(String[] args) {

        // creating an array in second way

        int[] ages = new int[]{3, 5, 11, 33, 57, 18};

        int itemCount = ages.length;
        System.out.println("itemCount = " + itemCount);

        for (int x = 0; x < ages.length; x++) {

            System.out.println(ages[x]  );

        }

    }
}
