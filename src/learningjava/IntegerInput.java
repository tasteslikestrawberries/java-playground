package learningjava;

import java.util.Scanner;

public class IntegerInput {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Write a value:");
        //The Integer.valueOf command converts a string to an integer.
        // It takes the string containing the value to be converted as a parameter.
        int userInputValue = Integer.valueOf(myScanner.nextLine());
        System.out.println("You wrote " + userInputValue);

        /*this won't work - The program should break as it doesn't know
        // how to convert non-numerical inputs into numbers.
        String userInputStringValue = Integer.valueOf(myScanner.nextLine());
        System.out.println("You wrote " + userInputStringValue);*/
    }
}
