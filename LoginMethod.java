package day034;


public class LoginMethod {

    // loginVoid :  static void method
    //	it has two String method paramters
    //			called username and password
    //	(it accept 2 String object as argument when being called)
    //	it check whther username and password  "user" and "abc123"
    //	if yes
    //		print login successful
    //	else
    //		print login failed (OPTIONALLY FIND EXACTLY WHY FAILED)

    public static void main(String[] args) {

        loginVoid("user", "abc123");

        boolean result = loginReturn("user", "abc123");
        System.out.println("result " + result);

        System.out.println(loginReturn("user", "abc123"));

        if (loginReturn("user", "abc123")) {
            System.out.println("Add Java Book to cart");
            System.out.println("Pay for Java book in Cart");
            System.out.println("View the order");

        } else {
            System.out.println("No Shopping");
        }
    }

    public static void loginVoid(String userName, String passWord) {

        if (userName.equals("user") && passWord.equals("abc123")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Failed");
        }

    }

    // // loginReturn :  static method boolean return type
    //    //	it has two String method paramters
    //    //			called username and password
    //    //	(it accept 2 String object as argument when being called)
    //    //	it check whther username and password  "user" and "abc123"
    //    //	if yes
    //    //		return true
    //    //	else
    //    //		return false

    public static boolean loginReturn(String userName, String passWord){
//
//        if (userName.equals("user") && passWord.equals("abc123")) {
//            return true;
//        } else {
//            System.out.println("Failed");
//        } return false;
    return userName.equals("user") && passWord.equals("abc123");
    }

    }

