package day025;

import java.util.Arrays;

public class FindLongestWordInASentence {

    public static void main(String[] args) {


        String sentence = "We are trying to find longest word";
        //String sentence = " lava java kava ";

        String[] splitSentence = sentence.split(" "); // " "

        System.out.println(Arrays.toString(splitSentence)); // [We, are, trying, to, find, longest, word]

        String longestWord = " ";
        int maxCharCount = 0;

        for ( String currentWord : splitSentence) {

            if (currentWord.length() > longestWord.length() ) {
                longestWord = currentWord;
            }
        }
        System.out.println("longestWord = " + longestWord);

    }
}