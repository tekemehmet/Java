package day021;

public class SkipAll5s {

    public static void main(String[] args) {

        // count 1 to 100
        // skip all the numbers divisible by 5

        // x % 5 == 0

        for (int x = 0; x <= 100; x++) {

            if ( x % 5 ==0) {
                System.out.println("SKIPPING via CONTINUE " +x );
             continue;
            }
            System.out.println(x);
        }

        for (int x = 0; x <=100; x++) {
            if(x % 5 !=0){
                System.out.println(x);
            } else {
                System.out.println("SKIPPING via IF-ELSE " + x);
            }

        }



    }


}
