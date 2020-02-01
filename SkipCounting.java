package day017;

public class SkipCounting {

    public static void main(String[] args) {

        // skip counting by 3 from 0 till 30

        int counter = 0 ;

        while ( counter <= 30 ) {

            System.out.print(counter + " ");
            //counter = counter + 3;
            counter += 3 ;
        }



    }
}
