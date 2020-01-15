package day06;

public class CoinConverter {

    public static void main(String[] args) {


        // You have 200 cent
        // How many dime you can get 10 cent
        // How many quarter you can get 25 cent
        //How many Nickel you can get 5 cent
        //How many penny you can get

        int cent = 200;

        // you have purchase candle for 74 cent, what would be your remainder

        cent -= 74 ; // 126 cent

        int quarter = cent / 25 ; // 126/25---->
        int penny = cent % 25;    //126%25 ---> 1 is remaining

        System.out.println(quarter);
        System.out.println(penny);

        int dime= cent / 10 ;  // 126 / 10 --->12
        // how much penny I have after getting dime 126 %10---->6
        int penny2 = cent % 10 ;  //---->6
        System.out.println(dime);
        System.out.println(penny2);



    }
}
