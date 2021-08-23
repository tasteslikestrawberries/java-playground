package learningjava;

import java.util.HashMap;

public class NicknameMap {
    public static void main(String[] args) {
        HashMap<String, String> nicknameMap = new HashMap<>();
        nicknameMap.put("Ted", "Teddy");
        nicknameMap.put("Lana", "Laney");
        nicknameMap.put("Thomas", "Tommy");
        nicknameMap.put("Barbara", "Barbie");

        System.out.println(nicknameMap.get("Lana"));
        System.out.println(nicknameMap.get("Thomas"));
        System.out.println(nicknameMap.get("Ted"));

        nicknameMap.forEach((key,value) -> System.out.println(key + " = " + value));

        nicknameMap.remove("Ted");
        System.out.println("Ted is removed");
        nicknameMap.forEach((key,value) -> System.out.println(key + " = " + value));

    }
    
}
