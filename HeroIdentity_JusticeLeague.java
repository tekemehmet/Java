package day029;

public class HeroIdentity_JusticeLeague {

    public static void main(String[] args) {

        String[] allHeros = {"Superman-Clark Kent",
                "Batman-Bruce Wayne",
                "Wonder Woman-Princess Diana",
                "Aquaman-Arthur Orin Curry",
                "Wonder Woman-Princess Diana",
                "Cyborg-Victor Stone",
                "The Flash-Barry Allen ",
                "Green Lantern-Hal Jordan",
                "Green Arrow-Oliver Queen",
                "Atom-Ray Palmer",
                "Hawkman-Carter Hall",
                "Hawkgirl-Shiera Hall",
                "Zantana-Zantana Zatara",
                "Martian Manhunter-John Jones"};

        for ( String eachHero  : allHeros) {

            String hero1 = eachHero;

            String[] heroSlitted = hero1.split("-");

            String heroCode = heroSlitted[0];
            String fullName = heroSlitted[1];

            String stars = "";
            for (int i = 1; i <= fullName.length() ; i++) {
                stars+="*";

            }
            // System.out.println("stars = " + stars);

            String heroX = hero1.replace(fullName,stars);

            System.out.println("hero1 = " + eachHero);
            System.out.println("heroX = " + heroX);


        }

    }
}
