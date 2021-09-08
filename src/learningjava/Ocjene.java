
//Omoguci unos 10 ocjena izmedju 1 i 5
//Napravi izracun prosjecne ocjene i ispisi ga

package learningjava;

import java.util.Scanner;

public class Ocjene {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite 10 ocjena:");

        //int [] arrayOcjena = new int[10];
        int ocjena;
        final int brojOcjena = 3;
        int sum = 0;
        int i = 0;

        do {
            ocjena = scanner.nextInt();
            if ( ocjena < 0  || ocjena > 5) {
                System.out.println("Ocjena mora biti između 1 i 5");
                continue; //prekida daljnje izvrsavanje koda od continue do kraja petlje (trenutne iteracije) i ponavlja petlju do
            }
            System.out.println("Unijeli ste ocjenu: " + ocjena);
            sum += ocjena;
            i++; //broji unos ocjene (koliko puta)
        } while (i<brojOcjena);

        System.out.println("Zbroj ocjena je: " + sum);
        double prosjek = sum / brojOcjena;
        System.out.println("Prosjek ocjena je: " + prosjek);
    }
}