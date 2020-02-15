package day029;

import java.util.Arrays;

public class StringArray_Practice {

    public static void main(String[] args) {

        String hero1 = "Superman-Clark Kent";
        //Hero code is Superman and Identity is Clark Kent


        // LOGIC 1 : split this String by dash -
        // to get 2 pieces of String into a String array
        String[] heroSplitted = hero1.split("-");
        System.out.println("heroSplitted = " + Arrays.toString(heroSplitted));

        System.out.println("Hero coed is " + heroSplitted[0] + " and Identity is " + heroSplitted[1]);

        // The initial of the Hero is CK
        // I can just use fullName variable to finish this task

        // LOGIC1 = get the first letter of full name then get the first letter after the space and concatenate them
        // downside is what if we have middle name solution, instead of looking for the letter after first space
        // look for last index of the space then get next Character

        // LOGIC 2  : We already have full name stored in fullName variable
        //      split by space -->> we will get firstName (middle name) lastName
        //      get the first letter of full name
        //      then get the last name using last item index
        //      get the first character then concatenate
        //      Clark Kent -->> [  Clark , Kent ]   Clark->C   Kent-K  --->> CK

        String fullName = heroSplitted[1];

        String[] fullNameSplitted = fullName.split(" ");
        System.out.println("fullNameSplitted = " + Arrays.toString(fullNameSplitted));

        String lastName = fullNameSplitted[1];
        System.out.println("lastName = " + lastName);

        System.out.println("Initial of the hero is : " + fullName.charAt(0) + lastName.charAt(0));








    }
}
