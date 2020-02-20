package day033;

public class buildGotMail{

//    //**
//     * build_GOT_Email
//     * This method should build email using user's first and last name
//     * for example Jon Snow --->> JSnow@NightWatch.com
//     * param first name last name  user's last name
//     * return the email created using
//     * firstName initial+lastname+@NightWatch.com
//     */

    public static void main(String[] args) {

        System.out.println("gotEmail = " + buildGotEmail("jon","snow"));

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
