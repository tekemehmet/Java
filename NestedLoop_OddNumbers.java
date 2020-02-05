package day021;

public class NestedLoop_OddNumbers {

    public static void main(String[] args) {

        for (int i = 1; i <=4 ; i++) {
            System.out.println("Iteration Numbers: " + i);


                for (int j = 1; j <= 10 ; j++) {
                    if( j % 2 != 0) {
                        System.out.print(j + " ");

                }
            }
            System.out.println();
        }
    }
}
