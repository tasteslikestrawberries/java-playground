package learningjava;

public class RecursionExample {
    public static void main(String[] args) {
        callMyself(9);

        String word = "Blue Bayou ";
        String reverseWord= reverseWord(word);
        System.out.println(reverseWord);
    }
    /* The recursive Java method */
    public static void callMyself(long i) {
        if (i < 0) {
            return; //stops the program
        }
        System.out.print(i); //prints the number
        i = i - 1; //subtracts 1 from number and then calls itself again until 0 is reached:
        callMyself(i);
    }


    //Reverse string with recursion (just for recursion learning purposes, otherwise StringBuilder reverse is way to go!)
    public static String reverseWord(String word) {
        if (word.isEmpty()){
            return word;
        }
        //Calling function recursively
        return reverseWord(word.substring(1)) + word.charAt(0);
    }

}
