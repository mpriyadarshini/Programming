import java.util.*;

public class OneAway {

    public static boolean combination(String s1, String s2) {
        if (s1.length() == s2.length()) {
            return replace(s1, s2);
        } else if (s1.length() + 1 == s2.length()) {
            return edit(s1, s2);
        } else if (s1.length() == s2.length() + 1) {
            return edit(s2, s1);
        }
        return false;
    }

    public static boolean replace(String first, String second) {
        boolean foundDifference = false;
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)) {
                if (foundDifference) {
                    return false;
                }
                foundDifference = true;
            }
        }
        return true;
    }

    public static boolean edit(String first,String second){
        int index1 = 0;
        int index2 = 0;
        while(index1 < first.length() && index2 < second.length()){
            if(first.charAt(index1) != second.charAt(index2)){
                if(index1 != index2){
                    return false;
                }
                index2++;
            }
            else{
                index1++;
                index2++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = s.next();
        String str2 = s.next();
        System.out.println(combination(str1, str2));
    }
}