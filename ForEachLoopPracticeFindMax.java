package day023;

public class ForEachLoopPracticeFindMax {

    public static void main(String[] args) {

        /*
         * create a long array or 5 items called salaries
         * put your salary amounts that ok for your offer
         *
         * use for each loop to iterate over them
         * and print them out
         *
         * optionally
         * print only the salary more than 100000
         */

        long[] Salary = {50000, 90000, 55000, 110000, 99000};

        // I need to pick up an item from this array so I can compare with other items
        // since first one is right there, I just decided to pick it up
        // and make it temporarily the max value
        // can I pick 2nd or 3rd instead---> Yes You Can
        long maxSalary = Salary[0];
        for ( long salary : Salary ) {
            if ( salary > maxSalary ){

                maxSalary = salary;
            }

        }
        System.out.println("maxSalary = " + maxSalary);
    }
}