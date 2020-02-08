package day022;

public class Array_String {

    public static void main(String[] args) {

        // create a String array with size that you define
        // and store all your household member names

        String [] householdMember = new String[4];

        householdMember[0] = "Mehmet";
        householdMember[1] = "Sengul";
        householdMember[2] = "Nergis";
        householdMember[3] = "Ahmet";

        System.out.println(householdMember[0]);
        System.out.println(householdMember[1]);
        System.out.println(householdMember[2]);
        System.out.println(householdMember[3]);

        // immutable means you can not change the internal structure of the object
        // if you have String abc = "Hello"
        // if you do abc.toUpperCase---> it will create new String object "HELLO"
        // and it does not change original hello at all !!

        // not resizable --> specifically for array
        // we can not change the size of array once we create them with certain size
        // However , we can change the elements inside this array
        // and it means : IT IS NOT IMMUTABLE




    }
}
