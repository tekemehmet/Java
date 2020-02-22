package day035;

public class CharacterPractice {

    public static void main(String[] args) {

        // Character class has lots of static methods
        // to perform actions on char values
        // isDigit, isLetter, isLetterOrDigit, isUpperCase , isLowerCase, toUpperCase, toLowerCase

        System.out.println("IS DIGIT METHOD PRACTICE ");
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit(' '));
        System.out.println(Character.isDigit('6'));

        String str = "A34B123C4X";
        // Get the number out of this String
        // and store in into Integer variable num;

        String numsInStr = "";
        for (int x = 0; x < str.length(); x++) {
           // System.out.println("str.charAt("+x+")= " + str.charAt(x));

            if(Character.isDigit(  str.charAt(x)  )){
                System.out.println("str.charAt("+x+")= " + str.charAt(x));
                numsInStr += str.charAt(x);
            }
        }
        System.out.println("numsInStr : " + numsInStr);

        Integer num = Integer.valueOf(numsInStr);
        System.out.println("num = " + num);

        //ADDITIONALLY GET THE SUM OF THE NUMBERS INSIDE A STRING
        // OPTIONALLY MAKE IT A METHOD


    }

    }


