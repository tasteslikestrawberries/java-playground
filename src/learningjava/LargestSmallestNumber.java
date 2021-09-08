package learningjava;

import java.util.Scanner;

public class LargestSmallestNumber {
    public static void main(String[] args) {

                try (Scanner in = new Scanner(System.in)) {
                    System.out.print("Please enter numbers:(Enter , to stop)");
                    double largest = in.nextDouble();
                    double smallest = largest;
                    while (in.hasNextDouble()) {
                        double input = in.nextDouble();
                        largest = Math.max(largest, input);
                        smallest = Math.min(smallest, input);
                    }
                    System.out.println("Smallest Value is " + smallest);
                    System.out.println("Largest Value is " + largest);
                } catch (Exception e) {
                }


    }
}
