package day019;

public class SumOfAllNumbersWithinTheRange {

    public static void main(String[] args) {

        // get the sum of numbers from 1-10
        // is is interesting 1+2+3+4+5+6+7+8+9+10
        //when we loop from 1 to 10

        int sum = 0;

        for (int i = 0; i <=10 ; i++) {
            sum += i;
        }
        System.out.println(sum);

    }
}
