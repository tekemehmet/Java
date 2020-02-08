package day022;

public class LoopControlStatement {

    public static void main(String[] args) {

        // Store this sentence in a variable msg
        //I struggle with Java I Like Java I love Java Everything is Awesome!
        //loop through each and every letter
        //1, print every other letter
        // meaning : skip a letter each time you go through the letter
        //	0123456789
        //	I struggle with  -->> Isrgl ih
        //	USE CONTINUE FOR THIS TASK
        //2,  when you reach letter a break the loop
        //OPTIONALLY ; BREAK WHEN YOU SEE 3RD A case insensitive

        String msg = "I struggle with Java I like Java I love Java Everything is Awesome!";

        for (int index = 0; index < msg.length(); index++) {
            if (index % 2 == 1) {
                continue;

            }
            System.out.print(msg.charAt(index) + "-");
        }

        // TASK 2

        for (int idx = 0; idx < msg.length(); idx++) {

            String currentChar = msg.substring(idx, idx + 1);

            if (currentChar.equalsIgnoreCase("a")) {
                break;
            }
            System.out.println("currentChar = " + currentChar);

        }
        // TASK 1 and 2 Combine

        for (int idx = 0; idx < msg.length(); idx++) {

            if (idx % 2 == 1) {
                continue;
            }


            String currentChar = msg.substring(idx, idx + 1);

            if (currentChar.equalsIgnoreCase("j")) {
                break;
            }
            System.out.println(idx + " index " + "currentChar = " + currentChar);


        }

    }
}