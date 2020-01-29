package day015;

public class SubStringPractice {

    public static void main(String[] args) {

        // getting the part of the String out of another String
        //

        String movie = "Lord Of The Ring";

        // I want to get the String off from this movie

        String wordOff = movie.substring(5,7);
        System.out.println("wordOff = " + wordOff);

        String wordThe = movie.substring(8,11);
        System.out.println("wordThe = " + wordThe);

        // Get the second word!

        int startingPoint = movie.indexOf(" ") + 1;
        int endingPoint = movie.length();

        System.out.println("second word till last : " + movie.substring(startingPoint,endingPoint));

        String secondWordTillLast = movie.substring(5,16);
        System.out.println("secondWordTillLast = " + secondWordTillLast);

        String wordLordOf = movie.substring(0,7);
        System.out.println("wordLordOf = " + wordLordOf);

        String secondToLast = movie.substring(5); // 2.index girilmezse kalan tum string i alir.


    }
}
