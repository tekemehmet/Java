package day023;

public class ForEachLoopPractice {

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

        long[] Salary = {120000, 90000 , 55000, 110000, 99000};

        for (long eachSalary : Salary) {
            if (eachSalary > 100000) {
                System.out.println(eachSalary);

            }


            }

        }

    }

