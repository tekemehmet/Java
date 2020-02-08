package day022;

public class Array_Char {

    public static void main(String[] args) {

        // //Create a Char array that hold all the letter from your first name
        //        // and assign values using each characters of your name
        //
        //        // then print out each character

        char[] name = new char[6];
        name [0] = 'm';
        name [1] = 'e';
        name [2] = 'h';
        name [3] = 'm';
        name [4] = 'e';
        name [5] = 't';


        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
        System.out.println(name[3]);
        System.out.println(name[4]);
        System.out.println(name[5]);

        System.out.println("" + name[0] + name[1] + name[2] + name[3] + name[4] + name[5]);
        System.out.println(name);

    }
}
