package day023;


import java.util.Arrays;

public class StringArrayPractice {

    public static void main(String[] args) {

        String [] shows = { "Orville", "Gifted" , "Game of Throne" , "Flash" , "Arrow", "Super Girl"};

        String myFavoriteShow = shows[0];
        System.out.println("myFavoriteShow = " + myFavoriteShow);

        System.out.println("my favorite show character count is : " + myFavoriteShow.length() );


        int showsCount = shows.length;
        System.out.println("showsCount = " + showsCount);

        for (int x = 0; x < showsCount; x++) {

            System.out.println( shows[x] + "has character count: " +  shows[x].length());

        }


    }
}
