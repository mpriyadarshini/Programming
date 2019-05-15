import java.util.*;

public class IsUnique {
    public static boolean unique(String str) {

        String str1 = str.toLowerCase();
        for (int i = 0; i < str1.length(); i++) {
            for (int j = i + 1; j < str1.length(); j++) {
                if (str1.charAt(i) == str1.charAt(j)) {
                    return false;
                }

            }
        }
        return true;

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String input = s.next();
        System.out.println("The string is:" + unique(input));
    }

}