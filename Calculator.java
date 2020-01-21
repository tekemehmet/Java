package day010;

public class Calculator {

    public static void main(String[] args) {

        // Create a variable called operator with type char
        //Assign the value for one of these 4 : +-*/
        // Use switch statement to do following logic

        //if the operator is + print you are about to add numbers
        //if the operator is - print you are about to subtract numbers
        //if the operator is * print you are about to multiply numbers
        //if the operator is / print you are about to divide numbers

        //if nothing match print invalid operator

        // USE Switch statement to complete this task

        char operator = '+';

        switch (operator) {
            case '+':
                System.out.println("You are about to add numbers");
                break;
            case '-':
                System.out.println("You are about to subtract numbers");

                break;
            case '*':
                System.out.println("You are about to multiply numbers");
                break;
            case '/':
                System.out.println("You are about to divide numbers");
                break;
            default:
                System.out.println("match print invalid operator");
                break;
        }
    }
}