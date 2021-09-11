//napisati program koji za uneseni broj ispisuje sve parne brojeve od 1 do tog broja
//unos brojeva se radi sve dok se ne unese -1

package learningjava.algorithms;

import java.util.Scanner;

public class ParniBrojevi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input;

       System.out.println("Unesi broj:");

       do {

           input = scanner.nextInt();
           if (input != -1) {
               System.out.println("Parni brojevi su: ");
           }
           for (int i = 1; i <= input; i++) {
               if (i % 2 == 0)
                   System.out.println(i);
           }

       } while (input != -1);


    }
}
