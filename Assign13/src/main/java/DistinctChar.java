import java.util.HashMap;
import java.util.Map;

public class DistinctChar {
    public static void main(String[] args) {
        String s = "test string";
        DistinctChar(s);
    }

    public static void DistinctChar(String str) {
        Map<Character, Integer> Count = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            Count.put(c, Count.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : Count.entrySet()) {
            System.out.println(entry.getKey() + "  "+ entry.getValue());
        }
    }
}
