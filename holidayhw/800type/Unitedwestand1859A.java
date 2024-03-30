import java.util.*;

public class Unitedwestand1859A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        scan.nextLine();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            ArrayList<Integer> b = new ArrayList<>();
            ArrayList<Integer> c = new ArrayList<>();
            int flag = 0;
            for (int i = 0; i < n; i++) {

                a[i] = scan.nextInt();
            }
            Arrays.sort(a);
            b.add(a[0]);
            for (int i = 1; i < n; i++) {
                if (a[i] == a[0]) {
                    b.add(a[i]);
                } else {
                    c.add(a[i]);
                    flag = 1;
                }
            }
            if (flag == 0) {
                System.out.println(-1);
            } else {
                System.out.println(b.size() + " " + c.size());
                for (int bans : b) {
                    System.out.print(bans + " ");
                }
                System.out.println(" ");
                for (int cans : c) {
                    System.out.print(cans + " ");
                }
                System.out.println(" ");

            }

        }
    }
}