import java.util.*;

public class Arraycoloring1857A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int a[] = new int[n];
            int odd = 0;
            int even = 0;
            int sum = 0;
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
                sum += a[i];
                if ((a[i] % 2) == 0) {
                    even = a[i];
                } else {
                    odd = a[i];
                }
            }
            if ((sum - odd) % 2 != 0 || (sum - even) % 2 == 0) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

        }
    }
}