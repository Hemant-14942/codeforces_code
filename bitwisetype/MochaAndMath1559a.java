import java.util.*;

public class MochaAndMath1559a {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            int ans = a[0];
            for (int i = 0; i < n; i++) {
                ans &= a[i];
            }
            System.out.println(ans);

        }
    }
}
