package day022;

public class MultiplicationTable_NestedLoop {

    public static void main(String[] args) {

        for (int timesTable = 1; timesTable <= 10; timesTable++) {

            System.out.println("Multiplication Table of " + timesTable);

            for (int base = 1; base <= 10; base++) {
                System.out.println(timesTable + " x " + base + " = " + timesTable * base);
            }

        }

    }
}
