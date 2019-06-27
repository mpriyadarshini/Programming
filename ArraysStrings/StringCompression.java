import java.util.*;

public class StringCompression {

    public static String IsCompress(String string) {

        char current = string.charAt(0);
        int count = 0;

        String output = "";

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);

            if (current == ch) {
                count++;
            } else {
                output = output + current;
                if (count > 1) {
                    output += count;
                }

                count = 1;
                current = ch;

            }
        }

        // handling last character
        output = output + current;

        if (count > 1) {
            output += count;
        }

        return output;
        // return output.length() < string.length() ? output : string;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        String r = IsCompress(str);
        System.out.println(r);
    }
}