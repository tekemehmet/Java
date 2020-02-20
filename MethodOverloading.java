package day034;

public class MethodOverloading {

    public static void main(String[] args) {

        System.out.println("Method Overloading");
        System.out.println(12);

        String name = "overloading";
        System.out.println( name.substring(6) );
        System.out.println( name.substring(1,4) );
        // two version of indexOf method (there are 4)
        System.out.println( name.indexOf("di")  );
        System.out.println( name.indexOf("o",2)  );

        // Method Overloading
        // using same name and different parameter for methods
        // to reuse the name for similar actions
        sayHello();
        sayHello("Mehmet");
        sayHello("Denis");
        sayHello(2020);

        String result = sayHello("Mehmet" , "teke");
        System.out.println(result);


    }

    public static void sayHello() {
        System.out.println("Hello, World");
    }

    public static void sayHello(String name){

        System.out.println("Hello, " + name);
    }

    public static void sayHello(int num){
        System.out.println("Hello " + num);
    }
    public static String sayHello(String firstName, String lastName){

        return "Hello " + firstName + " " + lastName;
    }



}
