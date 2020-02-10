package day024;


import java.util.Arrays;

public class ArraysClass_Sorting {

    public static void main(String[] args) {

        // Sorting an array in ascending order
        // sort ---> Arrays.sort(yourArrayHere)
        System.out.println("----------------INTEGER SORTING-------------------------");
        int[] scores = {99,44,66,23,19,55};
        System.out.println(Arrays.toString(scores));

        Arrays.sort(scores);
        // SO WHAT HAPPEN TO MY ORIGINAL ORDER ???? GONE !!!
        // CAN I GET IT BACK ? NO!!!!
        // THE ORIGINAL INDEX OF ITEMS HAS CHANGED!!!
        System.out.println(Arrays.toString(scores)); // [19, 23, 44, 55, 66, 99]
        //FIRST ITEM VALUE
        System.out.println("firs item value: " + scores[0]); // 19

        System.out.println("-------------------CHAR SORTING-----------------------------");
        char[] nameChar = {'G','A','H','J','Y'};
        System.out.println("nameChars = " + Arrays.toString(nameChar)); //[G, A, H, J, Y]

        Arrays.sort(nameChar);
        System.out.println("after sorting: " + Arrays.toString(nameChar)); // [A, G, H, J, Y]

        //the low to high order for character is decided by its ascii table value
        // special characters come first, number, upper case then lower case

        char[] nameChar2 = {'G','A','H','J','Y','9',' ','*','g','a'};
        System.out.println("nameChars = " + Arrays.toString(nameChar));

        Arrays.sort(nameChar2);
        System.out.println("after sorting: " + Arrays.toString(nameChar2)); // [ , *, 9, A, G, H, J, Y, a, g]

        System.out.println("--------------------STRING SORTING---------------------");
        //ONLY FIRST CHARACTER MATTER WHEN SORTING A STRING ARRAY
        String[] superHeros = {"Superman","Batman","Wonder Woman", "Aquaman", "Cyborg", "Flash"};
        Arrays.sort(superHeros);
        System.out.println("after sorting:" + Arrays.toString(superHeros)); // [Aquaman, Batman, Cyborg, Flash, Superman, Wonder Woman]

        System.out.println("--------------------BOOLEAN DOES NOT SORTING---------------------");
        boolean[] fiveSwitchOnOffs={true,false,false,true,true};
        System.out.println("fiveSwitchOnOffs = " + Arrays.toString(fiveSwitchOnOffs));

        // Arrays.sort(fiveSwitchOnOffs);  IT DOES NOT WORK



    }
}
