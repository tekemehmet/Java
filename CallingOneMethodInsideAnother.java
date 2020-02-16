package day031;

public class CallingOneMethodInsideAnother {

    public static void main(String[] args) {

        finallyAwake();

    }

    public static void finallyAwake() {

        wakeUp();
        drinkCoffee();
    }

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

}
