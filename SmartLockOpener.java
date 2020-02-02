package day018;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class SmartLockOpener {

    public static void main(String[] args) {

        // smart lock door has password
        // unless you enter correct password
        // it keep locking you out
        // assuming correct password is B15
        // keep asking until user enter correct one

        Scanner scan = new Scanner(System.in);
        System.out.println("KNOCK KNOCK!!");
        System.out.println("WHAT IS THE PASSWORD ? ");


        String password = scan.next();

        while ( ! password.equals("B15")) {
            System.out.println("WRONG PASSWORD!! TRY AGAIN");
            password = scan.next();
        }

        System.out.println(" WELCOME ");



    }
}
