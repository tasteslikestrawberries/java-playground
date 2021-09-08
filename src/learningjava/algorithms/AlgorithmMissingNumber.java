package learningjava.algorithms;

import java.util.Arrays;

public class AlgorithmMissingNumber {
    public static void main(String[] args) {

        int[] numbersArray = {6, 3, 2, 4, 1};
        Arrays.sort(numbersArray);
        System.out.println("Missing Number is:" + getMissingNumber(numbersArray));
    }

        private static Integer getMissingNumber(int[] numbersArray) {
            Integer missingNumber = null;
            for (int i = 0; i < numbersArray.length; i++) {
                int index = i + 1;
                if (numbersArray[i] != index) {
                    missingNumber = index;
                    break;
                }
            }
            return missingNumber;
        }

}
