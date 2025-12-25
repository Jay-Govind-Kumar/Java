import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedandTreeHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 150);
        lhm.put("USA", 50);
        lhm.put("China", 200);

        System.out.println(lhm);

        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 150);
        tm.put("USA", 50);
        tm.put("China", 200);

        System.out.println(tm);
    }
}
