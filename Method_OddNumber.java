package day031;

public class Method_OddNumber {

    // Create a method called countDownFrom20tillOne
// Create a method to print odd numbers from 1-100 : printOddNumbers1to100()
// Create a method to spell your name :  Seda -->> S-e-d-a


    public static void oddNumbers1to100() {

        for (int i = 1; i <=100 ; i++) {
            if( i % 2 != 0 ) {
                System.out.print(i+ " ");
            }

        }
        System.out.println();
    }

    private static void countDownFrom20 () {

        for (int i = 20; i >0 ; i--) {
            System.out.print(i+ " ");

        }
        System.out.println();
    }

    public static void spellingName() {

        String myName = "Mehmet";
        for (int i = 0; i < myName.length() ; i++) {
            System.out.print(myName.charAt(i) + "-");

        }
        System.out.println();
    }


    public static void main(String[] args) {

        countDownFrom20();
        oddNumbers1to100();
        spellingName();

    }
}
