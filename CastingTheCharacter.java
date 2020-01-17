package day07;

public class CastingTheCharacter {

    public static void main(String[] args) {

        char grade = 'B';
        System.out.println(grade);

        int letterInNumber = 'B' ; // B is represented by 66 in ascii table
        System.out.println(letterInNumber);

        //----------------------------------------------------------

        char myFirstChar = (char) 100 ;  // Result is d
        System.out.println(myFirstChar);

        // find out your of each character in your first name

        int m = 'M';
        int e = 'E';
        int h = 'H';
        int t = 'T';

        System.out.println(m);
        System.out.println(e);
        System.out.println(h);
        System.out.println(t);

        int sum = m+e+h+m+e+t;
        System.out.println(sum);

        // ****************************************************

        char letterA = 'a';
        System.out.println(letterA);

        System.out.println( letterA + 1); // Result is 98

        System.out.println("" + letterA + 1);  // Result is a1, because left to right ---> stringOff

    }
}
