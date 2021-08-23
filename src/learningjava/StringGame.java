package learningjava;

import java.util.Scanner;

public class StringGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.println("WELCOME TO STRING GAME");

            String[] commands = new String[]{ "1.Reverse a string", "2.Check for palindrome", "3.Exit" };
            for (String element : commands) {
                System.out.println(element);
            }

            System.out.println("Press a number");
            input = String.valueOf(scanner.nextLine());

            switch (input) {
                case "1":
                    System.out.println("Enter string to reverse: ");
                    input = String.valueOf(scanner.nextLine());
                    System.out.println(new StringBuilder(input).reverse());
                    break;
                case "2":
                    System.out.println("Enter string for palindrome check: ");
                    input = String.valueOf(scanner.nextLine());
                    String rev = (new StringBuilder(input)).reverse().toString();

                    //check if str is palindrome
                    if(input.equals(rev)) {
                        System.out.println(input.toUpperCase()+" is a palindrome!");
                    } else {
                        System.out.println(input.toUpperCase()+" is not a palindrome.");
                    }
                    break;
                case "3":
                    System.out.println("");
                    break;
                default:
                    System.out.println("Please enter numbers 1-2.");
            }
        } while(!input.equals("3"));
    }

}
