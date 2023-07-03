import java.util.HashMap;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String s = "welcomee";
        String result = removeDuplicate(s);
        System.out.println(result);
    }

    public static String removeDuplicate(String str) {
        HashMap<Character, Integer> count = new HashMap<>();
        for (char c : str.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (count.get(c) == 1) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
