package questions;

import java.util.HashMap;
import java.util.Map;

/**
 * @author SanketKalode
 * @date 06-06-2024
 */
public class HashMapsQue {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put(null,"ravi");
        map.put(null,"raj");

        map.put("Name","Max");
        map.put("Name","Mary");

        System.out.println(map);

        System.out.println(map.keySet());
        System.out.println(map.entrySet());
    }
}
