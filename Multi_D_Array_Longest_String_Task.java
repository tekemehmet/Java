package day027;

public class Multi_D_Array_Longest_String_Task {

    public static void main(String[] args) {


        String[] developersTeam = {"Vladislav", "Hasan", "Tolkun", "Abide"};
        String[] testerTeam = {"Zhibekchach", "Mohammed Sohrabi", " Hasan Mammadow"};
        String[] businessAnalystTeam = { "Lisa" , "Ershad" , "Naila "};

        String [][] scrumTeam = { developersTeam , testerTeam , businessAnalystTeam  };

        int maxLength = scrumTeam[0][0].length();
        String longestString = " ";

        for ( String[] each1DArray  : scrumTeam  ) {
            for (String eachElement   : each1DArray  ) {

                if(maxLength < eachElement.length()) {
                    maxLength = eachElement.length();
                    longestString = eachElement;
                }
            }
        }
        System.out.println(maxLength);
        System.out.println(longestString);

        for ( String[] each1DArray  : scrumTeam  ) {
            for (String eachElement   : each1DArray  ) {

                if(maxLength == eachElement.length()) {
                    System.out.println(eachElement);
                }
            }
        }



    }
}