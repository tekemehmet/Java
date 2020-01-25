package day013;

public class MoreStringPractice {

    public static void main(String[] args) {

        String name = "Pumpkin";
        System.out.println( name );

        //name = "Cat";
        //System.out.println(name);

        name.toUpperCase();
        System.out.println(name); //Pumpkin

        System.out.println(name.toUpperCase()); //PUMPKIN

        //What IF I REALLY WANT TO CHANGE THE NAME

        name=name.toUpperCase();
        System.out.println(name); // PUMPKIN

    }
}
