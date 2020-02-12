package day026;


public class SplitPractice {

    public static void main(String[] args) {

        // 2 additional String methods related to Array
        // toCharArray() , another is split(bySomething)

        String survey = "Complete B15 Online 1 Month Survey";


        char[] surveyChars = survey.toCharArray();

        //-------------------------------------with FOR EACH LOOP-----------------------
        System.out.println("-------------------with FOR EACH LOOP----------------------");

        for ( char eachChar   : surveyChars) {
            System.out.println("each char is : " + eachChar );
        }

        //-------------------------------------with WHILE LOOP-----------------------
        System.out.println("-------------------with WHILE LOOP----------------------");
        int x=0;
        while (x<surveyChars.length){
            System.out.println("each char is : " + surveyChars[x]);
            x++;
        }

        //-------------------------------------with FOR LOOP-----------------------
        System.out.println("-------------------with FOR LOOP----------------------");

        for (int i = 0; i < surveyChars.length ; i++) {
            System.out.println("each char is : " + surveyChars[i]);

        }

    }
}
