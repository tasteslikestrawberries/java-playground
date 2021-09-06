
//Omoguci unos 10(za test 3) ocjena izmedju 1 i 5
//Napravi izracun prosjecne ocjene i ispisi ga
package learningjava;

import java.util.Scanner;

public class OcjeneTryout {
    public static void main(String[] args) {
        int ocjena;
        final int brojOcjena = 3;
        int zbroj = 0;
        double prosjek;
        int i = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite ocjene:");

        do{
            ocjena = scanner.nextInt();
            if (ocjena < 0 || ocjena > 5) {
                System.out.println("Ocjena mora biti između 1 i 5");
                continue;
            }

            System.out.println("Unijeli ste ocjenu: " + ocjena );
            zbroj += ocjena;
            i++;
        } while (i < brojOcjena);


        prosjek = zbroj / brojOcjena;
        System.out.println("Prosjek ocjena je " + prosjek);
    }
}
