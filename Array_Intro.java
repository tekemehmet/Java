package day022;

public class Array_Intro {

    public static void main(String[] args) {

        // syntax for creating variable and assigning value
        // dataType variableName = value here
        int num1 = 10;

        // syntax for creating variable to store multiple items
        // and assigning a values
        // dataType [] variable name = new dataType [count of item ];
        // this array can hold 4 items. it is also known as array size

        int[] scores = new int[4];

        scores[0] = 95 ;
        scores[1] = 70 ;
        scores[2] = 88 ;
        scores[3] = 100;

        System.out.println(  scores[0] );
        System.out.println(  scores[1] );
        System.out.println(  scores[2] );
        System.out.println(  scores[3] );

        //updating the value at certain index
        scores[1] = 99;
        System.out.println(scores[1] );

        //Once array is created with certain size, we CAN NOT CHANGE THE SIZE !!!

        // When you create new Array Object
        // it will get default value in each element
        int[] numbers = new int[3];
        System.out.println(numbers[0]); // 0
        System.out.println(numbers[1]); // 0
        System.out.println(numbers[2]); // 0


        // create an byte array with size 4
        // and store it into a variable called data

        // store assign value for each index location
        // print out the values at each index

        // update last index value
        // then print out

        byte [] data = new byte[4];
        data[0] = 10;
        data[1] = 15;
        data[2] = 20;
        data[3] = 25;

        System.out.println( data[0]);
        System.out.println( data[1]);
        System.out.println( data[2]);
        System.out.println( data[3]);

        data[3] = 30;
        System.out.println(data[3]);



    }
}
