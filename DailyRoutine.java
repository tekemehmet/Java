package day031;

public class DailyRoutine {

    public static void wakeUp(){

        System.out.println("Open your eyes");
        System.out.println("Close your eyes");
        System.out.println("Heat your alarm? open it again! " );
        System.out.println("----------------------------");

    }

    public static void drinkCoffee(){

        System.out.println("Put coffee in your cofee machine");
        System.out.println("Pres the button Make your coffe");

    }
    public static void prepKidsForSchool(){

        System.out.println("Wake them up for 10 times");
        System.out.println("Eat with them");
        System.out.println("-------------------------");
    }

    public static void takeThemToSchool(){

        System.out.println("Take them to school bus ");
        System.out.println("Say good bye!!!");
        System.out.println("------------------");
    }

    public static void studyJava(){

        System.out.println("Think about Java");
        System.out.println("Study Java");
        System.out.println("-------------------------");
    }

    public static void sayILoveJava300Times() {

        for (int i = 0; i < 300; i++) {
            System.out.print("I love Java | ");

        }
    }

    public static void main(String[] args) {
        wakeUp();
        drinkCoffee();
        prepKidsForSchool();
        takeThemToSchool();
        studyJava();
        sayILoveJava300Times();

        /*
        wakeUp
        drinkCoffee
        prepKidsForSchool
        takeThemToSchool
        goToWork
        groceryShopping
        cooking
        studyJava
        goToStep
         */
    }
}
