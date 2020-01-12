package day03;

public class PrimitivePractice {

    public static void main(String[] args) {

        byte letterCount = 28;
        System.out.println("The letter count is " + letterCount   );

        short sheepCount = 300;
        System.out.println("The sheep count is " + sheepCount);

        int catCount = 20;
        System.out.println("The cat count is " + catCount);

        long mileToSun = 10000000000l;
        System.out.println("The mile to Sun is " + mileToSun);

        long mileToMoon = 100000000000L;
        System.out.println("The mile to Moon " + mileToMoon);

        //-------------floating point----------------

        float priceOfBanana = 1.99f;  // you must add f at end of the number to indicate this is float data type
        System.out.println("The price of banana is " + priceOfBanana);

        float priceOfPotato = 2.49F;  //uppercase lowercase does not matter, but it is mandatory
        System.out.println("The price of Potato is " + priceOfPotato);

        //-------------larger floating point numbers-----------------
        double priceOfIPad    = 355.99d ;
        System.out.println("The price of IPad is " + priceOfIPad);

        double priceOfIPadPro = 1024.99D ;
        System.out.println("The price of IPadPro is " + priceOfIPadPro);

        double priceOfMAc     = 2299.99 ;  //compiler automatically assume it is a double so it is not required to have d
        System.out.println("The price of MAc is " + priceOfMAc);

        //if you have a whole number by itself, compiler automatically assume it is an int
        //if you have a fractional number by itself, compiler automatically assume it is an double







    }

}
