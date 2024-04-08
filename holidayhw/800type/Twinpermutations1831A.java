import java.util.*;

public class Twinpermutations1831A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            scan.nextLine();
            int max = 0;
            int min = 101;
            int sum = 0;
            ArrayList<Integer> b = new ArrayList<>();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
                if (a[i] < min) {
                    min = a[i];
                }
                if (a[i] > max) {
                    max = a[i];
                }
            }
            sum = max + min;
            for (int j = 0; j < n; j++) {
                b.add(sum - a[j]);
            }

            for (int nums : b) {
                System.out.print(nums + " ");
            }
            System.out.print(" ");

        }
    }
}
