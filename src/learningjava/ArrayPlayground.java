package learningjava;

public class ArrayPlayground {

    public static void main(String args[]) {
    /*int i;
      for (i=0; i<10; i++) {
          System.out.println(i);
      }*/

        int i;
        int[] myNumbers = {1,2,3,4,5};

        System.out.println("This is no1: " + myNumbers[0]);
        for (i=1; i<myNumbers.length; i++){
            System.out.println(myNumbers[i]);
        }
    }
}
