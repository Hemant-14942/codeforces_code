import java.util.*;

class Goalsofvictory1877A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n - 1];
            int c = 0;
            for (int i = 0; i < n - 1; i++) {
                a[i] = scan.nextInt();
            }
            for (int i = 0; i < n - 1; i++) {
                c += a[i];
            }
            System.out.println(-c);
        }
        scan.close();
    }
}