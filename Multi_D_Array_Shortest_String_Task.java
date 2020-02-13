package day027;

public class Multi_D_Array_Shortest_String_Task {

    public static void main(String[] args) {


        String[] developersTeam = {"Vladislav", "Hasan", "Tolkun", "Abide"};
        String[] testerTeam = {"Zhibekchach", "Mohammed Sohrabi", " Hasan Mammadow"};
        String[] businessAnalystTeam = { "Lisa" , "Ershad" , "Naila "};

        String [][] scrumTeam = { developersTeam , testerTeam , businessAnalystTeam  };

        int minLength = scrumTeam[0][0].length();
        String shortestString = " ";

        for ( String[] each1DArray  : scrumTeam  ) {
            for (String eachElement   : each1DArray  ) {

                if( minLength> eachElement.length()) {
                    minLength = eachElement.length();
                    shortestString = eachElement;
                }
            }
        }
        System.out.println(minLength);
        System.out.println(shortestString);

        for ( String[] each1DArray  : scrumTeam  ) {
            for (String eachElement   : each1DArray  ) {

                if(minLength == eachElement.length()) {
                    System.out.println(eachElement);
                }
            }
        }
        System.out.println("===================FOR LOOP===========================");

//---------------------FOR LOOP----------------------------------
        for (int i = 0; i < scrumTeam.length; i++) {
            for (int j = 0; j < scrumTeam[i].length; j++) {
                if (minLength > scrumTeam[i][j].length()){
                    minLength = scrumTeam[i][j].length();
                    shortestString = scrumTeam[i][j];
                }

            }

        }
        System.out.println(minLength);
        System.out.println(shortestString);
    }
}