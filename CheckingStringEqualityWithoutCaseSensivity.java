package day012;

public class CheckingStringEqualityWithoutCaseSensivity {

    public static void main(String[] args) {

        String username = "abc123";
        boolean userNameCorrect = username.equals("ABC123");

        System.out.println(userNameCorrect);

        boolean userNameCorrect2 = username.equalsIgnoreCase("ABC123");

        System.out.println(userNameCorrect2);

    }


}
