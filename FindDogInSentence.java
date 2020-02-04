package day020;

public class FindDogInSentence {

    public static void main(String[] args) {

        //given sentence, find out the location of the dog
        //our approach is
        //doing through the sentence 3 character at a time
        // then if 3 characters happen to be a dog, we print out the index


        String msg = "I like Dog, Dogs are Cute, Dogs are friendly";
        int lastCharIndex = msg.length()-1;

        for (int x = 0; x<=lastCharIndex-2 ; x++){

            String current3Chars = msg.substring(x,x+3);

            //System.out.println(x+ " : " + current3Chars);
            if (current3Chars.equals("Dog")) {
                System.out.println("Bingo At " + x);
            }

        }



    }
}
