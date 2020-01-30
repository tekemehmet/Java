package day016;


public class SecondWordGetter {

    public static void main(String[] args) {

        // given a sentence with 3 words
        // get the second word

        //second word is between first space and last space
        //getting location of space remind me of indexOf
        //getting string inside another string by beginning and ending index
        //remind me of substring


        String sentence = "I love Java";
        String secondWord ;
        int firstSpaceIndex = sentence.indexOf((" "));
        System.out.println("firstSpaceIndex = " + firstSpaceIndex);

        int lastSpaceIndex = sentence.lastIndexOf(" ");
        System.out.println("lastSpaceIndex = " + lastSpaceIndex);

        System.out.println( sentence.substring(2,6));
        secondWord = sentence.substring(firstSpaceIndex+1 , lastSpaceIndex);
        System.out.println("secondWord = " + secondWord);

       // First Word
        System.out.println(sentence.substring(0,firstSpaceIndex));;

        // Last Word
        String lastWord = sentence.substring(lastSpaceIndex + 1 );
        System.out.println("lastWord = " + lastWord);


    }
}
