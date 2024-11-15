package Module6;

import java.util.HashMap;
import java.util.Map;

public class HashMapMain {
    public static void main(String[] args) {
        Map<String, Integer> table = new HashMap<>();

        table.put("Hello", 3);

        System.out.println(table.get("Hello"));

        if (!table.containsKey("Point(1,0)")) {
            System.out.println(table.get("Point(1.0)"));
        }

        System.out.println(table.getOrDefault("Hello", Integer.MAX_VALUE));
    }
}
