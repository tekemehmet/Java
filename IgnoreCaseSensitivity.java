package day012;

public class IgnoreCaseSensitivity {

    public static void main(String[] args) {

        String name = "Mehmet";

        boolean ignoreCase = name.equalsIgnoreCase("MEHMET");
        System.out.println(ignoreCase);

    }
}
