/*Kreirati dva niza cijelih brojeva - velicna im je jednaka i definira je korisnik na pocetku.
        Korisnik unosi elemente oba niza.

        Napraviti funkcije: zbrajanje i oduzimanje
        Funkcijama se prosljeðuju oba niza. U funkcijama se radi zbrajanje (oduzimanje) nizova i ispis.

        Primjer:
        a[3] ={2,3,4}
        b[3]={1,3,5}
        Zbrajanje: a[]+b[] => ispis: 3, 6, 9
        Oduzimanje: a[]-b[] => ispis: 1, 0, -1*/

package learningjava.algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class DvaNiza {
    public static void main(String[] args) {

        int [] prviNiz;
        int [] drugiNiz;
        int i;

        Scanner scanner = new Scanner(System.in);
        //unos veličine prvog niza
        System.out.println("Unesi veličinu nizova (cijeli broj):");
        prviNiz = new int[scanner.nextInt()];
        System.out.println("Veličina nizova je: " + prviNiz.length);

        //unos brojeva prvog niza
        System.out.println("Unesi " + prviNiz.length + " broja:");

        //za brojeve manje od veličine prvog niza, element prvog niza je scanner.nextInt()
        for (i=0; i<prviNiz.length; i++) {
            prviNiz[i] = scanner.nextInt();
        }
        System.out.println("Prvi niz: " + Arrays.toString(prviNiz));

        //unos brojeva drugog niza
        System.out.println("Unesi brojeve drugog niza" + "(" + prviNiz.length + "):");

        drugiNiz = new int[prviNiz.length];
        //za brojeve manje od veličine prvog niza, element drugog niza je scanner.nextInt()
        for (i=0; i<prviNiz.length; i++) {
            drugiNiz[i] = scanner.nextInt();
        }
        System.out.println("Drugi niz: " + Arrays.toString(drugiNiz));

        /*provjera da li je isti length:
        System.out.println(prviNiz.length);
        System.out.println(drugiNiz.length);*/

        //nizZbrojeva
        int nizZbrojeva[] = new int [prviNiz.length];
        for (i=0; i<prviNiz.length; i++){
            nizZbrojeva[i] = sum(prviNiz[i], drugiNiz[i]);
        }
        System.out.println("Zbrajanje: " + Arrays.toString(nizZbrojeva));

        //nizOduzimanja
        int nizOduzimanja[] = new int [prviNiz.length];
        for (i=0; i<prviNiz.length; i++){
            nizOduzimanja[i] = substract(prviNiz[i], drugiNiz[i]);
        }
        System.out.println("Oduzimanje: " + Arrays.toString(nizOduzimanja));
    }


    //sum
    public static int sum(int a, int b){
        return a+b;
    }

    //substract
    public static int substract(int a, int b){
        return a-b;
    }
}
