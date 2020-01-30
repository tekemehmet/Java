package day016;

public class IndexOfWith2Parameters {

    public static void main(String[] args) {

        //String name= "I love Java I love Java Java Java";
       // int howManyChar = name.length();
        //System.out.println("howManyChar = " + howManyChar);

        //get the second Java from the sentence
        // assume you already know there is 4 Java in this sentence
        //second java means---> the Java showed up after first Java

        // fisrt find out where is location of the first java showed up
        // in order to find second one,
        // instead of searching from beginning, search from  right after the location you found first java
        // then it will give you the index of second java

        //BUT HOW DO I START FROM DIFFERENT LOCATION WHEN USING INDEXOF
        // BECAUSE INDEX OF ALWAYS START FROM BEGINNING

        //indexOf method has 2 version 1 expect 1 external data
        // another expect 2 external data

        String name= "I love Java I love Java Java Java";


        System.out.println("starting from 0 " +  name.indexOf("Java") ); //7
        System.out.println("starting from 7 " + name.indexOf( "Java" , 7) ); // 7
        System.out.println("starting from 8 " + name.indexOf( "Java" , 8) ); // 19
        System.out.println("starting from 9 " +  name.indexOf( "Java" , 9) ); // 19
        System.out.println("starting from 19 " +  name.indexOf( "Java" , 19) ); // 19
        System.out.println("starting from 20 " +  name.indexOf( "Java" , 20) ); // 24

        int firstJavaLocation = name.indexOf("Java");// location of first Java in this case ---> 7
        int startingPointToSearchSecondJava = firstJavaLocation + 1;
        int secondJavaLocation = name.indexOf("Java", startingPointToSearchSecondJava);

        System.out.println("secondJavaLocation = " + secondJavaLocation);

        //I do not know how many word in this sentence
        // I just want to know what is the second word
        // the word in between first space and second space is second word

        int firstSpaceLocation = name.indexOf(" ");
        System.out.println("firstSpaceLocation = " + firstSpaceLocation);
        int secondSpace = name.indexOf(" ", firstSpaceLocation + 1 );
        System.out.println("secondSpace = " + secondSpace);

        System.out.println("second word in this sentence: " + name.substring(firstSpaceLocation+1,secondSpace));


    }
}
