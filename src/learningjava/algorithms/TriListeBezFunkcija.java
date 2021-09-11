//napravi listu u koju se unosi 10 brojeva
//napravi funkcije lista_parni i lista_neparni (parni/neparni brojevi iz pocetne liste)
//ispisi sve 3 liste
package learningjava.algorithms;

import java.util.Scanner;

public class TriListeBezFunkcija {
    int input;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        int[] numbers = new int[10];

        System.out.println("Unesi brojeve: ");
        do {
            input = scanner.nextInt();

        } while(input < numbers.length);

        System.out.println("Brojevi su: ");
        for (int i = 1; i <= input; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n"); //line break
        System.out.println("Parni brojevi su: ");
        for (int i = 1; i <= input; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }

        System.out.println("Neparni brojevi su: ");
        for (int i = 1; i <= input; i++) {
            if (i % 2 != 0)
                System.out.println(i);
        }

    }

}
