package day021;

public class LoopControlStatement {

    public static void main(String[] args) {

        // break
        // if line contains break reaches the loop will stop

        // continue
        //if line contains break reaches the loop will skip to next iteration

        // WE CAN USE BREAK AND CONTINUE FOR ANY TYPE OF LOOP

//        for (int i = 0; i <=10 ; i++) {
//            System.out.println(i);
//
//        }

        for (int i = 0; i <=10 ; i++) {
            System.out.println(i);
            if(i==5) {
                break;
            }

        }

        int sum = 0 ;

        for (int x = 0; x <=10 ; x++) {
            System.out.println("current sum is " + sum);
            System.out.println("If I add " + x + " dollar, it would be " + (sum+x) );

            //sum = sum + x;

            if (sum + x > 40) {
                break;

            } else {

                sum = sum + x;
            }


        }
        System.out.println("sum = " + sum);
    }
}
