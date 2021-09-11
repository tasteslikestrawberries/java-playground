//napravi listu u koju se unosi 10 brojeva
//napravi funkcije lista_parni i lista_neparni (parni/neparni brojevi iz pocetne liste)
//ispisi sve 3 liste
package learningjava.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TriListe {
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesi brojeve: ");

        for(int i=0; i < 10; i++){
            lista.add(scanner.nextInt());
        }
        System.out.println(lista);


        //create object that is the instance of this - class so we can call the non static methods
        TriListe triliste = new TriListe();
        //call instance method using object
        triliste.parniBrojevi(lista);
        triliste.neparniBrojevi(lista);

    }

    public Integer parniBrojevi(List<Integer> listname) {
        System.out.println("Parni brojevi su: ");
        for (Integer number : listname) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
        return null;
    }

    public Integer neparniBrojevi(List<Integer> listname) {
        System.out.println("Neparni brojevi su: ");
        for (Integer number : listname) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }
        return null;
    }


}
