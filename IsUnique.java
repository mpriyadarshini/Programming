import java.util.*;

public class IsUnique{
   public static boolean unique(String str){
       boolean result=false;
       for(int i=0;i<str.length();i++){
           for(int j=i+1;j<str.length();j++){
               if(str.charAt(i)==str.charAt(j)){
                   result=false;
               }
               else{
                   result=true;
               }
           }
       }
       return result;

   }
   public static void main(String[] args) {
       
       Scanner s = new Scanner(System.in);
       String input = s.next();
       System.out.println("The string is:"+unique(input));
   }

}