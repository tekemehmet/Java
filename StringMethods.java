package day013;

public class StringMethods {

    public static void main(String[] args) {

        // String actions that we already know so far

        // equals
        String s1 ="hello";
        System.out.println(s1.equals("abc"));
        //equalsIgnoreCase
        System.out.println(s1.equalsIgnoreCase("HELLO"));

        // toUpperCase method of String is used to make all character uppercase
        System.out.println("Initial String: " + s1);  // hello
        System.out.println( "toUpperCase: " + s1.toUpperCase()   ); // convert to upper case HELLO


        //toLoweCase method of String is used to make all character lowercase
        System.out.println("toLowerCase :" + s1.toLowerCase() );

        System.out.println("*********************************************************");

        // Store your name into a variable
        //print your name in all

        String name = "MEhMEt";
        System.out.println(name);
        System.out.println("MY NAME IS: " + name.toUpperCase());
        String lowerName = "mehmet";
        System.out.println("my name is: " + lowerName.toLowerCase());

        System.out.println("*******************************************************");
        int lengthOfStr = s1.length();

        if ( lengthOfStr > 4 ) {
            System.out.println("More than 4 character");
        } else {
            System.out.println("Not more than 4");
        }



    }
}
