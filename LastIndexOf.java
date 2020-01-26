package day014;

public class LastIndexOf {

    public static void main(String[] args) {

        String name = "Game of Java";

        // find out the last location the letter a shows up
        System.out.println( name.lastIndexOf("a"));

        // find out the last location the character space shows up
        System.out.println( name.lastIndexOf(" "));

        // find out the last location Ga shows up
        System.out.println(name.lastIndexOf("Ga"));

        // find out the last location Kawa shows up
        System.out.println( name.lastIndexOf("Kawa")); // -1 there is no Kawa in the String


        if ( name.indexOf("Kawa")>-1     ) {    // this is an alternative method to Contains
            System.out.println("KAWA FOUND!!!");
        } else {
            System.out.println("NO KAWA-NO PUMPKIN");
        }



    }
}
