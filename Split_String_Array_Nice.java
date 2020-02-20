package day033;

public class Split_String_Array_Nice {

    public static void main(String[] args) {

        String fullName = "Mehmet Teke";

        String part1 = fullName.split(" ")[0];
        String part2 = fullName.split(" ")[1];

        String hisEmail = buildGotEmail(part1,part2);
        System.out.println("hisEmail = " + hisEmail);
    }

    public static String buildGotEmail(String firstName, String lastName) {

        String newMail = firstName.substring(0,1)+lastName+"@NightWatch";
        return newMail;
    }
}



