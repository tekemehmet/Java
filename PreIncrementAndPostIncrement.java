package day07;

public class PreIncrementAndPostIncrement {
    public static void main(String[] args) {

        // increment and decrement operator ++  -- has two version
        // Pre-increment ++score
        // Post increment score++
        // pre-decrement --score
        // post decrement score--

        int apple = 8;
        apple ++;

        System.out.println( apple );

        System.out.println( ++apple  );

        System.out.println( apple++ ); // post increment does not work
        System.out.println(apple);

        int score = 50 ;
        System.out.println(++score); // Result is 51
        System.out.println( score ++ );  // 51 and ready to be 52 next time it show up
        System.out.println( score); // 52
        System.out.println( --score); //51
        System.out.println( score-- ); // still 51 ready to be 50 next time it shows up
        System.out.println( score ); // 50




    }
}
