import java.util.*;

public class PalindromePermutation{

    public static boolean checkPermuation(String str){
        char arr[] = str.replaceAll("[\\s]", "").toLowerCase().toCharArray();
        Map<Character,Integer> map = new HashMap<Character,Integer>();

        for(char ch:arr){
            int count = 1;
            if(map.containsKey(ch)){
                count = map.get(ch);
                count++;
            }
            map.put(ch,count);
        }

        boolean foundOdd = false;
        for(char ch:map.keySet()){
            int value = map.get(ch);
            if(value % 2 ==1 ){
                if(foundOdd){
                    return false;
                }
                foundOdd = true;
            }
        }
        return true;

    }

    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(checkPermuation(str));
    }
}