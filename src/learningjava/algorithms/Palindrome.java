package learningjava.algorithms;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ask = "Enter word to check for palindrome:";
        String input;


            do {
                System.out.println(ask);
                input = scanner.nextLine();

                if (isPalindrome(input))
                    System.out.print("Yes, " + input.toUpperCase() + " is a palindrome!");
                else
                    System.out.print(input.toUpperCase() + " is not a palindrome.");
            } while(!isPalindrome(input));

    }

    static boolean isPalindrome(String input){
 
        // Pointers pointing to the beginning and the end of the string
        int i = 0, j = input.length() - 1;
 
        // While there are characters to compare
        while (i < j) {
 
            // If there is a mismatch / letters are not same
            if (input.charAt(i) != input.charAt(j))
                return false;
 
            // Increment first pointer and decrement the other
            i++;
            j--;
        }
 
        // Given string is a palindrome
        return true;
    }

}
