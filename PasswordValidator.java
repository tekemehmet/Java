package day014;

public class PasswordValidator {

    public static void main(String[] args) {

        // PASSWORD VALIDATOR
        // MINIMUM 8 CHAR MAX 16 CHAR
        // IT MUST CONTAINS _ OR $
        //IT MUST NOT CONTAIN SPACE
        // IT MUST START Ab

        // if any of above condition does not match say INVALID PASSWORD
        // else say GOOD PASSWORD

        String password = "AbG6464_13dgd";

        // password.length() >=8 && password.length() <= 16
        boolean min8max16 = password.length() >= 8 && password.length() <=16;

        // IT MUST CONTAINS _ OR $
        // password.caontains("_") || password.contains("$")
        boolean mustContains_or$ = password.contains("_") || password.contains("$");

        // IT MUST NOT CONTAINS SPACE
        // ! password.contains(" ")
        boolean mustNotContainsSpace = ! password.contains(" ");
        // IT MUST START Ab
        // password.startsWith("Ab")

        if (min8max16 && mustContains_or$ && mustNotContainsSpace) {
            System.out.println("VALID PASSWORD");
        } else {
            System.out.println("INVALID PASSWORD");
        }





    }
}
