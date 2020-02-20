package day033;

public class SpelledNameReturn {

    public static void main(String[] args) {
       String nameSpelled =  getSpelledName2("Mehmet");
        System.out.println("nameSpelled = " + nameSpelled);

    }

    public static String getSpelledName2(String name) {

        String result = "";

        for (int i = 0; i < name.length() - 1; i++) {
            result += name.charAt(i)+"-";
        }

        return result + name.charAt(name.length()-1);
    }


    }

