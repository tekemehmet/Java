package day032;

public class StringActions {

    public static void main(String[] args) {

    reversePrintMyOwnName();

        System.out.println();

    printStringWithDashInBetween("Hasan");
    printStringWithDashInBetween("Mehmet");
    printStringWithDashInBetween("Abraham");



    }
    // print each and every character of a String with dash in between
    // excluding tha last one Akbar  --->  A-k-b-a-r
    // logic : keep adding - after each character
    // when it comes to last character dont add it

    public static void printStringWithDashInBetween(String name){
        for (int i = 0; i < name.length() ; i++) {
            System.out.print(name.charAt(i));
            if ( i != name.length()-1){
                System.out.print("-");
            }

        }
        System.out.println();


    }


    /*
    * reversePrintMyOwnName
    *  create a method that has no paramter
    * and print your name in reversed order
     */
    public static void reversePrintMyOwnName(){
        
        String name = "Mehmet";
        // start form last character index and print toward to first character
        for (int i = name.length()-1; i >=0 ; i--) {

            System.out.print( name.charAt(i) );
            
        }
        
    }



}
