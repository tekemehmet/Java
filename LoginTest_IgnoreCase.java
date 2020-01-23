package day012;

import java.util.Scanner;

public class LoginTest_IgnoreCase {

    //// your correct username password is  user123  and pass123
    //   Check if your username and password correct
    //  If so print login successful
    //  If not
    //     Check whether your username correct
    //	 if not print  , username is not correct
    //   Check your password is correct or not
    //      If not print password is not correct

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("User Name:");
        String userName = scan.next();
        System.out.println("Password:");
        String password = scan.next();

        if (userName.equalsIgnoreCase("user123") && password.equalsIgnoreCase("pass123") ) {
            System.out.println("Login Succesfull");
        } else if (! userName.equalsIgnoreCase("user123") && password.equalsIgnoreCase("pass123") ) {
            System.out.println("Username is not Correct");
        } else if (userName.equalsIgnoreCase("user123") && ! password.equalsIgnoreCase("pass123")) {
            System.out.println("Password is not Correct");
        } else if (! userName.equalsIgnoreCase("user123") && ! password.equalsIgnoreCase("pass123") ) {
            System.out.println("User name and Password is not correct");
        }

    }
}
