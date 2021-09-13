//program omogucuje unos naziva artikla, kolicine i jedinicne cijene
//korisnik unosi ukupno 3 artikla
//napravi funkciju izracunaj_ukupno
//nakon poziva funkcije, ispisi ispis iz obje liste

package learningjava.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Blagajna {
    public static void main(String[] args) {
        Blagajna blagajna = new Blagajna(); //creating object/instancing class so we can call non-static methods from this class

        System.out.println("(1) Unos artikla");
        System.out.println("(2) Izlaz");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        List<String> nazivArtikla = new ArrayList<>();
        List<Integer> količinaArtikla = new ArrayList<>();
        List<Double> cijenaArtikla = new ArrayList<>();

        if (input == 1) {

            do {

                System.out.println("Unesi naziv artikla:");
                scanner.nextLine();
                nazivArtikla.add(scanner.nextLine());

                System.out.println("Unesi količinu:");
                količinaArtikla.add(scanner.nextInt());

                System.out.println("Unesi cijenu:");
                cijenaArtikla.add(scanner.nextDouble());

            } while (nazivArtikla.size() != 3);

            System.out.println("Br. " + "Naziv" + "\t" + "Kol." + " " + " " + "Kn" + "\t" + " " + "Ukupno");
            System.out.println("--------------------------------------");
            //String.format("%.2f",double) -> zaokruzi double na dvije decimale
            System.out.println("1." + "\t" + nazivArtikla.get(0) + "\t" + količinaArtikla.get(0) + "\t" + " " + cijenaArtikla.get(0) + "\t" + " " + String.format("%.2f",blagajna.ukupnaCijenaArtikla(količinaArtikla.get(0), cijenaArtikla.get(0))));
            System.out.println("2." + "\t" + nazivArtikla.get(1) + "\t" + količinaArtikla.get(1) + "\t" + " " + cijenaArtikla.get(1) + "\t" + " " + String.format("%.2f",blagajna.ukupnaCijenaArtikla(količinaArtikla.get(1), cijenaArtikla.get(1))));
            System.out.println("3." + "\t" + nazivArtikla.get(2) + "\t" + količinaArtikla.get(2) + "\t" + " " + cijenaArtikla.get(2) + "\t" + " " + String.format("%.2f",blagajna.ukupnaCijenaArtikla(količinaArtikla.get(2), cijenaArtikla.get(2))));

        } //else return;

    }

    public double ukupnaCijenaArtikla (int a, double b ) { //metoda mora biti tipa double jer int*double vraca double(logicno!!!)
        return a * b;
    }
}
