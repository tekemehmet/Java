package day015;

public class StringCaseInsensitiveCheck {

    public static void main(String[] args) {

        String name = "Arya Stark";

        System.out.println( "name contains st result is : "  + name.contains("st"));

        // I wanna check whether this name contains st no matter the case
        // so I want to store the uppercase version of this name then check for ST

        String uppercaseName = name.toUpperCase(); // "ARYA STARK"
        System.out.println("uppercaseName contains ST or not ? " + uppercaseName.contains("ST") );

        String lowercaseName = name.toLowerCase(); // "arya stark"
        System.out.println("lowercaseName contains st or not ? " + lowercaseName.contains("st"));

        // THis is called method chaining, combining multiple method call
        // make my name all lowercase (String) then check whether it contains lowercase st

        System.out.println( name.toLowerCase().contains("st") );
        //System.out.println(name.length().toUppercase() ); // It does not work int and string together!!!







    }
}
