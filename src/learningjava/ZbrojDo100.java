//Unositi brojeve sve dok njihov zbroj ne doðe do 100.
//Nakon toga napraviti ispis zbroja.

package learningjava;

import java.util.Scanner;

public class ZbrojDo100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int i= 0;
        System.out.println("Unesi brojeve:");

        do {
            int input = scanner.nextInt();
            sum += input;

            if(sum>100) {
                System.out.println("Zbroj je veći od 100.");
                continue;
            }

            i++;

        } while (sum<100);


    }
}
