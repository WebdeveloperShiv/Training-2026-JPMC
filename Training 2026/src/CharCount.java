import java.util.HashMap;
import java.util.Map;

public class CharCount {
    public static void main(String[] args) {
        String text = "hello world";
        Map<Character, Integer> counts = new HashMap<>();

        for (char c : text.toCharArray()) {
            //if (c == ' ') continue;   // skip spaces
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> e : counts.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}