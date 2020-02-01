package day017;

public class NamePrinter_WhileLoop {

    public static void main(String[] args) {

        String name = "Alexander";

        // get each and every character and print them out vertically

        int x = 0;

        while (x < name.length()) {
            System.out.print("index " + x + " : ");
            System.out.println( name.charAt(x));
            ++x;
        }









    }
}
