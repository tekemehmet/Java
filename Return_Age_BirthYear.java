package day033;

public class Return_Age_BirthYear {

    public static void main(String[] args) {

        System.out.println("Age " + AgeCalculator(1980));

        // optionally : test your code against array of birthYears
        //{1999,122,2019, 1987, 1978,1964,3999, 2004}

        int[] years = {1999, 122, 2019, 1987, 1978, 1964, 3999, 2004};

        for (int i = 0; i < years.length; i++) {

            System.out.println("age: " + AgeCalculator(years[i]));

        }

    }

    public static int AgeCalculator(int birthYear) {

        if (birthYear < 1900 || birthYear > 2020) {
            return 0;


        }
        return 2019 - birthYear;
    }
}