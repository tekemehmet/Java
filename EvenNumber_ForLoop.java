package day018;

public class EvenNumber_ForLoop {

    public static void main(String[] args) {

        for ( int i = 0; i < 100; i+=2){

            System.out.print(i + " ");
        }
        System.out.println("****************************************");
        System.out.println(" ");
        for (int i = 0; i <100 ; i++) {
            if( i % 2 == 0){
                System.out.print(i+" ");
            }
        }

        for (int i = 0; i < 100 ; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println(i+" is Fizz Buzz Number");
            }

        }
    }
}
