package learningjava.algorithms;

import java.util.Scanner;

public class PrintReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Upiši riječ:");
            String input = scanner.nextLine();
            String reverse = new StringBuilder(input).reverse().toString();
            System.out.println(reverse);
        }

    }
}
