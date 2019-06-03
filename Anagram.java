import java.util.*;

public class Anagram{

    public static boolean anagram(String a,String b){
        char s1[] = a.toLowerCase().toCharArray();
        char s2[] = b.toLowerCase().toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);
        return Arrays.equals(s1, s2);

        

        
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.next();
        String s2 = s.next();
        boolean b = anagram(s1,s2);
        System.out.println(b);
    }
}