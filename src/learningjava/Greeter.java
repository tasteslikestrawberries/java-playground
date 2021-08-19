package learningjava;
// importing the scanner tool used for reading user input
import java.util.Scanner;

public class Greeter {

    public static void main(String[] args) {
        //creating new instance of type class Scanner named scanner
        Scanner scanner = new Scanner(System.in);
        //output/greets user (could do it as a string literal too)
        String question = "Hello, what's your name?";
        System.out.println(question);
        //call method that waits for user input and reads it
        String readsUserInput = scanner.nextLine();
        //prints read user input
        System.out.println("Hi " + readsUserInput + ", nice to meet you!");

        //keeping the conversation going
        System.out.println("What is your favorite fruit?");
        String readsUserInputNext = scanner.nextLine();
        System.out.println("Oooh, I like " + readsUserInputNext.toLowerCase() + " too!");


        System.out.println("And what is your favorite vegetable?");
        String message = scanner.nextLine();
        //if (message.equals("potato")) {
        if (message.endsWith("s"))  {
            System.out.println("Cool, " + message.toLowerCase() + " are delicious!");
        } else  {
            System.out.println("Cool, " + message.toLowerCase() + " is delicious!");
        }

    }
}

/*
package learningjava;

import java.util.Scanner;

public class LearnScanner {

    public static void main(String[] args) {
        // Create a tool for reading user input and name it scanner
        Scanner scanner = new Scanner(System.in);

        // Print "Write a message: "
        System.out.println("Write a message: ");

        // Read the string written by the user, and assign it
        // to program memory "String message = (string that was given as input)"
        String message = scanner.nextLine(); //https://www.geeksforgeeks.org/scanner-nextline-method-in-java-with-examples/

        // Print the message written by the user
        System.out.println("You wrote: " + message);
    }
}
 */