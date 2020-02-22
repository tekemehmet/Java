package day035;

public class ParcingPractice {

    public static void main(String[] args) {

        String sentence = "I bought 3 tomato and the price was 3.14 each";
        // How much is your final checkout price
        // The count is always 3rd word
        // The price is always at 2nd word from the last


        String[] allWords = sentence.split(" ");

        int item = Integer.parseInt( allWords[2]);

        double price = Double.parseDouble(allWords[allWords.length-2]);

        double sum = item*price;

        System.out.println("sum = " + sum);



    }
}
