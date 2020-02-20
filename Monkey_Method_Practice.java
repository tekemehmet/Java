package day034;

public class Monkey_Method_Practice {

    public static void main(String[] args) {

        boolean result = monkeyTrouble(false,true);
        System.out.println(result);

        System.out.println(monkeyTrouble1(true,true));
        System.out.println(monkeyTrouble1(false,true));
        System.out.println(monkeyTrouble1(false,false));





    }



    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

        return aSmile==bSmile;

    }
    // return yes and no instead of true and false
    public static String monkeyTrouble1(boolean aSmile, boolean bSmile){
        if ((aSmile && bSmile) || (!aSmile && !bSmile)  ){
            return "Yes";
        } else{
            return "No";
        }



    }


}
