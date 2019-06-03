import java.util.*;

// Input:GeeksforGeeks 
// Output: f
public class FirstNonRepeating {

    public static void nonRepeating(String a) {

        char c[] = a.toCharArray();
        Map<Character, Integer> m = new HashMap<>();
        int count = 0;

        // Build character frequency table
        for (char ch : c) {
            if (m.containsKey(ch)) {
                count = m.get(ch);
                m.put(ch, count + 1);
            } else {
                m.put(ch, 1);
            }
        }

        // Find character with frequency 1
        for (char h : c) {
            if (m.get(h) == 1) {
                System.out.println(h);
                break;
            }
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.next();
        nonRepeating(s1);
    }
}