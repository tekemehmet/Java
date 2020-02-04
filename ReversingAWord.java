package day020;

public class ReversingAWord {

    public static void main(String[] args) {

        // given a String variable name with value
        //reverse this name and store reversed value into
        // another String variable reversedName

        String name = "mehmet teke";
        String reversedName = "" ;

        int lastCharIndex = name.length()-1;


        for (int x = lastCharIndex ; x >= 0 ; x--) {

            System.out.print(x + " index: ");
            System.out.println(name.charAt(x));
            reversedName = reversedName + name.charAt(x);

        }


        System.out.println("reversedName = " + reversedName);

    }
}
