package day020;

public class GiveMeSum {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 10; i < 100 ; i++) {

            if (i % 2 !=0){

                sum += i;
            }
        }

        System.out.println("Sum:" + sum);
    }
}
