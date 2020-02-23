package day036;

public class MethodWithWrapperTypes {

    public static void main(String[] args) {

        Integer i1 = 10;
        Integer i2 = 15;

        sumAndPrint(i1,i2);

        sumAndPrint(10,20);

        System.out.println("-----------method with int parameter--------------");
        printTheDoubledValue(i1);
        printTheDoubledValue(10);

    }

    /*
    * THis method add 2 Integer numbers and print
    * num1 type Integer, first number to add
    * num2 type Integer, second number to add

     */

    public static void sumAndPrint(Integer num1, Integer num2){

        System.out.println( num1 + num2 );

    }

    public static void printTheDoubledValue(int x){
        System.out.println("after doubling x = " + (x*2) );
    }


}
