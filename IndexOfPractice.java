package day014;

public class IndexOfPractice {

    public static void main(String[] args) {

        // indexOf : find out index of another String inside this String
        // index       012345678910
        String name = "Game of Java";
        // find out the location of Java
        // find out the location of letter O
        // find out the location of first space

        System.out.println("find out the location of JAva");
        System.out.println(  name.indexOf("Java") ); // 8 (index)

        System.out.println("find out the location of o");
        System.out.println( name.indexOf("o"));

        System.out.println("find out the location of O");
        System.out.println( name.indexOf("O")); // -1  if the location is not found, we get negative number

        System.out.println("find out the location of first space");
        System.out.println( name.indexOf(" "));


    }
}
