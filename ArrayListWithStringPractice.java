package day037;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListWithStringPractice {
    public static void main(String[] args) {

        List<String> superHeros = new ArrayList<>();
        superHeros.add("Superman");
        superHeros.add("Batman");
        superHeros.add("Cyborg");
        superHeros.add("Flash");
        superHeros.add("Aquaman");
        superHeros.add("Wonder Woman");



        System.out.println("superHeros = " + superHeros);
        // Do we have superman in the list ?
        System.out.println(superHeros.contains("Superman")); // true

        //does this list contains an item with exact value of "man"
        System.out.println(superHeros.contains("man")); // false

        // remove any heros that does not have man in the String
        for (int x = 0; x < superHeros.size(); x++) {
            String currentHero = superHeros.get(x);
            if(! currentHero.contains("man")){
                superHeros.remove(currentHero);
                // once hero is removed, this index will be filled by next item
                // so we need to decrease the index by 1 so stay at same index
               --x; // once item is removed , it will decrease the index to stay at same index in next iteration


            }

        }
        System.out.println("superHeros Man = " + superHeros);

        // take away from here :
        //  removing item during the for loop
        //  when you remove 1 item , you will have one less item in the list
        //  everything after the removed item will move to one index to the left
        //  so in order not to miss the item right after the removed item
        //  we need to decrease the index by one to stay at same index after removing

        List<String> superHeroCopy = new ArrayList<>( superHeros);
        System.out.println("superHeroCopy = " + superHeroCopy);

//      THIS WILL CREATE A UNMODIFIABLE LIST!!!
        List<String> topics = Arrays.asList("Java","Selenium","Database","API");
        System.out.println("topics = " + topics);

        //And it is just regular arraylist, we can do anything
        List<String> topicsCopy = new ArrayList<>( topics );
        System.out.println("topicsCopy = " + topicsCopy);




    }
}
