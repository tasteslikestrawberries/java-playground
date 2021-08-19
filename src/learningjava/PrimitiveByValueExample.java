package learningjava;

public class PrimitiveByValueExample {

    public static void main(String[] args) {
        int homerAge = 30;
        changeHomerAge(homerAge);
        System.out.println(homerAge);
    }

    static void changeHomerAge(int homerAge) {
        homerAge = 35;
        System.out.println(homerAge);
    }

}