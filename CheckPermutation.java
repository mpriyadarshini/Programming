import java.util.*;

public class CheckPermutation {
    public static boolean permutation(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        if (n1 != n2)
            return false;
        char c1[] = s1.toCharArray();
        char c2[] = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        for (int i = 0; i < n1; i++) {
            if (c1[i] != c2[i])
                return false;
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = s.next();
        String str2 = s.next();
        if (permutation(str1, str2)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}