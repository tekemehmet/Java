package day035;

public class CharPractice2 {

    public static void main(String[] args) {

        char myChar = '7';
        int myNum = Integer.parseInt(myChar+"");
        System.out.println("myNum = " + myNum);

//        Character.toString(myChar);
//        String.valueOf(myChar);

        //Add all the numbers inside the String

        String str = "A34B123C4X";

        char[] allChars = str.toCharArray();

        int sum = 0;

        for (char each : allChars) {
            if( Character.isDigit(each)){
                int eachNum = Integer.parseInt(each+"");  // Char to int conversion
                sum += eachNum;
            }

        }
        System.out.println("sum = " + sum);

    }
}
