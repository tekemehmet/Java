package day032;

public class CharacterActions {

    public static void main(String[] args) {

        printAtoZ();

        printZtoA();

        printAlphabetInRange('a','f');
        printAlphabetInRange('G','B');

    }

    public static void printAlphabetInRange( char beginning, char ending){

        if(beginning < ending) {
            System.out.println("WE NEED TO INCREMENT FROM " + beginning + " till " + ending);

            for (char iChar = beginning; iChar <=ending ; iChar++) {
                System.out.print(iChar + " ");

            }
            System.out.println();

        } else if ( beginning> ending){
            System.out.println("WE NEED TO DECREMENT FROM " + beginning + " till " + ending);

            for (char iChar = beginning; iChar >=ending ; iChar-- ) {
                System.out.print(iChar + " ");

            }
            System.out.println();

        } else {
            System.out.println("SAME CHARACTER");
        }

    }



    /* print A-Z
    create a method that has no paramter
     */
    public static void printAtoZ(){

        for (char iChar = 'A'; iChar <='Z' ; iChar++) {
            System.out.print(iChar+" ");

        }
        System.out.println();
    }

    public static void printZtoA(){
        for (char iChar = 'Z'; iChar >='A' ; iChar--) {
            System.out.print(iChar+" ");

        }
        System.out.println();


    }


}
