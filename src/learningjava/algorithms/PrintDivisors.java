package learningjava.algorithms;

import java.util.Scanner;

public class PrintDivisors {
    public static void main(String[] args) {
        System.out.println("Enter number:");

        // Create Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Read an int
        int input = scanner.nextInt();
        for(int i=1; i <= input; i++)
        {

            // If remainder is 0 when 'n' is divided by 'i',
            if(input % i == 0)
            {
                System.out.print(i+", ");
            }
        }

        // Print [not necessary]
        System.out.print("are divisors of "+ input);
    }
}
