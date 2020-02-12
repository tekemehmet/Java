package day026;

import java.util.Arrays;

public class SwappingValues {

    public static void main(String[] args) {

        String name1 = "Emma";
        String name2 = "Jason";

        // name2 should have Emma, name1 should have Jason

        String tempCotainer = name1;  // emma
        name1 = name2; // name1 --> emma
        name2 = tempCotainer ; // name-->emma

        System.out.println("name1 = " + name1);
        System.out.println("name2 = " + name2);

        //Swap the value of first item and last item
        int[] myNumbers = new int[]{10,40,30,7};

        int temp = myNumbers[0];
        myNumbers[0] = myNumbers[3];
        myNumbers[3] = temp;

        System.out.println(Arrays.toString(myNumbers));


        // the result of swapping---> reversed array
        //How did I come up with 0 and 3
        // How did I come up with 0+1 and 3-1=2


    }

}
