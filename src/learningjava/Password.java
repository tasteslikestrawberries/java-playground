package learningjava;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Password:");
        String input = reader.nextLine();
        if (input.equals("Alohomora")) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong password.");
        }

    }
}