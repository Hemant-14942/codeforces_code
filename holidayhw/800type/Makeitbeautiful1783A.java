import java.util.*;

public class Makeitbeautiful1783A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int c = 0;
            int temp;
            int max = 0;
            int sum = 0;
            int n = scan.nextInt();
            scan.nextLine();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
                if (a[i] > max) {
                    max = a[i];
                    c = i;
                }
            }
            if (c > 0) {
                for (int j = 0; j < n - 1; j++) {
                    sum += a[j];
                    if (sum == a[j + 1]) {
                        temp = a[0];
                        a[0] = a[c];
                        a[c] = temp;
                        ;
                        break;
                    }
                }
                System.out.println("Yes");
                for (int nums : a) {
                    System.out.print(nums + " ");
                }
                System.out.println();
            } else {
                System.out.println("No");
            }
        }
    }
}