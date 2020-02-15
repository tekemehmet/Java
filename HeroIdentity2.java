package day029;

public class HeroIdentity2 {

    public static void main(String[] args) {


        // hide this hero identity
        // String heroX = "Superman-************";

        // given a String with hero code and name seperated by-
        // turn this String into hero code and * with same length as hero name

        // Plain English Logic:

        // split it by - to get the code and full name
        //get the length of full name
        // generate stars with same length as full name
        // concatenate herocode with dash and stars and save it
        String hero1 = "Superman-Clark J Kent";

        String[] heroSlitted = hero1.split("-");

        String heroCode = heroSlitted[0];
        String fullName = heroSlitted[1];


        String stars = "";
        for (int i = 1; i <= fullName.length() ; i++) {
            stars+="*";

        }
        // System.out.println("stars = " + stars);

        String heroX = hero1.replace(fullName,stars);
        System.out.println("heroX = " + heroX);



    }
}
