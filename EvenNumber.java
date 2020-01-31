package day017;

public class EvenNumber {

    public static void main(String[] args) {

        // Write a program to print out a even number from 0 to 50
        // Write a program to print out a odd number from 0 to 50

        int oddNumber = 1 ;
        int evenNumber = 0 ;

        System.out.print("Odd Numbers");
        System.out.println();
        while (oddNumber < 50) {

            System.out.print(oddNumber + "-");
            oddNumber += 2;
        }

        System.out.println();
        System.out.println("Even Numbers");

        while (evenNumber <= 50) {

            System.out.print( evenNumber + "-");
            evenNumber += 2;
        }

        System.out.println("***************************************");

        int counter = 0 ;

        while (counter <= 50 ) {

            if ( counter % 2 == 0) {
                System.out.println(counter + " is even number");
            } else {
                System.out.println(counter + " is odd number");
            }
            ++counter;

        }


    }
}
