package day020;

public class SumOfEvenOddSeparately {

    public static void main(String[] args) {

        // Give me the sum of odd and even numbers from 10-100

        int sumOfEven = 0;
        int sumOfOdd = 0;

        for (int i = 10; i <= 100 ; i++) {

            if (i % 2 == 0) {
                sumOfEven += i;
            } else {
                sumOfOdd += i;
            }

        }
        System.out.println("sumOfOdd = " + sumOfOdd);
        System.out.println("sumOfEven = " + sumOfEven);
    }

}
