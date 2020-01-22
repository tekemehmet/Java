package day011;

public class StringEquality {

    public static void main(String[] args) {


        String name = "Rabia";

        String name2  = new String("Rabia"); // Diger string den bir farki yok

        String name3 = "Rabia";


        System.out.println(name);
        System.out.println(name2);
        System.out.println("USING == METHODS");
        System.out.println( name==name2 );
        System.out.println( name == name3);

        // The correct way of comparing String to get consistent result is using one of
        // the String object behaviour/method called
        //equals method
        //str1.equals(str2)

        System.out.println("USING EQUAL METHODS");
        System.out.println( name.equals(name));
        System.out.println( name.equals(name3));


    }
}
