package day031;

public class MethodIntro {

    public static void main(String[] args) {

        // two ways to call static methods
        //ClassName.methodName(external data if needed)
        // if you are in same class
        //you can directly called them
        // methodName(external data if needed)

      MethodIntro.sayHello(); // optional if you are in same class

         sayHello();


    }

    // DO NOT CREATE A METHOD INSIDE MAIN METHOD
    public static void sayHello() {

        System.out.println("Hello World ");
        System.out.println("My name is Mehmet ");
        System.out.println("I love Java ");


    }





}
