package day014;

public class EmailChecker {

    public static void main(String[] args) {

        //create a variable called email
        //check for below conditions
        //if it does not contain character @  say invalid email
        //if it contain space say invalid email
        //if it endsWith @gmail.com  -->> gmail
        //if it endsWith @yahoo.com  -->> yahoo email
        //if it endsWith @mail.ru  -->> russian email

        String email= "tekemehmet@yahoo.com";

        boolean notContainAt =  ! email.contains("@");

        boolean containSpace = email.contains(" ");


        if (notContainAt || containSpace ) {
            System.out.println("INVALID MAIL");
        } else if (email.endsWith("@gmail.com")) {
            System.out.println("gmail");

        } else if (email.endsWith("@yahoo.com")) {
            System.out.println("yahoo");
        } else if  (email.endsWith("@mail.ru")) {
            System.out.println("Russian email");
        }



    }
}
