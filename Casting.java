package day07;

public class Casting {

    public static void main(String[] args) {

        // int num = 10;

        double bigNum = 10 ;  // 10 is implicitly converted to double 10.0 and stored inside bigNum

        System.out.println(bigNum);

        //int num = 12.99;  //12.99 is double, double has much bigger range than int so it just does not fit
                            // int num = 12.99 ; Compiler error


        int num = (int) 12.99;
        System.out.println(num); // result is 12

        long eartToMoon = 10000;
        int earthToMoon_int = (int) eartToMoon;
        System.out.println( earthToMoon_int );


    }
}
