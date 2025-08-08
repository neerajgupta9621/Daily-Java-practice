package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class TestingMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Neeraj", 1);
        map.put("Aman", 3);
        map.put("Sachan", 19);
        map.put("Ankit", 20);
        System.out.println(map);
        System.out.println(map.containsKey("Neeraj"));
        System.out.println(map.size());
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.get("Aman"));
        System.out.println(map.entrySet());
        System.out.println(map.containsValue("Mala"));
        System.out.println(map.hashCode());
        System.out.println(map.replace("Ankit", 5));
        System.out.println(map.remove("Aman"));
        System.out.println(map.size());
        System.out.println(map);


    }
}
