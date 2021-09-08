//ommoguci unos dvoznamenkastog broja
//ako nije dvoznamenkast trazi ponovni unos
//unos radi sve dok se ne unese 0
//isprintaj djelitelje
package learningjava.algorithms;

import java.util.Scanner;

public class Divisorsof2DigitNumber {
    public static void main(String[] args) {

        int input;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesi dvoznamenkasti broj ili unesi 0 za završetak programa.");
        do {
            input = scanner.nextInt();

            if (input == 0) {
                return;
            }
            if (input < 10  ||   input > 99) {
                System.out.println("Broj mora biti dvoznamenkasti.");
                continue;
            }


            for(int i=1; i <= input; i++)
            {
                // If remainder is 0 when 'n' is divided by 'i',
                if(input % i == 0) {
                    System.out.print(i+", ");
                }
            }
            System.out.print("su djelitelji broja " + input);

            //return;
        } while (true);

    }
}
