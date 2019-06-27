import java.util.*;

public class Urlify{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(str.trim().replaceAll("\\s", "%20"));
    }
}