package learningjava;

import java.util.HashMap;

public class NicknameMap {
    public static void main(String[] args) {
        HashMap<String, String> nicknameMap = new HashMap<>();
        nicknameMap.put("Anja", "Anoushka");
        nicknameMap.put("Lana", "Laney");
        nicknameMap.put("Thomas", "Tommy");
        nicknameMap.put("Barbara", "Barbie");

        System.out.println(nicknameMap.get("Lana"));
        System.out.println(nicknameMap.get("Thomas"));
        System.out.println(nicknameMap.get("Anja"));

    }
    
}
