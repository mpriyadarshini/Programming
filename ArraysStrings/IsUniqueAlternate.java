import java.util.*;

public class IsUniqueAlternate{
    public static boolean unique(String str){
       boolean result = false;
        HashSet <Character> hm = new HashSet<>();
        for(int i=0;i<str.length();i++){
            result = hm.add(str.charAt(i));
            if(!result){
                return false;
        }
    }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        System.out.println("the string is:"+unique(input));
    }
}
