package day031;

public class MethodPractice2 {

    // write piece of reusable code to count from 1 to 10
    // give a name count to 10
    // no need for object when being called
    // it should be accessible anywhere in your project
    // it does not return any value

    private static void count1to10() {

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");

        }
        System.out.println();
    }

    private static void countDownFrom20 () {

        for (int i = 20; i >0 ; i--) {
            System.out.print(i+ " ");

        }
        System.out.println();
    }


    public static void main(String[] args) {

        System.out.println("Count to 1 to 10 ");

            count1to10();

            count1to10();

            countDownFrom20();

        }

    }





