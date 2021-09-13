package learningjava.algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class TwoArraySum {
    public static void main(String[] args) {

        // create Scanner class object
        Scanner scan = new Scanner(System.in);

        // take number of elements in both array
        System.out.print("Enter number of elements in arrays: ");
        int array1size = scan.nextInt();
        int array2size = array1size;

        // declare three array with given size
        int array1[] = new int[array1size];
        int array2[] = new int[array1size];
        int array3[] = new int[array1size];


        // take input for array1 elements
        System.out.println("Enter first array elements: ");
        for (int i=0; i<array1.length; i++) {
            array1[i] = scan.nextInt();
        }

        // take input for array2 elements
        System.out.println("Enter second array elements: ");
        for (int i=0; i<array2.length; i++) {
            array2[i] = scan.nextInt();
        }

        // loop to iterate through the array
        for (int i=0; i<array3.length; i++) {
            // add array elements
            array3[i] = array1[i] + array2[i];
        }

        // display the third array
        System.out.println("Resultant Array: "
                + Arrays.toString(array3));
    }
}
