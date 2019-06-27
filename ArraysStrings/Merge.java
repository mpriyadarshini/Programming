import java.util.*;

public class Merge {

    public static int[] merge(int m1[], int m2[]) {
        int length = m1.length + m2.length;
        int c[] = new int[length];
        int i = 0;
        for (int a : m1) {
            c[i++] = a;
        }
        for (int b : m2) {
            c[i++] = b;
        }
        return c;
    }

    public static boolean duplicates(int a[]) {
        HashSet<Integer> hm = new HashSet<>();
       
        for (int i:a) {
            
            if (!hm.add(i)) {
                return false;
            } 
        }
        return true;

    }

    public static void main(String[] args) {

        int a1[] = { 1,2};
        int a2[] = { 3,4};
        int merge[] = merge(a1, a2);
        Arrays.sort(merge);
        boolean result = duplicates(merge);
        System.out.println(result);
    }
}