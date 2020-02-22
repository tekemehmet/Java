package day035;

public class StringToInteger {

    public static void main(String[] args) {

        // I have a employee ID : "FB-457"
        // give me the employee number and store it into a number

        String strNum = "100";
        int num = Integer.parseInt(strNum);
        System.out.println(num);

        String empID = "FB-457";
        /*
        * Integer class is class coming from java.lang package
        *  It is primarily used for wrapping up primitive value and treat it as
        * what we will focus here is though
        * parseInt is a static method of Integer class
        * It will turn a String that has only numbers and return int result
        * if we have any non-numerical character---> It will throw NumberFormatException
         */
////*******THIS IS ONE SHOT EASY AND SIMPLE***************************
        int id = Integer.parseInt( empID.split("-")[1] );
        System.out.println("id = " + id);
        //============================================================
        String[] empIDsplit = empID.split("-");
        String idStr = empIDsplit[1];
        int id1 = Integer.parseInt(idStr);
        System.out.println(id1);

        //**************************************************************//

        // I have two String called num1 and num2
        String num1 = "100";
        String num2 = "200";
        // I want you to add them and give the result

        int sum = Integer.parseInt(num1) + Integer.parseInt(num2);
        System.out.println("sum = " + sum);

        //*********************************************************************

        String twoNumbers = "100,600";
        int numA = Integer.parseInt( twoNumbers.split(",")[0] );
        int numB = Integer.parseInt( twoNumbers.split(",")[1]);

        System.out.println("sum = " + (numA+numB));


    }
}
