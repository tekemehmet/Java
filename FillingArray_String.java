package day029;

import javax.print.DocFlavor;
import java.util.Arrays;

public class FillingArray_String {

    public static void main(String[] args) {

    //    Create an array with size 300 and fill it up with I Love Java


        String[] name = new String[300];

        name[0] = "I love Java";

        for (int i = 0; i < name.length ; i++) {
            name[i]= (i+1)+".I love Java";

        }
        System.out.println(Arrays.toString(name));

        //=================================================================================//

        String str = new String("ABC"); // THIS IS STRING OBJECT WITH VALUE ABC

        String[] strArr = new String[5]; //EMPTY STRING ARRAY WITH CAPACITY 5

        strArr[0] = " I love Java";
        strArr[1] = " I love Java";
        strArr[2] = " I love Java";
        strArr[3] = " I love Java";
        strArr[4] = " I love Java";

        System.out.println(Arrays.toString(strArr));


    }
}
