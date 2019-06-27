import java.util.*;

public class StringRotation {

    public static boolean IsRotation(String str1, String str2) {
        String result = str1 + str1;
        if (str1.length() == str2.length() && result.contains(str2)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String s2 = s.nextLine();
        System.out.println(IsRotation(s1, s2));
    }
}