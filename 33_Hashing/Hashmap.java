import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // insert - O(1)
        map.put("USA", 50);
        map.put("China", 150);
        map.put("Russia", 120);
        map.put("India", 100);

        System.out.println(map);

        // size - O(1)
        System.out.println(map.size());

        // search - O(1)
        System.out.println(map.get("India"));
        System.out.println(map.get("Indonesia")); // null

        // update - O(1)
        map.put("India", 1000);
        System.out.println(map.get("India"));

        // delete - O(1)
        map.remove("Russia");
        System.out.println(map);

        // contains - O(1)
        System.out.println(map.containsKey("Russia"));

        // iterate - O(n)
        Set<String> keys = map.keySet();

        for (String key : keys) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}