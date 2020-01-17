package day07;

import java.util.Scanner;

public class EmailBuilder {

    public static void main(String[] args) {

        //create 2 String variable for first name, last name, company
        //create another variable for email
        //create email in this format firstName_lastNme@company.com
        //print out the result as, my name is <yourfullname> and I work for <company> and my email is <email>


        Scanner scan = new Scanner(System.in);

        System.out.println("First Name: ");
        String firstName = scan.nextLine();

        System.out.println("Last Name: ");
        String lastName = scan.nextLine();

        System.out.println("Company: ");
        String company = scan.nextLine();

        System.out.println("My name is " + firstName + " "+ lastName + " and I work for " + company + " and my email is " +
                firstName + "_" + lastName +"@" +company+".com");


    }
}
