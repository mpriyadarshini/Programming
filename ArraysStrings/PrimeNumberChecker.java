import java.util.*;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int p, q = 0;
        int r;
        p = prime(arr);
        r = reverse(arr);
        q = prime(r);
        for (int i = 0; i < n; i++) {
            if (p == 0 && q == 0) {
                System.out.println(arr[i]);
            }
        }

    }

    public static int reverse(int[] m) {
        int number = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i] != 0) {
                int rem = m[i] % 10;
                number = number % 10 + rem;
                m[i] = m[i] / 10;
            }
        }
        return number;
    }

    public static int prime(int a[]) {
        int result = 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                result = 1;
            } else if (a[i] % i == 0) {
                result = 0;
            }

        }
        return result;

    }
}