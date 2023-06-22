import java.util.HashMap;
import java.util.Map;

public class DistinctChar {
    public static void main(String[] args) {
        String input = "test string";
        printDistinctCharacters(input);
    }

    public static void printDistinctCharacters(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }
}
