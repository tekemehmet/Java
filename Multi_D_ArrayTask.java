package day027;

public class Multi_D_ArrayTask {

    public static void main(String[] args) {

        int[][] numbers = {{12, 11, 10, 19}, {19, 20, 15}};

        int max = numbers[0][0]; // initial element

        for (int i = 0; i < numbers.length; i++) {  // check each single dimensional array
            for (int j = 0; j < numbers[i].length; j++) { // check each elements in the single dimension
                if (max < numbers[i][j]) {
                    max = numbers[i][j];
                }
            }
        }

        System.out.println(max);

        // Solution 2-------------FOR EACH LOOP------------------------------------------
        int max2 = numbers[0][0];
        for (int[] each1DArray : numbers) {
            for (int eachInt : each1DArray) {
                if (max2 < eachInt) {
                    max2 = eachInt;

                }
            }
        }
        System.out.println(max2);

        //----------- finding Minimum Number--------------------------------------










    }


}
