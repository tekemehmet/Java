package day027;

public class Multi_D_ArrayTask_Min_Number {

    public static void main(String[] args) {

        int[][] numbers = {{12, 11, 10, 19}, {19, 20, 15}};

        int min = numbers[0][0]; // initial element
//-------------------------FOR LOOP---------------------------------
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if( min >numbers[i][j]) {
                    min = numbers[i][j];
                }
            }
        }
        System.out.println(min);


    }


}
