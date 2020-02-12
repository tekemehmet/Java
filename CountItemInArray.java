package day026;

import java.util.Arrays;

public class CountItemInArray {

    public static void main(String[] args) {

        String[] marvelHeros ={"Iron Man", "Captain America", "Spider man",
                "Black Panther", "Hulk", "Black Widow", "Wanda", "Captain Marvel",
                "Captain America", "Spider man",
                "Black Widow", "Wanda", "Captain Marvel",
                "Captain America"};

        System.out.println("Marvel Heros = " + Arrays.toString(marvelHeros));
        int sizeOfArray = marvelHeros.length;
        System.out.println("Hero count = " + sizeOfArray);

        String itemToSearch = "Captain America";
        int countOfItem = 0;

        for ( String eachHero   : marvelHeros) {

            if (eachHero.equals(itemToSearch) ){

                countOfItem++;
            }
        }

        int cntBlackInName =0;
        for ( String eachHero : marvelHeros) {
            if (eachHero.toLowerCase().contains("black")) {
                cntBlackInName++;
            }
        }


        System.out.println("cntBlackInName = " + cntBlackInName);
        System.out.println("countOfItem = " + countOfItem);




    }
}
