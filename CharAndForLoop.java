package day019;

public class CharAndForLoop {

    public static void main(String[] args) {

//        //
//        int x = 'A';  // A nin ASCII tablosundaki sayisal degerini verir
//        char myChar = 100; // 100 un karsiligi olan karakteri verir
//
//        System.out.println(x);

        // System.out.println('A' > 'B'); // 65 >66

        for (char myChar = 'A'; myChar <= 'Z' ; myChar++) {
            System.out.print(myChar + " ");

        }
        System.out.println();

        // Z to A

        for ( char kChar = 'Z';  kChar>='A'; kChar--){
            System.out.print(kChar + " " );
        }
// CREATE AN INTERACTIVE PROGRAM TO ASK USER
        // STARTING CHARACTER AND ENDING CHARACTER
        //THEN PRINT EVERYTHING IN BETWEEN
        //IT COULD BE STARTING CHARACTER IS AFTER ENDING CHARACTER
        // FOR EXAMPLE USER CAN ENTER Z A OR A K
        //ASKU USER FOR STRING AND PICK FIRST CHARACTER

    }
}
