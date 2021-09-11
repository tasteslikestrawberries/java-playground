//program ispisuje pozdravne poruke u zadanim vremenskim intervalima
// 06:00h - 12:00h "Dobro jutro"
// 12:00h - 18:00h "Dobar dan"
// 18:00h - 22:00h "Dobra večer"
// 22:00h - 06:00h "Spavaj"

package learningjava.algorithms;

import java.time.LocalDateTime;
/*LocalTime now = LocalTime.now();
   System.out.println(now);
*/

public class GreetTime {
    public static void main(String[] args) {

            LocalDateTime currentDateTime = LocalDateTime.now();
            int hour = currentDateTime.getHour();
            System.out.println("Sad je " + hour + " sati");

            if ( hour > 6 && hour < 12) {
                System.out.println( "Dobro jutro :)" );
            } else if ( hour > 12 && hour < 18  ) {
                System.out.println( "Dobar dan :)" );
            } else if ( hour > 18 && hour < 22 ) {
                System.out.println( "Dobra večer :)" );
            } else {
                System.out.println( "Spavaj *_*" );
            }


    }
}


