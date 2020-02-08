package day022;

public class ArrayPractice1 {

    public static void main(String[] args) {

    double [] prices = new double[5];

        System.out.println( prices[0]);

        // can NOT print out array variable directly
        System.out.println(prices);

        prices[0] = 2.46;
        prices[1] = 12.96;
        prices[2] = 992.1;
        prices[3] = 500 ;
        prices[4] = 65.123;
        // what happen if I go over the range
        //RUN TIME ERROR
        //PROCE[5] = 15.2; // ARRAY HAS 4 CHARACTER, THIS LINE GIVES ERROR

        System.out.println( prices[0]);
        System.out.println( prices[1]);
        System.out.println( prices[2]);
        System.out.println( prices[3]);
        System.out.println( prices[4]);









}

}
