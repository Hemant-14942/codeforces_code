import java.util.*;

public final class Howmuchdantoycost1878A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int a[] = new int[n];
            int flag = 0;
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            for (int j = 0; j < n; j++) {
                if (k == a[j]) {
                    flag = 1;
                    System.out.println("yes");
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("no");
            }

        }
        scan.close();
    }
}