package day015;

public class ReversingAString {

    public static void main(String[] args) {

        String name = "Akbar";

        System.out.println( name.charAt(0) + " " + name.charAt(1) + " " + name.charAt(2) + " " + name.charAt(3) + " "
                + name.charAt(4));

        System.out.println( name.charAt(4) + " " + name.charAt(3) + " " + name.charAt(2) + " " + name.charAt(1) + " "
                + name.charAt(0));

        int nameLength = name.length();
        // counting character start with one
        // counting index (location) start with 0
        // so last character index/location will be always one less than actual character count
        int lastCharIndex = nameLength-1;
        char lastChar = name.charAt(lastCharIndex);

        System.out.println("LAST CHAR IS " + lastChar );

        System.out.println("LAST CHAR IS " + name.charAt(name.length()-1 )  );



    }
}
