
package learningjava;

public class Playground {
    //example for method overloading when finding square of a number (same method name, different params type)
    //The Java compiler itself performs the appropriate Method Call for an object, based on
    // the Data Type of the Arguments of the Methods.
    public static void Square (int number) {
        int square = number * number;
        System.out.println("Square equals:" + square); 
    }

    //finding square of a double
    public static void Square (double number) {
        double square = number * number;
        System.out.println("Square equals:" + square);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////

    public static void getUppercaseWord (String word) {

        System.out.println(word.toUpperCase());
    }

    public static void getLowercaseWord (String word) {
        System.out.println(word.toLowerCase());
    }



}