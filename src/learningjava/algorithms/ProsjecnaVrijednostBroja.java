//omoguci unos nekoliko realnih brojeva (korisnik definira kolicinu)
//isprintaj prosjecnu vrijednost unesenih brojeva
//nadji najmanju vrijednost
//nadji najvecu vrijednost

package learningjava.algorithms;

import java.util.Scanner;

public class ProsjecnaVrijednostBroja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0.0;
        double largest = Double.MIN_VALUE; //defaultni min value od doublea (tog tipa)
        //// (uzima se kao startna pozicija u slucaju da largest jos nije dodijeljena vrijednost)
        double smallest = Double.MAX_VALUE; ////defaultni max value od doublea (tog tipa)
        int i = 0;

        System.out.println("Unesi brojeve. Za kraj upisa i izračun prosječne vrijednosti upiši \"END\".");

        //dok postoji input
        while (scanner.hasNext()){
            //hasNextDouble() returns true if the next token in this scanner’s input can be assumed as a Double value
            if(scanner.hasNextDouble()){
                double input = scanner.nextDouble();   //saving double in input and deletes it from scanner (NOT FROM INPUT!)
                //now scanner is empty
                sum += input;       //saves input to sum
                largest = Math.max(largest, input); //largest je veci od (Math.max) najveceg dotad unesenog i trenutnog inputa
                smallest = Math.min(smallest, input);//smallest je manji od (Math.min) najmanjeg dotad unesenog i trenutnog inputa
                i++; //broji koliko puta je user dao broj
            }
            else{
                String end = scanner.nextLine();
                if (end.equals("END")){
                    break;
                }
            }

        }

        double average = sum / i;
        System.out.println("Average is: " + average);
        System.out.println("Smallest Value is " + smallest);
        System.out.println("Largest Value is " + largest);
    }

}
