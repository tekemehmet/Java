package day021;

public class BreakInTheStringWithLoop {

    public static void main(String[] args) {

        String name = "Mehmet Teke";
        int nameLength = name.length();


        for (int x = 0; x < nameLength; x++) {
            char currentChar = name.charAt(x);
            System.out.println(currentChar);

            if (currentChar == 't') {
                System.out.println("Found it");
                break;
            }

            for (int i = 0; x < nameLength; i++) {
                String currentLetter = name.substring(i, i + 1);
                System.out.println("currentLetter = " + currentLetter);

                if (currentLetter.equals("t")) {
                    System.out.println("FOUND IT!!");
                    break;

                }

            }
        }
    }
}