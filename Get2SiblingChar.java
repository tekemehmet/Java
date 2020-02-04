package day020;

public class Get2SiblingChar {

    public static void main(String[] args) {

        // given a String with even number character count
        // print 2 characters in one line as below example

        // for example : Ayra
        //
        //ay
        //yr
        //ra

        String name = "Ayra";

        int charCount = name.length();

        for ( int x = 0; x <= charCount-2; x+=1) {
            System.out.println(name.substring(x, x + 2));
        }

    }
}
