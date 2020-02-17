package day032;

public class MethodWithReturnIntro {

    public static void main(String[] args) {

    String name = giveMeMyName();
    System.out.println("name = " + name);

    int myResult = doubleTheNumber(10);
        System.out.println("My Result is : " + myResult);

        System.out.println("result of doubling 100 is " + doubleTheNumber(100));

        System.out.println(add2Numbers(10,50));

        int sum = add2Numbers(10,50);
        System.out.println("Sum : " + sum);



    }

    // create a method called add, accept 2 int parameter
    // and return the result as int

    public static int add2Numbers(int num1, int num2) {
        // int sum = num1+num2;
        //return sum;
        return num1 + num2;
    }





    // create a static method that double the value of a number
    // it accept one int parameter and return doubled value of that number
    public static int doubleTheNumber ( int num){

        System.out.println("I am going to double the value of " + num );
        int result = num * 2;
        return result;

    }




    // I want to create a method called giveMeMyName
    // it returns your name as a result
    public static String giveMeMyName() {
        //assume getting my name
        // is multi steps complex operations
        return "Akbar";
    }

}
