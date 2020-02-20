package day034;

public class ReturnPractice {

    public static void main(String[] args) {

        // what is return keyword is used
        //
        // break VS return
        // break ---> loop : break out of the loop
            // -----> switch : break out of the case
            // -----> can we use it to exit method ? NOOO!!

        // return ---> inside a method
        // return the value out of a method with return type
        // the moment the return keyword is reached it will terminate the method
        // Can it be used in void method ??
        // Yes BUT ONLY IN THIS WAY : return;
        // what is the benefit of using in void method
        printMin4CharacterLengthName("Jon");
        printMin4CharacterLengthName("Mehmet");



    }

    public static void printMin4CharacterLengthName(String name) {

        if( name.length() < 4 ){
            System.out.println("INVALID NAME");
            return; // this return is being used to get out of the method early

        }

        System.out.println(name);

    }


}
