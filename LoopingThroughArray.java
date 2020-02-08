package day022;

public class LoopingThroughArray {

    public static void main(String[] args) {

        int[] scores = new int[4];

        scores[0] = 95 ;
        scores[1] = 70 ;
        scores[2] = 88 ;
        scores[3] = 100;

//        System.out.println(  scores[0] );
//        System.out.println(  scores[1] );
//        System.out.println(  scores[2] );
//        System.out.println(  scores[3] );

        //how do we get the size of any array object
        // array object has a property called length

        int itemCount = scores.length; // No parenthesis in the length
        System.out.println(itemCount);

        for (int x = 0; x < itemCount; x++) {

            System.out.print(scores[x] + " ");
        }
        System.out.println();

        for (int y = itemCount-1 ; y >= 0; y--) {  // REVERSED ORDER

            System.out.print(scores[y] + " ");
        }





        // how do we get char count of a String
        String name ="Jon Snow";
        int charCount = name.length();



    }
}
