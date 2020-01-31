package day017;

public class FullNameCorrector {

    public static void main(String[] args) {

        String fullnName = "arYa sTarK";

        String firstName = fullnName.substring(0,4);
        String lastName = fullnName.substring(5);

        String firsNameCorrected = firstName.toUpperCase().substring(0,1) + firstName.toLowerCase().substring(1);
        String lasNameCorrected = lastName.toUpperCase().substring(0,1) + lastName.toLowerCase().substring(1);

        System.out.println("Corrected Full Name: " + firsNameCorrected + " " +  lasNameCorrected);



    }
}
