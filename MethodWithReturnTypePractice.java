package day032;

public class MethodWithReturnTypePractice {

    public static void main(String[] args) {

        System.out.println( divide(10,3)  );

        System.out.println( divide(10,0)  ); // infinity // after if condition, it will return 0

    }

    public static double divide( double num1, double num2) {

        if (num2 == 0) { // we check if num2 is 0

            return 0;  // if it is,we just return 0
        } else {
            return num1/num2;
        }




    }

}
