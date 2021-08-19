package learningjava;

import java.util.Scanner;

public class SpeedingTicket {
    public static void main(String[] args){

        Scanner myscanner = new Scanner(System.in);

        System.out.println("Your speed is?");
        int input = Integer.valueOf(myscanner.nextLine());

        if (input>130 && input<200) {
            System.out.println("Speeding ticket!");
        } else if (input>200) {
            System.out.println("Oh man!");
        } else {
            System.out.println("Thank you, sir! Have a nice day!");
        };
    }
}
